package com.garam.web.dashboard.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.garam.common.model.CalendarMake_VO;
import com.garam.common.model.Calendar_VO;
import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.Ve_Id2_VO;
import com.garam.common.model.VehicleInfo_VO;
import com.garam.common.model.VehicleList_VO;
import com.garam.common.model.para.ParameterVO;
import com.garam.web.dashboard.dao.DashboardDAO;
import com.garam.web.dashboard.model.info_VO;

@Service
public class DashboardServiceImpl implements DashboardService {

	@Inject
	private DashboardDAO dash_Dao;

	@Override
	public List<EmployeeList_VO> getEmpList(ParameterVO parameterVO) throws Exception {
		return dash_Dao.getEmpList(parameterVO);
	}

	@Override
	public List<VehicleList_VO> getVeList(ParameterVO parameterVO) throws Exception {
		return dash_Dao.getVeList(parameterVO);
	}

	@Override
	public List<Ve_Id2_VO> getVeIDList() throws Exception {
		return dash_Dao.getVeIDList();
	}

	@Override
	public List<EmployeeInfo_VO> getEmpContents(String id) throws Exception {
		return dash_Dao.getEmpContents(id);
	}

	@Override
	public List<VehicleInfo_VO> getVEContents(String car_number) throws Exception {
		return dash_Dao.getVEContents(car_number);
	}

	@Override
	public List<CalendarMake_VO> getCalMake(ParameterVO parameterVO) throws Exception {
		return dash_Dao.getCalMake(parameterVO);
	}

	@Override
	public List<Calendar_VO> getCalList(ParameterVO parameterVO) throws Exception {
		return dash_Dao.getCalList(parameterVO);
	}

	@Override
	public int getEmpListCnt() throws Exception {
		return dash_Dao.getEmpListCnt();
	}

	@Override
	public int getVEListCnt() throws Exception {
		return dash_Dao.getVEListCnt();
	}

	@Override
	public List<info_VO> getInfoList(ParameterVO parameterVO) throws Exception {
		return dash_Dao.getInfoList(parameterVO);
	}

	@Override
	public int getInfoListCnt() throws Exception {
		return dash_Dao.getInfoListCnt();
	}
}