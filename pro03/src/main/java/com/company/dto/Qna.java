package com.company.dto;

import java.util.Date;

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
	private Date resdate;
	private String id;
	private String name;
	private int plevel;
	private int parno;
}
