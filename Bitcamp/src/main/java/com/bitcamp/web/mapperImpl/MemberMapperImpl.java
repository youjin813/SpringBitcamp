package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.mapper.MemberMapper;

@Repository
public class MemberMapperImpl implements MemberMapper{
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired MemberDTO member;
	@Autowired SqlSession sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.MemberMapperImpl.";
	
	@Override
	public void insertMember(Command cmd) {
		logger.info("MemberMapperImpl insertMember",cmd.getMember().getId());
		sqlSession.selectOne(ns+"insertMember",cmd);
	}

	@Override
	public MemberDTO selectMemberById(Command cmd) {
		logger.info("MemberMapperImpl selectbyId() ID is  {} ",cmd.getMember().getId());
		return sqlSession.selectOne(ns+"selectMemberById",cmd);
	}

	@Override
	public int exist(Command cmd) {
		logger.info("MemberMapperImpl login() ID is  {} ",cmd.getMember().getId());
		return sqlSession.selectOne(ns+"exist",cmd);
	}

	@Override
	public void deleteMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MemberDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
