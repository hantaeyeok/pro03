package com.company.service;

import java.util.List;

import com.company.dto.ExProduct;


public interface ExProductService {
	public int getTotalCount(int pno);
	public List<ExProduct> getExProductList();
	public ExProduct getExProduct(int pno);
	public void insExProduct(ExProduct exproduct);
	public void upExProduct(ExProduct exproduct);
	public void delExProduct(int pno);
}
