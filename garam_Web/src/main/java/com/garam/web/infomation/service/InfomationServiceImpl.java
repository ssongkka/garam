package com.garam.web.infomation.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.garam.web.infomation.dao.InfomationDAO;
import com.garam.web.infomation.model.InfomationListVO;

@Service
public class InfomationServiceImpl implements InfomationService {

	@Inject
	private InfomationDAO infomationDAO;

	@Override
	public List<InfomationListVO> getInfomationList() throws Exception {
		return infomationDAO.getInfomationList();
	}

	@Override
	public void insertInfomation(InfomationListVO infomationListVO) throws Exception {
		infomationDAO.insertInfomation(infomationListVO);
	}

}
