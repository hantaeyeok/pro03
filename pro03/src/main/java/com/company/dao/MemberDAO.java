package com.company.dao;

import java.util.List;

import com.company.dto.Member;

public interface MemberDAO {
	public List<Member> getMemberList();
	public Member getMember(String id);
	public void insMember(Member member);
	public void upMember(Member member);
	public void delMember(String id);
}
