package com.garam.web.infomation.service;

import java.util.List;

import com.garam.common.model.para.ParameterVO;
import com.garam.web.infomation.model.InfomationListVO;
import com.garam.web.infomation.model.InfomationReplyVO;

public interface InfomationService {

	public List<InfomationListVO> getInfomationList() throws Exception;

	public String insertInfomation(InfomationListVO infomationListVO) throws Exception;

	public String updateInfomation(InfomationListVO infomationListVO) throws Exception;

	public InfomationListVO getInfomationContent(int no) throws Exception;

	public int completeInfomation(ParameterVO parameterVO) throws Exception;

	public int undoCompleteInfomation(ParameterVO parameterVO) throws Exception;

	public int deleteInfomation(int no) throws Exception;

	public List<InfomationReplyVO> getInfomationReplyList(ParameterVO parameterVO) throws Exception;

	public int insertInfomationReply(InfomationReplyVO infomationReplyVO) throws Exception;

	public int updateInfomationReply(InfomationReplyVO infomationReplyVO) throws Exception;

	public int deleteInfomationReply(ParameterVO parameterVO) throws Exception;

	public int getReplyCnt(ParameterVO parameterVO) throws Exception;
}
