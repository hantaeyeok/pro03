package com.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {
	private int bno;
    private String title;
    private String content;
    private String author;
    private int vcnt;
    private String resdate;
}

//		bno int auto_increment primary key, 
//		title varchar(200), 
//		content varchar(1000), 
//		author varchar(20) default 'admin', 
//		vcnt int default 0, 
//		resdate timestamp default current_timestamp);
