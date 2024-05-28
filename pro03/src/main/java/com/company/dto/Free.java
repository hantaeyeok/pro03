package com.company.dto;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Free {
	private int no;
    private String title;
    private String content;
    private int hits;
    private Date resdate;
    private String id;
    private String name;
}
