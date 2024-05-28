package com.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Qna {
	private int no;
	private String title;
	private String content;
	private int hits;
	private String resdate;
	private String id;
	private String name;
	private int lev;
	private int parno;
}