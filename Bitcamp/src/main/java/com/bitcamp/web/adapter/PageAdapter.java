package com.bitcamp.web.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.Page;
import com.bitcamp.web.service.BoardService;

@Component
public class PageAdapter {
	@Autowired Command cmd;
	@Autowired BoardService boardService;
	public Command attr(Page page) {
		page.setTotalCount(boardService.count());
		System.out.println("전체 게시글 수 :" +page.getTotalCount());
		page.setTotalPage(0);
		System.out.println("전체 페이지 수 :" +page.getTotalPage());
		System.out.println("블록 수 :" +page.getBlockSize());
		page.setPageStart(0);
		System.out.println("페이지 스타트 :" +page.getPageStart());
		page.setPageEnd(0);
		System.out.println("페이지 엔드 :" +page.getPageEnd());
		page.setPrevBlock(false);
		System.out.println("프리브 블록 :" +page.isPrevBlock());
		page.setNextBlock(false);
		System.out.println("넥스트 블록 :" +page.isNextBlock());
		page.setStartRow(0);
		System.out.println("스타트 로우 :" +page.getStartRow());
		page.setEndRow(0);
		System.out.println("엔드 로우 :" +page.getEndRow());
		System.out.println("페이징 종료");
		cmd = new Command();
		cmd.setPaging(page);
		return cmd;	
	}
}	

