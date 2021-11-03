package com.garam.web.dashboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.garam.common.model.CalendarMake_VO;
import com.garam.common.model.Calendar_VO;
import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.Pagination;
import com.garam.common.model.Ve_Id2_VO;
import com.garam.common.model.VehicleInfo_VO;
import com.garam.common.model.VehicleList_VO;
import com.garam.common.model.para.ParaInt2VO;
import com.garam.common.model.para.ParaStr2VO;
import com.garam.web.dashboard.model.info_VO;

@Repository
public class DashboardDAOImpl implements DashboardDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<EmployeeList_VO> getEmpList(ParaInt2VO paraint2VO) throws Exception {
		return sqlSession.selectList("com.garam.web.common.EmployeeInfo_Mapper.get_Emp_List", paraint2VO);
	}

	@Override
	public List<VehicleList_VO> getVeList(ParaInt2VO paraint2VO) throws Exception {
		return sqlSession.selectList("com.garam.web.common.VehicleInfo_Mapper.get_VE_List", paraint2VO);
	}

	@Override
	public List<Ve_Id2_VO> getVeIDList() throws Exception {
		return sqlSession.selectList("com.garam.web.common.Ve_Id_Mapper.get_Ve_Id_List");
	}

	@Override
	public List<EmployeeInfo_VO> getEmpContents(String id) throws Exception {
		return sqlSession.selectList("com.garam.web.common.EmployeeInfo_Mapper.get_Emp_Contents", id);
	}

	@Override
	public List<VehicleInfo_VO> getVEContents(String car_number) throws Exception {
		return sqlSession.selectList("com.garam.web.common.VehicleInfo_Mapper.get_VE_Contents", car_number);
	}

	@Override
	public List<CalendarMake_VO> getCalMake(ParaStr2VO para2vo) throws Exception {
		return sqlSession.selectList("com.garam.web.common.Calendar_Mapper.get_Make_Cal_Data", para2vo);
	}

	@Override
	public List<Calendar_VO> getCalList(ParaStr2VO para2vo) throws Exception {
		return sqlSession.selectList("com.garam.web.common.Calendar_Mapper.get_Cal_Data", para2vo);
	}

	@Override
	public int getEmpListCnt() throws Exception {
		return sqlSession.selectOne("com.garam.web.common.EmployeeInfo_Mapper.get_Emp_List_Cnt");
	}

	@Override
	public int getVEListCnt() throws Exception {
		return sqlSession.selectOne("com.garam.web.common.VehicleInfo_Mapper.get_VE_List_Cnt");
	}

	@Override
	public List<info_VO> getInfoList(ParaInt2VO paraint2VO) throws Exception {
		return sqlSession.selectList("com.garam.web.dashboard.dashboard_Mapper.get_Info_List", paraint2VO);
	}

	@Override
	public int getInfoListCnt() throws Exception {
		return sqlSession.selectOne("com.garam.web.dashboard.dashboard_Mapper.get_Info_List_Cnt");
	}

}