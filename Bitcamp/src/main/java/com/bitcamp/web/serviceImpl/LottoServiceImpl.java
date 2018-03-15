package com.bitcamp.web.serviceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.service.LottoService;

@Service
public class LottoServiceImpl implements LottoService{
	private static final Logger logger = LoggerFactory.getLogger(LottoServiceImpl.class);
	@Autowired LottoDTO lotto;
	
	@Override
	public LottoDTO findLottoCount(LottoDTO param) {
		lotto.setCount(String.valueOf(Integer.parseInt(lotto.getMoney())/1000));
		return lotto;
	}
	
	@Override
	public LottoDTO createLotto() {
		 LottoDTO lotto = new LottoDTO();
		  int[] arr = new int[6];
		  String num = "";
          for (int i = 0; i <6; i++) {
              arr[i] = (int)(Math.random()*45)+1;
                  for (int j = 0; j < i; j++) {
                      if (arr[i] == arr[j]) {
                          i--;
                      }
                  }
              }
          Arrays.sort(arr);
          for (int i = 0; i < 6; i++) {
        	num += arr[i]+"/";  
          }
        logger.info("생성된 로또 번호 {}",num);
        lotto.setLottoNumber(num);
		return lotto;
	}
	
	@Override
	public List<LottoDTO> createLottos(LottoDTO param) {
		List<LottoDTO> list = new ArrayList<>();
		int count = Integer.parseInt(findLottoCount(param).getCount());
		for(int i=0;i<count;i++) {
			list.add(createLotto());
		}
		return list;
	}

	@Override
	public void addLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeLotto(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LottoDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LottoDTO> finByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LottoDTO findById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}	
}
