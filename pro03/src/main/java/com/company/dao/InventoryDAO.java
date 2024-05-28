package com.company.dao;

import java.util.List;

import com.company.dto.Inventory;

public interface InventoryDAO {
	public List<Inventory> getInventoryList();
	public Inventory getInventory(int ino);
	public void insInventory(Inventory inventory);
	public void upInventory(Inventory inventory);
	public void delInventory(int ino);
}
//private int ino;
//private int pno;
//private int iprice;
//private int oprice;
//private int amount;
//private String remark;