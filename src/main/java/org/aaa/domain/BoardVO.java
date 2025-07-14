package org.aaa.domain;

import java.util.Date;

import lombok.Data;

@Data // 게터 세터 자동 생성 ㅋ
public class BoardVO {
	
	
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regDate;
	private Date updateDate; 

}
