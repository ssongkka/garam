package com.garam.web.infomation.service;

import java.util.List;

import com.garam.web.infomation.model.InfomationListParamVO;
import com.garam.web.infomation.model.InfomationListVO;

public interface InfomationService {

	public List<InfomationListVO> getInfomationList() throws Exception;

	public String insertInfomation(InfomationListParamVO infomationListParamVO) throws Exception;

	public InfomationListVO getInfomationContent(int no) throws Exception;

	public void completeInfomation(int no) throws Exception;
}
