package com.garam.web.dashboard.service;

import java.util.List;

import com.garam.common.model.Calendar_VO;
import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.Ve_Id2_VO;
import com.garam.common.model.VehicleInfo_VO;
import com.garam.common.model.para.Para2VO;

public interface DashboardService {

	public List<EmployeeList_VO> getEmpList() throws Exception;

	public List<VehicleInfo_VO> getVeList() throws Exception;

	public List<Ve_Id2_VO> getVeIDList() throws Exception;

	public List<EmployeeInfo_VO> getEmpContents(String id) throws Exception;

	public List<Calendar_VO> getCalList(Para2VO para2vo) throws Exception;
}
