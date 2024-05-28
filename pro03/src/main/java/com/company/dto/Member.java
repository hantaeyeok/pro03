package com.company.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private String id;
	private String pw;
	private String name;
	private String email;
	private String tel;
	private String postcode;
	private Date birth;
	private String addr;
	private String point;
	private Date regdate;
}
