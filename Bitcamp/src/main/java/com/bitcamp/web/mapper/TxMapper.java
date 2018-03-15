package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;

@Component
public interface TxMapper {
	public void insertTx(Command cmd);
	public void updateTx(Command cmd);
	public void deleteTx(Command cmd);
	public List<TxDTO> selectAll();
	public List<TxDTO> selectByName(Command cmd); //not PK
	public TxDTO selectBYID(Command cmd); // pk
	public int selectCount();
}
