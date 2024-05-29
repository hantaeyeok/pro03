package com.company.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.dto.Qna;

@Repository
public class QnaDAOImpl implements QnaDAO{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<Qna> getQnaList() {
		return sqlSession.selectList("qna.getQnaList");
	}

	@Override
	public Qna getQna(int no) {
		return sqlSession.selectOne("qna.getQna");
	}

//	@Override
//	public void insQna(Qna qna) {
//		sqlSession.insert("qna.insQna",qna);
//	}
	
	@Override
	public void insQna(Qna qna) {
	    int plevel;
	    if (qna.getParno() == 0) {
	        plevel = 0; // 최상위 글인 경우 plevel을 0으로 설정
	    } else {
	    	plevel = getPlevel(qna.getParno()) + 1; // 부모 글의 plevel을 가져와서 1을 더한 값으로 설정
	    }
	    qna.setPlevel(plevel);
	    sqlSession.insert("qna.insQna", qna);
	}

	@Override
	public void upQna(Qna qna) {
		sqlSession.update("qna.upqna",qna);
	}

	@Override
	public void delQna(int no) {
		sqlSession.delete("qna.delQna",no);
	}

	@Override
	public int getPlevel(int parno) {
		 return sqlSession.selectOne("qna.getPlevel", parno);
	}
	
	@Override
    public List<Qna> getAnswers(int parno) {
        return sqlSession.selectList("qna.getAnswers", parno);
    }

	@Override
	public void delAnswers(int parno) {
		sqlSession.delete("qna.delAnswers",parno);
		
	}
	
	@Override
	public void vcntCount(int no) {
		sqlSession.update("qna.vcntCount", no);
		
	}
	
	
	
}
