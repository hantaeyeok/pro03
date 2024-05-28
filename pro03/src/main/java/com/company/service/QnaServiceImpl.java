package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.QnaDAO;
import com.company.dto.Qna;

@Service
public class QnaServiceImpl implements QnaService{
	
	@Autowired
	private QnaDAO qnaDAO;

	@Override
	public List<Qna> getQnaList() {
		return qnaDAO.getQnaList();
	}

	@Override
	public Qna getQna(int no) {
		return qnaDAO.getQna(no);
	}

	@Override
	public void insQna(Qna qna) {
		qnaDAO.insQna(qna);
	}

	@Override
	public void upQna(Qna qna) {
		qnaDAO.upQna(qna);
	}

	@Override
	public void delQna(int no) {
		qnaDAO.delQna(no);
	}
	
	
}
