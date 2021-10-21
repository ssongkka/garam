package com.garam.web.dashboard.dao;

import java.util.List;

import com.garam.common.model.CalendarMake_VO;
import com.garam.common.model.Calendar_VO;
import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.Ve_Id2_VO;
import com.garam.common.model.VehicleInfo_VO;
import com.garam.common.model.VehicleList_VO;
import com.garam.common.model.para.ParaInt2VO;
import com.garam.common.model.para.ParaStr2VO;

public interface DashboardDAO {
	public List<EmployeeList_VO> getEmpList(ParaInt2VO paraint2VO) throws Exception;

	public List<VehicleList_VO> getVeList(ParaInt2VO paraint2VO) throws Exception;

	public List<Ve_Id2_VO> getVeIDList() throws Exception;

	public List<EmployeeInfo_VO> getEmpContents(String id) throws Exception;

	public List<VehicleInfo_VO> getVEContents(String car_number) throws Exception;

	public List<CalendarMake_VO> getCalMake(ParaStr2VO para2vo) throws Exception;

	public List<Calendar_VO> getCalList(ParaStr2VO para2vo) throws Exception;

	public int getEmpListCnt() throws Exception;

	public int getVEListCnt() throws Exception;
}