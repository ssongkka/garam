package com.garam.web.dashboard.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.garam.common.model.Calendar_VO;
import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.Ve_Id2_VO;
import com.garam.common.model.para.Para2VO;
import com.garam.web.dashboard.dao.DashboardDAO;

@Service
public class DashboardServiceImpl implements DashboardService {

	@Inject
	private DashboardDAO dash_Dao;

	@Override
	public List<EmployeeList_VO> getEmpList() throws Exception {
		// TODO Auto-generated method stub
		return dash_Dao.getEmpList();
	}

	@Override
	public List<Ve_Id2_VO> getVeIDList() throws Exception {
		// TODO Auto-generated method stub
		return dash_Dao.getVeIDList();
	}

	@Override
	public List<EmployeeInfo_VO> getEmpContents(String id) throws Exception {
		// TODO Auto-generated method stub
		return dash_Dao.getEmpContents(id);
	}

	@Override
	public List<Calendar_VO> getCalList(Para2VO para2vo) throws Exception {
		// TODO Auto-generated method stub
		return dash_Dao.getCalList(para2vo);
	}

}