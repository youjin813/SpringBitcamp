package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.FoodDTO;

@Component
public interface FoodMapper {
	public void insertFood(Command cmd);
	public void updateFood(Command cmd);
	public void deleteFood(Command cmd);
	public List<FoodDTO> selectAll();
	public List<FoodDTO> selectByName(Command cmd); //not PK
	public FoodDTO selectBYID(Command cmd); // pk
	public int selectCount();

}
