package com.bitcamp.web.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.FoodDTO;

@Component
public interface FoodService {

	public void addFood(Command cmd);
	public void modifyFood(Command cmd);
	public void removeFood(Command cmd);
	public List<FoodDTO> list();
	public List<FoodDTO> selectByName(Command  cmd); //not PK
	public FoodDTO selectById(Command  cmd); // pk
	public int count();


}
