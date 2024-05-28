package com.company.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.dto.Member;
import com.company.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {

	
	@Autowired
    private MemberService memberService;

    @Autowired
    private HttpSession session;
    
    @GetMapping("login.do")
    public String login(Model model) {
        return "member/login";
    }
    
    //public void loginPro(@RequestParam("id") String id, 
   // @RequestParam("pw") String pw, 
    //HttpServletResponse response) {
    
    
//    @PostMapping("loginPro.do")
//    public String loginPro(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model,
//    		RedirectAttributes rttr, HttpServletRequest request) {
//        Member member = memberService.getMember(id);
//        if (member == null) {
//            rttr.addFlashAttribute("msg", "존재하지 않는 아이디입니다.");
//            System.out.println("회원 정보를 찾을 수 없습니다.");
//            return "redirect:login.do";
//        }
//
//        // 로그인 시도 로그 추가
//        //System.out.println("로그인 시도 - 입력된 비밀번호: " + pw);
//        //System.out.println("로그인 시도 - 데이터베이스의 암호화된 비밀번호: " + member.getPw());
//        boolean loginSuccess = memberService.checkPassword(pw, member.getPw());
//
//        if (loginSuccess) {
//            HttpSession session = request.getSession(false);
//            if (session != null) {
//                session.invalidate();
//            }
//            session = request.getSession(true);
//            session.setAttribute("member", member);
//            session.setAttribute("sid", id);
//           // System.out.println("세션에 저장된 member: " + session.getAttribute("member"));
//            model.addAttribute("msg", "로그인 성공");
//            return "redirect:/";
//        } else {
//            rttr.addFlashAttribute("msg", "로그인 실패: 비밀번호가 일치하지 않습니다.");
//            return "redirect:login.do";
//        }
//    }
    
    @PostMapping("loginPro.do")  // 로그인 요청을 처리하는 메서드로, POST 요청을 받습니다.
    public void loginPro(@RequestParam("id") String id, @RequestParam("pw") String pw, HttpServletRequest request, HttpServletResponse response) {
        // 클라이언트로부터 전달받은 id와 pw를 사용하여 로그인 처리를 합니다.

        Member member = memberService.getMember(id);  // 입력된 id로 회원 정보를 조회합니다.

        try {
            if (member == null || !memberService.checkPassword(pw, member.getPw())) {
                // 회원 정보가 없거나 비밀번호가 일치하지 않는 경우 로그인 실패 처리

                response.setContentType("text/html; charset=UTF-8");  // 응답의 콘텐츠 타입을 설정합니다.
                PrintWriter out = response.getWriter();  // 응답을 작성할 PrintWriter를 가져옵니다.
                out.println("<script>");
                out.println("alert('로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다.');");
                // 경고창을 띄워 로그인 실패를 알립니다.
                out.println("window.location.href = '" + request.getContextPath() + "/member/login.do';");
                // 로그인 페이지로 리디렉션합니다.
                out.println("</script>");
                out.flush();
                return;  // 로그인 실패 시 메서드를 종료합니다.
            }

            HttpSession session = request.getSession(false);  // 기존 세션을 가져옵니다. 없으면 null 반환
            if (session != null) {
                session.invalidate();  // 기존 세션이 있으면 무효화합니다.
            }
            session = request.getSession(true);  // 새로운 세션을 생성합니다.
            session.setAttribute("member", member);  // 세션에 회원 정보를 저장합니다.
            session.setAttribute("sid", id);  // 세션에 사용자 ID를 저장합니다.
            session.setAttribute("sname", member.getName());
			session.setAttribute("smember", member);
			
            response.setContentType("text/html; charset=UTF-8");  // 응답의 콘텐츠 타입을 설정합니다.
            PrintWriter out = response.getWriter();  // 응답을 작성할 PrintWriter를 가져옵니다.
            out.println("<script>");
            out.println("window.opener.postMessage({ sid: '" + id + "' }, 'http://localhost:8091');");
            // 부모 창에 사용자 ID를 전송합니다.
            out.println("window.close();");
            // 현재 로그인 창을 닫습니다.
            out.println("</script>");
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();  // 예외 발생 시 스택 트레이스를 출력합니다.
        }
    }
    
    @GetMapping("join.do")
    public String join(Model model) {
    	return "member/join";
    }
    
    @PostMapping("join.do")
    public String joinPro(HttpServletRequest request, Model model, RedirectAttributes rttr) {
    	try {
            // Request parameters 가져오기
            String id = request.getParameter("id");
            String pw = request.getParameter("pw");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String birthString = request.getParameter("birth");
            String tel = request.getParameter("tel");
            String postcode = request.getParameter("postcode");
            String addr = request.getParameter("addr1") + " " + request.getParameter("addr2") ;

            // String을 Date로 변환
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date birth = dateFormat.parse(birthString);
            
            // 현재 날짜와 시간 설정
            Date regdate = new Date();
            
            // Member 객체 생성 및 설정
            Member member = new Member();
            member.setId(id);
            member.setPw(pw); // 비밀번호 암호화는 서비스 레이어에서 처리
            member.setName(name);
            member.setEmail(email);
            member.setBirth(birth); // 새로운 필드 추가
            member.setTel(tel);
            member.setPostcode(postcode);
            member.setAddr(addr);
            member.setRegdate(regdate); // 가입 날짜 설정
            member.setPoint("1000");	//point 기본
            // 회원가입 처리
            memberService.insMember(member);

            // 성공 메시지 설정
            rttr.addFlashAttribute("msg", "회원가입이 완료되었습니다. 다시 로그인 해주세요.");
            return "redirect:/";
    	 } catch (ParseException e) {
    	        e.printStackTrace();
    	        // 실패 시 에러 메시지 설정
    	        model.addAttribute("msg", "회원가입에 실패하였습니다. 생년월일 형식을 확인해주세요.");
    	        return "member/join";
    	    } catch (Exception e) {
    	        e.printStackTrace();
    	        // 실패 시 에러 메시지 설정
    	        model.addAttribute("msg", "회원가입에 실패하였습니다. 다시 시도해주세요.");
    	        return "member/join";
    	}
    }
    
    
    @RequestMapping("logout.do")
    public String logout(HttpSession session, Model model) {
        session.invalidate();
        model.addAttribute("message", "로그아웃 되었습니다.");
        return "redirect:/";
    }
    
}
