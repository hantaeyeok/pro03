package com.company.service;

import java.util.List;

import com.company.dto.CategoryVO;
import com.company.dto.Inventory;

public interface InventoryService {
	public int getTotalCount();
	public List<Inventory> getInventoryList();
	public List<CategoryVO> categoryLoading(String cate);
	public Inventory getInventory(int ino);
	public void insInventory(Inventory inventory);
	public void upInventory(Inventory inventory);
	public void delInventory(int ino);
}
