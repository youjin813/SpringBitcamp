package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.LottoDTO;

public interface LottoService {

	public ResultMap findLottoById(Command cmd);
}
