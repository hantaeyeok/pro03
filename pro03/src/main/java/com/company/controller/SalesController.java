package com.company.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.service.InventoryService;
import com.company.service.ProductService;
import com.company.service.SalesService;

@Controller
@RequestMapping("/sales/")
public class SalesController {

	private static final Logger log = LoggerFactory.getLogger(SalesController.class);

	@Autowired
	private SalesService salesService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private InventoryService invertoryService;
	
	@Autowired
	private HttpSession session;
	
	
	
}
