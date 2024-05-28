package com.company.dao;

import java.util.List;

import com.company.dto.FileBoard;

public interface FileBoardDAO {
	public List<FileBoard> getFileBoardList();
	public FileBoard getFileBoard(int no);
	public void insFileBoard(FileBoard fileBoard); 
	public void upFileBoard(FileBoard fileBoard);
	public void delFileBoard(int no);
	
}
//private int no;
//private String title;
//private String content;
//private String url;
//private int hits;
//private String resdate;
//private String author;