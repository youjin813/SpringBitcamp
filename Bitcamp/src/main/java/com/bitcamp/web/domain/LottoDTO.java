package com.bitcamp.web.domain;


import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class LottoDTO {
	private String randomNumber,   //3
	lottoNumber, //3,6,12,23,33,45
	money,
	count;
}
