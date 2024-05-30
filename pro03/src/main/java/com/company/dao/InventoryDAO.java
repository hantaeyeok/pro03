package com.company.dao;

import java.util.List;

import com.company.dto.CategoryVO;
import com.company.dto.Inventory;

public interface InventoryDAO {
	public int getTotalCount();
	public List<Inventory> getInventoryList();
	public List<CategoryVO> categoryLoading(String cate);
	public Inventory getInventory(int ino);
	public void insInventory(Inventory inventory);
	public void upInventory(Inventory inventory);
	public void delInventory(int ino);
}
//int getTotalCount();
//List<Inventory> getInventoryList();
//List<CategoryVO> categoryLoading(String cate);
//Inventory getInventory(int pno);
//void insInventory(Inventory inventory);
//void upInventory(Inventory inventory);
//void delInventory(int ino);