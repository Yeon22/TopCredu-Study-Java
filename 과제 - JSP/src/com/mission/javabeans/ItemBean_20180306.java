package com.mission.javabeans;

//	2. 상품 정보를 위한 자바 빈 작성하기. 자바 빈 프로그래밍의 기초를 익힙니다.
//	초급
//	com.mission.javabeans 패키지에 ItemBean 클래스를 만든 
//	후 상품 정보를 입력 받는 jsp페이지 itemWriteForm.jsp와
//	이를 처리하는 jsp페이지 itemWrite.jsp를 작성하시오.
//
//	자바빈내용
// 	private String name;
// 	private int price;
// 	private String description;

public class ItemBean_20180306 {
	private String name;
	private int price;
	private String description;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String descripteion) {
		this.description = descripteion;
	}
}
