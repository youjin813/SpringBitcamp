package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.MobileDTO;

@Component
public interface MobileService {

	public ResultMap open(Command cmd);
	public ResultMap findMobileById(Command cmd);
	public List<MobileDTO> phones();
}
