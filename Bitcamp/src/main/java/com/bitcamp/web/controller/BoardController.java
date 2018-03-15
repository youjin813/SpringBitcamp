package com.bitcamp.web.controller;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.Page;
import com.bitcamp.web.domain.BoardDTO;
import com.bitcamp.web.enums.ImageRepo;
import com.bitcamp.web.enums.Serv;
import com.bitcamp.web.enums.Table;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.proxy.FileProxy;
import com.bitcamp.web.proxy.PageProxy;
import com.bitcamp.web.service.BoardService;

@Controller

@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	@Autowired Page page;
	@Autowired BoardService boardService;
	@Autowired BoardDTO board;
	@Autowired Command cmd;
	@Autowired PageProxy pagePxy;
	@Autowired FileProxy filePxy;
	@Autowired ShiftFactory shift;
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String boardList(Model model,
			@RequestParam(value="pageSize", defaultValue="5")String pageSize,
			@RequestParam(value="blockSize",defaultValue="5")String blockSize,
			@RequestParam(value="pageNum",defaultValue="1")String pageNum) {
		page.setPageSize(Integer.parseInt(pageSize));
		System.out.println("페이지 사이즈"+pageSize);
		page.setBlockSize(Integer.parseInt(blockSize));
		System.out.println("블럭 사이즈"+blockSize);
		System.out.println("페이지넘"+pageNum);
		page.setPageNum(Integer.parseInt(pageNum));
		pagePxy.execute(model, page);
		return shift.create(Table.board.toString(),Serv.list.toString());
	}
	@RequestMapping("/detail/{bbsSeq}")
	public String detail(Model model,
			@PathVariable("bbsSeq")String bbsSeq) {
		logger.info("----board controller SEQ {}",bbsSeq);
		board.setBbsSeq(bbsSeq);
		cmd.setBoard(board);
		model.addAttribute("board",boardService.selectBySeq(cmd));
		return shift.create(Table.board.toString(),Serv.detail.toString());
	}
	@RequestMapping(value="/fileupload",method = RequestMethod.POST)
	public String fileupload(FileProxy pxy, Model model) throws IllegalStateException, IOException {
		String fileName = pxy.getFile().getOriginalFilename();
		System.out.println("업로드된 파일"+fileName);
		String path = ImageRepo.UPLOAD_PATH.toString()+fileName;
		File file = new File(path);
		pxy.getFile().transferTo(file);
		model.addAttribute("uploadImage",fileName);
		return shift.create(Table.board.toString(),Serv.write.toString());
	}
}
