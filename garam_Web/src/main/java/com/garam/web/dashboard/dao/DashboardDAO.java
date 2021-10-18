package com.garam.web.dashboard.dao;

import java.util.List;

import com.garam.common.model.Calendar_VO;
import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.Ve_Id2_VO;
import com.garam.common.model.VehicleInfo_VO;
import com.garam.common.model.para.Para2VO;
import com.garam.common.util.Pagination;

public interface DashboardDAO {
	public List<EmployeeList_VO> getEmpList(Pagination pagination) throws Exception;

	public List<VehicleInfo_VO> getVeList() throws Exception;

	public List<Ve_Id2_VO> getVeIDList() throws Exception;

	public List<EmployeeInfo_VO> getEmpContents(String id) throws Exception;

	public List<Calendar_VO> getCalList(Para2VO para2vo) throws Exception;

	public int getEmpListCnt() throws Exception;
}