package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.mapper.TxMapper;
import com.bitcamp.web.service.TxService;

@Service
public class TxServiceImpl implements TxService{
	@Autowired TxDTO userp;
	@Autowired TxMapper mapper;
		@Override
		public void openPhone(Command cmd) {
			mapper.insertTx(cmd);
		}
		
		@Override
		public String createPhoneNum() {
			// TODO Auto-generated method stub
			return "010-"+String.valueOf(
					(int)(Math.random() * 8999 + 1000))+
					"-"+String.valueOf(
						(int)(Math.random() * 8999 + 1000));
		}

		@Override
		public void insertTx(Command cmd) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void updateTx(Command cmd) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void deleteTx(Command cmd) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public List<TxDTO> selectAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<TxDTO> selectByName(Command cmd) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public TxDTO selectBYID(Command cmd) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int count() {
			// TODO Auto-generated method stub
			return 0;
		}
	
	}
