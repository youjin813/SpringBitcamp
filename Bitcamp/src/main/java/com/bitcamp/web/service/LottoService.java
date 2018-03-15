package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;

@Component
public interface LottoService {
	public void addLotto(Command cmd);
	public void modifyLotto(Command cmd);
	public void removeLotto(Command cmd);
	public List<LottoDTO> list();
	public List<LottoDTO> finByName(Command  cmd); //not PK
	public LottoDTO findById(Command  cmd); // pk
	public int count();

	
	public LottoDTO findLottoCount(LottoDTO param);
	public LottoDTO createLotto();			//한줄
	public List<LottoDTO> createLottos(LottoDTO param);
	
}
