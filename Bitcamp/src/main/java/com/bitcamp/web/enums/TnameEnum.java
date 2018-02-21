package com.bitcamp.web.enums;

public enum TnameEnum {
	MEMBER,ATTEND,tab,
	TNAMES{
		@Override
		public String toString() {
			return MEMBER+","+ATTEND;
		}
	}
}
