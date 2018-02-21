package com.bitcamp.web.service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.command.ResultMap;
import com.bitcamp.web.domain.FoodDTO;

public interface FoodService {

	public ResultMap findFoodById(Command cmd);

}
