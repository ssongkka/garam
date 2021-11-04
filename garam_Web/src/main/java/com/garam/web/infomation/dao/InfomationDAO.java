package com.garam.web.infomation.dao;

import java.util.List;

import com.garam.web.infomation.model.InfomationListParamVO;
import com.garam.web.infomation.model.InfomationListVO;

public interface InfomationDAO {
	public List<InfomationListVO> getInfomationList() throws Exception;

	public InfomationListVO getInfomationContent(int no) throws Exception;

	public int insertInfomation(InfomationListParamVO infomationListParamVO) throws Exception;

	public int updateInfomation(InfomationListParamVO infomationListParamVO) throws Exception;

	public int completeInfomation(int no) throws Exception;

	public int deleteInfomation(int no) throws Exception;
}