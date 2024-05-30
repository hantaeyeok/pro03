package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.InventoryDAO;
import com.company.dto.CategoryVO;
import com.company.dto.Inventory;

@Service
public class InventoryServiceImpl implements InventoryService{
	
	@Autowired
	private InventoryDAO inventoryDAO;

	@Override
	public List<Inventory> getInventoryList() {
		return inventoryDAO.getInventoryList();
	}

	@Override
	public Inventory getInventory(int ino) {
		return inventoryDAO.getInventory(ino);
	}

	@Override
	public void insInventory(Inventory inventory) {
		inventoryDAO.insInventory(inventory);
	}

	@Override
	public void upInventory(Inventory inventory) {
		inventoryDAO.upInventory(inventory);
	}

	@Override
	public void delInventory(int ino) {
		inventoryDAO.delInventory(ino);
	}

	@Override
	public int getTotalCount() {
		return inventoryDAO.getTotalCount();
	}

	@Override
	public List<CategoryVO> categoryLoading(String cate) {
		return inventoryDAO.categoryLoading(cate);
	}
	
	
}
