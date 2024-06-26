package com.company.service;

import java.util.List;

import com.company.dto.Product;

public interface ProductService {
	public int getTotalCount();
	public List<Product> getProductList();
	public List<Product> getProductCateList(String cate);
	public Product getProduct(int pno);
	public void insProduct(Product product);
	public void upProduct(Product product);
	public void delProduct(int pno);
}
