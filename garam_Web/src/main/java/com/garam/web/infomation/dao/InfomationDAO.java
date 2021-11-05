package com.garam.web.infomation.dao;

import java.util.List;

import com.garam.common.model.para.ParameterVO;
import com.garam.web.infomation.model.InfomationListVO;

public interface InfomationDAO {
	public List<InfomationListVO> getInfomationList() throws Exception;

	public InfomationListVO getInfomationContent(int no) throws Exception;

	public int insertInfomation(InfomationListVO infomationListVO) throws Exception;

	public int updateInfomation(InfomationListVO infomationListVO) throws Exception;

	public int completeInfomation(ParameterVO parameterVO) throws Exception;

	public int undoCompleteInfomation(ParameterVO parameterVO) throws Exception;

	public int deleteInfomation(int no) throws Exception;
}