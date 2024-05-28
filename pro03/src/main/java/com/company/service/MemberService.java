package com.company.service;

import java.util.List;

import com.company.dto.Member;

public interface MemberService {
	public List<Member> getMemberList();
	public Member getMember(String id);
	public void insMember(Member member);
	public void upMember(Member member);
	public void delMember(String id);
    public boolean checkPassword(String rawPassword, String encodedPassword);

}
