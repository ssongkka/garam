package com.garam.web.infomation.service;

import java.util.List;

import com.garam.web.infomation.model.InfomationListVO;

public interface InfomationService {

	public List<InfomationListVO> getInfomationList() throws Exception;

	public void insertInfomation(InfomationListVO infomationListVO) throws Exception;

}
