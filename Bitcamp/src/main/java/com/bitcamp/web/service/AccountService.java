package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.AccountDTO;

@Component
public interface AccountService {
	public void addAccount(Command cmd);
	public void modifyAccount(Command cmd);
	public void removeAccount(Command cmd);
	public List<AccountDTO> list();
	public List<AccountDTO> selectByName(Command cmd); //not PK
	public AccountDTO selectById(Command cmd); // pk
	public int count();
}
