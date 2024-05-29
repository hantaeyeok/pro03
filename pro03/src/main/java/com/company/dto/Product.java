package com.company.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int pno;
	private String cate;
	private String pname;
	private int price;
	private String com;
	private String context;
	
	private Date resdate;
	
	private String img1;
	private String img2;
	private String img3;
	
}
