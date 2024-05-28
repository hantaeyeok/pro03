package com.company.service;

import java.util.List;

import com.company.dto.Sales;

public interface SalesService {
	public List<Sales> getSalesList();
	public Sales getSales(int sno);
	public void insSales(Sales sales);
	public void upSales(Sales sales);
	public void delSales(int sno);
}