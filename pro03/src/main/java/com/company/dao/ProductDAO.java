package com.company.dao;

import java.util.List;

import com.company.dto.Product;

public interface ProductDAO {
	public List<Product> getProductList();
	public Product getProduct(int pno);
	public void insProduct(Product product);
	public void upProduct(Product product);
	public void delProduct(int pno);
}
//private int pno;
//private String cate;
//private String pname;
//private int price;
//private String img;
//private String com;