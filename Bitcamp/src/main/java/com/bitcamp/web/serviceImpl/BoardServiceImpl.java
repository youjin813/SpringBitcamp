package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.controller.BoardController;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;
import com.bitcamp.web.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{
	private static final Logger logger = LoggerFactory.getLogger(BoardServiceImpl.class);
	@Autowired BoardMapper boardMapper;
	@Override
	public void addBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDTO> list(Command cmd) {
		return boardMapper.selectAll(cmd);
	}

	@Override
	public List<BoardDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO selectBySeq(Command cmd) {
		logger.info("cmd getBbsSeq {}", cmd.getBoard().getBbsSeq());
		return boardMapper.selectBySeq(cmd);
	}

	@Override
	public int count() {
		return boardMapper.selectCount();
	}


}
