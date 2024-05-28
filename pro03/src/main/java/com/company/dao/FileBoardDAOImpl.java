package com.company.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.dto.FileBoard;
@Repository
public class FileBoardDAOImpl implements FileBoardDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<FileBoard> getFileBoardList() {
		return sqlSession.selectList("fileBoard.getFileBoardList");
	}

	@Override
	public FileBoard getFileBoard(int no) {
		return sqlSession.selectOne("fileBoard.getFileBoard",no);
	}

	@Override
	public void insFileBoard(FileBoard fileBoard) {
		sqlSession.insert("fileBoard.insFileBoard",fileBoard);
	}

	@Override
	public void upFileBoard(FileBoard fileBoard) {
		sqlSession.update("fileBoard.upFileBoard",fileBoard);
		
	}

	@Override
	public void delFileBoard(int no) {
		sqlSession.delete("fileBoard.delFileBoard",no);
		
	}
	
}
