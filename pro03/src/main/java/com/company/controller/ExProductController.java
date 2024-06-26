package com.company.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.company.dto.ExProduct;
import com.company.service.ExProductService;

@Controller
@RequestMapping("/exproduct/")
public class ExProductController {
	
	@Autowired
	private ExProductService exproductService;
	
	@Autowired
	private ServletContext servletContext;
	
	@GetMapping("exproductList.do")
	public String getExProductList(Model model) {
	List<ExProduct> exproductList = exproductService.getExProductList();
	model.addAttribute("exproductList",exproductList);
	return "exproduct/exproductList";
	}
	
	@GetMapping("exproductRegister.do")
	public String insProduct(Model model) {
		model.addAttribute("exproduct",new ExProduct());
		return "exproduct/exproductRegister";
	}
	
	
	@PostMapping("exproductRegister.do")
    public String insExProProduct(ExProduct exproduct, 
                                  @RequestParam("img1") MultipartFile img1, 
                                  @RequestParam("img2") MultipartFile img2, 
                                  @RequestParam("img3") MultipartFile img3, 
                                  Model model) {
        try {
            String uploadPath = servletContext.getRealPath("/resources/upload"); // 실제 경로
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs(); // 업로드 디렉토리가 없으면 생성
            }
            
            if (!img1.isEmpty()) {
                String fileName1 = UUID.randomUUID().toString() + "_" + img1.getOriginalFilename();
                File saveFile1 = new File(uploadPath, fileName1);
                img1.transferTo(saveFile1); // 파일 저장
                exproduct.setImg1(fileName1);
            }

            if (!img2.isEmpty()) {
                String fileName2 = UUID.randomUUID().toString() + "_" + img2.getOriginalFilename();
                File saveFile2 = new File(uploadPath, fileName2);
                img2.transferTo(saveFile2); // 파일 저장
                exproduct.setImg2(fileName2);
            }

            if (!img3.isEmpty()) {
                String fileName3 = UUID.randomUUID().toString() + "_" + img3.getOriginalFilename();
                File saveFile3 = new File(uploadPath, fileName3);
                img3.transferTo(saveFile3); // 파일 저장
                exproduct.setImg3(fileName3);
            }

        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("message", "파일 업로드 중 오류가 발생했습니다.");
            return "exproduct/exproductRegister";
        }

        exproductService.insExProduct(exproduct);
        return "redirect:/exproduct/exproductList";
    }
	
	
	@GetMapping("getexProduct.do")
	public String getExProduct() {
		return "exproduct/getexproduct";
	}
	
	
}
