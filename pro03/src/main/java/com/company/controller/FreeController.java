package com.company.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.maven.shared.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.company.dto.Free;
import com.company.service.FreeService;
import com.company.service.MemberService;
import com.google.gson.JsonObject;

@Controller
@RequestMapping("/free/")
public class FreeController {

	@Autowired
	private FreeService freeService;
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("freeList.do")
	public String getFreeList(Model model) {
		model.addAttribute("freeList",freeService.getFreeList());
		return "free/freeList";
	}

	@RequestMapping("getFree.do")
	public String getFree(@RequestParam("no") int no, Model model) {
		model.addAttribute("free",freeService.getFree(no));
		return "free/getFree";
	}
	
	@GetMapping("insFree.do")
	public String insFree(Free free,Model model) {
		return "free/insFree";
	}
	@PostMapping("insFree.do")
	public String insFreePro(Free free, Model model) {
		String id = (String) session.getAttribute("sid");
		String name = (String) session.getAttribute("sname");
		free.setId(id);
		free.setName(name);
		free.setResdate(new Date());
		freeService.insFree(free);
		return "free/freeList";
	}
	
	@PostMapping("fileupload.do")
	public String fileupload(HttpServletRequest request, HttpServletResponse response, MultipartHttpServletRequest multiFile) throws IOException {
		JsonObject json = new JsonObject();
		PrintWriter printWriter = null; //응답 데이터를 작성하기 위해 사용됩니다.
		OutputStream out = null;	// 파일을 서버에 저장하기 위해 사용되는 출력 스트림입니다.
		MultipartFile file = multiFile.getFile("upload"); //업로드된 파일을 가져오려고
		
		if(file != null){
			if(file.getSize() > 0 && StringUtils.isNotBlank(file.getName())){
				if(file.getContentType().toLowerCase().startsWith("images/")){
					try{
						String fileName = file.getName();
						byte[] bytes = file.getBytes();
						String uploadPath = request.getServletContext().getRealPath("/img");
						File uploadFile = new File(uploadPath);
						if(!uploadFile.exists()){
							uploadFile.mkdirs();
						}
						fileName = UUID.randomUUID().toString();
						uploadPath = uploadPath + "/" + fileName;
						out = new FileOutputStream(new File(uploadPath));
	                   out.write(bytes);
	                   
	                   printWriter = response.getWriter();
	                   response.setContentType("text/html");
	                   String fileUrl = request.getContextPath() + "/images/" + fileName;
	                   
	                   // json 데이터로 등록
	                   // {"uploaded" : 1, "fileName" : "test.jpg", "url" : "/images/test.jpg"}
	                   // 이런 형태로 리턴이 나가야함.
	                   json.addProperty("uploaded", 1);
	                   json.addProperty("fileName", fileName);
	                   json.addProperty("url", fileUrl);
	                   
	                   printWriter.println(json);
	               }catch(IOException e){
	                   e.printStackTrace();
	               }finally{
	                   if(out != null){
	                       out.close();
	                   }
	                   if(printWriter != null){
	                       printWriter.close();
	                   }		
					}
				}
			}
		}
		return null;
	}
	
	
}
