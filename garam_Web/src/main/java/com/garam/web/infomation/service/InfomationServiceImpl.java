package com.garam.web.infomation.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.garam.common.model.para.ParameterVO;
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
	public String insertInfomation(InfomationListVO infomationListVO) throws Exception {

		int check = this.infomationDAO.insertInfomation(infomationListVO);
		System.out.println("확인해라     " + check);
		if (check > 0) {
			return Integer.toString(infomationListVO.getNo());
		} else {
			return null;
		}
	}

	@Override
	public int deleteInfomation(int no) throws Exception {
		return infomationDAO.deleteInfomation(no);
	}

	@Override
	public InfomationListVO getInfomationContent(int no) throws Exception {
		return infomationDAO.getInfomationContent(no);
	}

	@Override
	public int completeInfomation(ParameterVO parameterVO) throws Exception {
		int check = infomationDAO.completeInfomation(parameterVO);

		return check;
	}

	@Override
	public int undoCompleteInfomation(ParameterVO parameterVO) throws Exception {
		int check = infomationDAO.undoCompleteInfomation(parameterVO);

		return check;
	}

}
