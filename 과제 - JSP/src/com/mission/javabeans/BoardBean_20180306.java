package com.mission.javabeans;

//	1. 게시글 정보를 위한 자바 빈 작성하기. 자바 빈 프로그래밍의 기초를 익힙니다.
//	초급
//	com.mission.javabeans 패키지에 BoardBean 클래스를 만든 
//	후 게시글 정보를 입력 받는 jsp페이지 boardWriteForm.jsp와
//	이를 처리하는 jsp페이지 boardWrite.jsp를 작성하시오.
//
//	자바빈내용
// 	private String name;
// 	private String pass;
// 	private String email;
// 	private String title;
// 	private String content;

public class BoardBean_20180306 {
	private String name;
	private String pass;
	private String email;
	private String title;
	private String content;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
