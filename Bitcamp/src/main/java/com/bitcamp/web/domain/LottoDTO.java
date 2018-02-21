package com.bitcamp.web.domain;


import lombok.Data;

@Data
public class LottoDTO {
	private String lottoNum;

	public String getLottoNum() {
		return lottoNum;
	}

	public void setLottoNum(String lottoNum) {
		this.lottoNum = lottoNum;
	}

}
