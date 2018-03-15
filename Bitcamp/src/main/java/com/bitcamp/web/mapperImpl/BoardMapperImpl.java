package com.bitcamp.web.mapperImpl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.mapper.BoardMapper;

@Repository
public class BoardMapperImpl implements BoardMapper{
	@Autowired SqlSession sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.BoardMapperImpl.";
	@Override
	public void insertBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BoardDTO> selectAll(Command cmd) {
		return sqlSession.selectList(ns+"selectAll",cmd);
	}

	@Override
	public List<BoardDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardDTO selectBySeq(Command cmd) {
		return sqlSession.selectOne(ns+"selectBySeq", cmd);
	}

	@Override
	public int selectCount() {
		return sqlSession.selectOne(ns+"selectCount");
	}

}
