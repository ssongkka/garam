package com.garam.web.dashboard.service;

import java.util.List;

import com.garam.common.model.CalendarMake_VO;
import com.garam.common.model.Calendar_VO;
import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.Ve_Id2_VO;
import com.garam.common.model.VehicleInfo_VO;
import com.garam.common.model.VehicleList_VO;
import com.garam.common.model.para.ParameterVO;
import com.garam.web.dashboard.model.info_VO;

public interface DashboardService {

	public List<EmployeeList_VO> getEmpList(ParameterVO parameterVO) throws Exception;

	public List<VehicleList_VO> getVeList(ParameterVO parameterVO) throws Exception;

	public List<Ve_Id2_VO> getVeIDList() throws Exception;

	public List<EmployeeInfo_VO> getEmpContents(String id) throws Exception;

	public List<VehicleInfo_VO> getVEContents(String car_number) throws Exception;

	public List<CalendarMake_VO> getCalMake(ParameterVO parameterVO) throws Exception;

	public List<Calendar_VO> getCalList(ParameterVO parameterVO) throws Exception;

	public int getEmpListCnt() throws Exception;

	public int getVEListCnt() throws Exception;

	public List<info_VO> getInfoList(ParameterVO parameterVO) throws Exception;

	public int getInfoListCnt() throws Exception;
}
