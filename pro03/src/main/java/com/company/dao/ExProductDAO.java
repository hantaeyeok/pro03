package com.company.dao;

import java.util.List;

import com.company.dto.Product;
import com.company.dto.ExProduct;

public interface ExProductDAO {
	public int getTotalCount(int pno);
	public List<ExProduct> getExProductList();
	public ExProduct getExProduct(int pno);
	public void insExProduct(ExProduct exproduct);
	public void upExProduct(ExProduct exproduct);
	public void delExProduct(int pno);

}
//private int pno;
//private String cate;
//private String pname;
//private int price;
//private String img;
//private String com;