package com.bitcamp.web.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AccountDTO {
		private String accSeq,accountNum,money,id;

		@Override
		public String toString() {
			return "계좌번호 [고객번호=" + accSeq + ", 계좌번호=" + accountNum + ", 금액=" + money
					+ ", 아이디=" + id + "]";
		}
	}

