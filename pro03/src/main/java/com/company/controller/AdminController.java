package com.company.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.dto.Board;
import com.company.dto.Member;
import com.company.service.BoardService;
import com.company.service.InventoryService;
import com.company.service.MemberService;
import com.company.service.ProductService;
import com.company.service.SalesService;

@Controller
@RequestMapping("/admin/")
public class AdminController {

	private static final Logger log = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private ServletContext servletContext;

	@Autowired
	private HttpSession session;
		
	@Autowired
	private BoardService boardService;
		
	@Autowired
	private MemberService memberService;
	
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private InventoryService inventoryService;
	
	@Autowired
	private SalesService salesService;
	
	@GetMapping("adminHome.do")
	public String adminHome() {
		return "admin/adminHome.do";
	}
	
	//member
	@GetMapping("memberList.do")
	public String memberList(Model model) {
		List<Member> memberList = memberService.getMemberList();
		model.addAttribute(memberList);
		return "admin/member/memberList";
	}
	
	@GetMapping("delMember")
	public String delMember(@RequestParam("id") String id, Model model) {
		memberService.delMember(id);
		return "redirect:memberList.do";
	}
	
	//board
	@GetMapping("insBoard")
	public String insBoard(Model model) {
		model.addAttribute("board",new Board());
		return "admin/board/insBoard";
	}
	
	@PostMapping("insProBoard")
	public String insProBoard(Board board, Model model) {
		boardService.insBoard(board);
		return "redirect:/board/boardList.do";
	}
	
	@GetMapping("upBoard")
	public String upBoard(@RequestParam("bno") int bno, Model model) {
		Board board = boardService.getBoard(bno);
		model.addAttribute("board",board);
		return "admin/board/upBoard";
	}
	
	@PostMapping("upProBoard")
	public String upProBard(Board board, Model model) {
		boardService.upBoard(board);
		return "redirect:getBoard.do?bno="+board.getBno();// 수정된 게시물 상세보기로 리다이렉트
		//사용자에게 url주소로 리다이랙트하라는 의미
	}
	
	 @GetMapping("delBoard.do")
	    public String delBoard(@RequestParam("bno") int bno) {
	        boardService.delBoard(bno);
	        return "redirect:boardList.do";
	 }
}
