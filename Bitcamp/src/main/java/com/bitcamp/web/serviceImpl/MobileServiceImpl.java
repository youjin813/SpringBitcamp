package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.mapper.MobileMapper;
import com.bitcamp.web.service.MobileService;
@Service
public class MobileServiceImpl implements MobileService{
	private static final Logger logger = LoggerFactory.getLogger(MobileServiceImpl.class);
	@Autowired MobileMapper mapper;
	@Override
	public ResultMap open(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<MobileDTO> phones() {
		return mapper.list();
	}


	@Override
	public ResultMap findMobileById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

}
