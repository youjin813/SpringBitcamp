package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.mapper.MemberMapper;
import com.bitcamp.web.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	@Autowired MemberDTO member;
	@Autowired MemberMapper mm;
	@Override
	public void addMember(Command cmd) {
		mm.insertMember(cmd);	
	}

	@Override
	public boolean exist(Command cmd) {
		logger.info("MemberServiceImpl login() ID is  {}.","");
		return (mm.exist(cmd)!=0);
		}
		
/*	boolean flag = false;
  	if(m.exist(cmd)!=0) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}*/

	
	@Override
	public MemberDTO findMemberById(Command cmd) {
		return mm.selectMemberById(cmd);
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
	public List<MemberDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO selectBYID(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}


}
