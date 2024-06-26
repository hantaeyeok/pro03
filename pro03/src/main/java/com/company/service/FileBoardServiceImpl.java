package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.FileBoardDAO;
import com.company.dto.FileBoard;

@Service
public class FileBoardServiceImpl implements FileBoardService {

	@Autowired
	private FileBoardDAO fileBoardDAO;
	
	@Override
	public List<FileBoard> getFileBoardList() {
		return fileBoardDAO.getFileBoardList();
	}

	@Override
	public FileBoard getFileBoard(int no) {
		return fileBoardDAO.getFileBoard(no);
	}

	@Override
	public void insFileBoard(FileBoard fileBoard) {
		fileBoardDAO.insFileBoard(fileBoard);
		
	}

	@Override
	public void upFileBoard(FileBoard fileBoard) {
		fileBoardDAO.upFileBoard(fileBoard);
		
	}

	@Override
	public void delFileBoard(int no) {
		fileBoardDAO.delFileBoard(no);
		
	}
	
}
