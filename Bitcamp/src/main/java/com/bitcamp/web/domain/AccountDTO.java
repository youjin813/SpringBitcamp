package com.bitcamp.web.domain;

import lombok.Data;

@Data
public class AccountDTO {
		private String customer_num,account_num,money,id;

		@Override
		public String toString() {
			return "계좌번호 [고객번호=" + customer_num + ", 계좌번호=" + account_num + ", 금액=" + money
					+ ", 아이디=" + id + "]";
		}
	}

