package com.bitcamp.web.domain;


import lombok.Data;

@Data
public class FoodDTO {
	private String foodSeq,menu,price,count,id;

	@Override
	public String toString() {
		return "메뉴[상품명=" + menu + ", 가격=" + price + "원, 수량=" + count + "]";
	}
	
}
