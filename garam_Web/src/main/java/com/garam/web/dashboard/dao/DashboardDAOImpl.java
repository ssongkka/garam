package com.garam.web.dashboard.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.garam.common.model.Calendar_VO;
import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.Ve_Id2_VO;
import com.garam.common.model.VehicleInfo_VO;
import com.garam.common.model.para.Para2VO;
import com.garam.common.util.Pagination;

@Repository
public class DashboardDAOImpl implements DashboardDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<EmployeeList_VO> getEmpList(Pagination pagination) throws Exception {
		return sqlSession.selectList("com.garam.web.common.EmployeeInfo_Mapper.get_Emp_List", pagination);
	}

	@Override
	public List<VehicleInfo_VO> getVeList() throws Exception {
		return sqlSession.selectList("com.garam.web.common.VehicleInfo_Mapper.get_Ve_List");
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
	public List<Calendar_VO> getCalList(Para2VO para2vo) throws Exception {
		return sqlSession.selectList("com.garam.web.common.Calendar_Mapper.get_Cal_Data", para2vo);
	}

	@Override
	public int getEmpListCnt() throws Exception {
		return sqlSession.selectOne("com.garam.web.common.EmployeeInfo_Mapper.get_Emp_List_Cnt");
	}
}