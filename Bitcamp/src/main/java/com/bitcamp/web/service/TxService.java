package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;

@Component
public interface TxService {
	public void insertTx(Command cmd);
	public void updateTx(Command cmd);
	public void deleteTx(Command cmd);
	public List<TxDTO> selectAll();
	public List<TxDTO> selectByName(Command cmd); //not PK
	public TxDTO selectBYID(Command cmd); // pk
	public int count();
	public void openPhone(Command cmd);
	public String createPhoneNum();

}
