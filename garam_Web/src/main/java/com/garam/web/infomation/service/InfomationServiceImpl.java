package com.garam.web.infomation.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.garam.web.infomation.dao.InfomationDAO;
import com.garam.web.infomation.model.InfomationListParamVO;
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
	public String insertInfomation(InfomationListParamVO infomationListParamVO) throws Exception {

		int check = this.infomationDAO.insertInfomation(infomationListParamVO);
		System.out.println("확인해라     " + check);
		if (check > 0) {
			System.out.println("1    " + infomationListParamVO.getNo());
			System.out.println("1    " + infomationListParamVO.getInsert_date());
			System.out.println("1    " + infomationListParamVO.getDate_end());
			System.out.println("1    " + infomationListParamVO.getDate_com());
			System.out.println("111    " + infomationListParamVO.getTitle());
			System.out.println("222    " + infomationListParamVO.getContents());

			return Integer.toString(infomationListParamVO.getNo());
		} else {
			return null;
		}
	}

	@Override
	public InfomationListVO getInfomationContent(int no) throws Exception {
		return infomationDAO.getInfomationContent(no);
	}

	@Override
	public void completeInfomation(int no) throws Exception {
		infomationDAO.completeInfomation(no);
	}

}
