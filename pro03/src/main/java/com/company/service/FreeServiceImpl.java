package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.dao.FreeDAO;
import com.company.dto.Free;

@Service
public class FreeServiceImpl implements FreeService{

		@Autowired
		private FreeDAO freeDAO;

		@Override
		public List<Free> getFreeList() {
			return freeDAO.getFreeList();
		}
		
		@Transactional
		@Override
		public Free getFree(int no) {
			freeDAO.upHits(no);
			return freeDAO.getFree(no);
		}

		@Override
		public void insFree(Free free) {
			freeDAO.insFree(free);
		}

		@Override
		public void upFree(Free free) {
			freeDAO.upFree(free);
		}

		@Override
		public void delFree(int no) {
			freeDAO.delFree(no);
		}

		@Override
		public void upHits(int no) {
			freeDAO.upHits(no);
		}
		
		
		
}
