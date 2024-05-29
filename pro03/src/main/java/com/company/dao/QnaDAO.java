package com.company.dao;

import java.util.List;

import com.company.dto.Qna;

public interface QnaDAO {
	public List<Qna> getQnaList();
	public Qna getQna(int no);
	public void insQna(Qna qna);
	public void upQna(Qna qna);
	public void delQna(int no);
	public int getPlevel(int parno);
	public List<Qna> getAnswers(int parno);
	public void delAnswers(int parno);
	public void vcntCount(int no);
}

//private int no;
//private String title;
//private String content;
//private int hits;
//private String resdate;
//private String id;
//private String name;
//private int lev;
//private int parno;
