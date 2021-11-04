package com.garam.web.infomation.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.garam.web.infomation.model.InfomationListParamVO;
import com.garam.web.infomation.model.InfomationListVO;

@Repository
public class InfomationDAOImpl implements InfomationDAO {

	@Inject
	private SqlSession sqlSession;

	@Override
	public List<InfomationListVO> getInfomationList() throws Exception {
		return sqlSession.selectList("com.garam.web.infomation.Infomation_Mapper.getInfomationList");
	}

	@Override
	public InfomationListVO getInfomationContent(int no) throws Exception {
		return sqlSession.selectOne("com.garam.web.infomation.Infomation_Mapper.getInfomationContent", no);
	}

	@Override
	public int insertInfomation(InfomationListParamVO infomationListParamVO) throws Exception {
		return sqlSession.insert("com.garam.web.infomation.Infomation_Mapper.insertInfomation", infomationListParamVO);
	}

	@Override
	public int updateInfomation(InfomationListParamVO infomationListParamVO) throws Exception {
		return sqlSession.update("com.garam.web.infomation.Infomation_Mapper.updateInfomation", infomationListParamVO);
	}

	@Override
	public int deleteInfomation(int no) throws Exception {
		return sqlSession.update("com.garam.web.infomation.Infomation_Mapper.deleteInfomation", no);
	}

	@Override
	public int completeInfomation(int no) throws Exception {
		return sqlSession.update("com.garam.web.infomation.Infomation_Mapper.completeInfomation", no);
	}
}
