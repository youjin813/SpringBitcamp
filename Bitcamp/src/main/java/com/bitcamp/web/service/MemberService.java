package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;

@Component
public interface MemberService {
	public boolean exist(Command cmd);
	public MemberDTO findMemberById(Command cmd);

	
	public void addMember(Command cmd);
	public void updateMember(Command cmd);
	public void deleteMember(Command cmd);
	public List<MemberDTO> list();
	public List<MemberDTO> selectByName(Command  cmd); //not PK
	public MemberDTO selectBYID(Command  cmd); // pk
	public int count();

}
