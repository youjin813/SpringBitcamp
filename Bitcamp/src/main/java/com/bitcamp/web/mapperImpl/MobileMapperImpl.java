package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MobileDTO;
import com.bitcamp.web.mapper.MobileMapper;
@Repository
public class MobileMapperImpl implements MobileMapper{
	@Autowired SqlSessionTemplate sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.MobileMapperImpl.";

	@Override
	public List<MobileDTO> list() {
		return sqlSession.selectList(ns+"list");
	}

	@Override
	public void insertMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMobile(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MobileDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MobileDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MobileDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
