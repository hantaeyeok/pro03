package com.company.service;

import java.util.List;

import com.company.dto.FileBoard;

public interface FileBoardService {
	public List<FileBoard> getFileBoardList();
	public FileBoard getFileBoard(int no);
	public void insFileBoard(FileBoard fileBoard);
	public void upFileBoard(FileBoard fileBoard);
	public void delFileBoard(int no);
}
