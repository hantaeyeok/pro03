package com.company.dto;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileBoard {
	private int no;
	private String title;
	private String content;
	private String url;
	private int hits;
	private Date resdate;
	private String author;
	private String datafile;
}
