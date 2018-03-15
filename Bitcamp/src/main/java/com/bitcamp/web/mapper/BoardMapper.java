package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;

@Component
public interface BoardMapper {
	public void insertBoard(Command cmd);
	public void updateBoard(Command cmd);
	public void deleteBoard(Command cmd);
	public List<BoardDTO> selectAll(Command cmd);
	public List<BoardDTO> selectByName(Command cmd); //not PK
	public BoardDTO selectBySeq(Command cmd); // pk
	public int selectCount();

}
