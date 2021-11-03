package com.garam.web.infomation.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

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
	public int insertInfomation(InfomationListVO infomationlistVO) throws Exception {
		return sqlSession.insert("com.garam.web.infomation.Infomation_Mapper.insertInfomation", infomationlistVO);
	}

	@Override
	public int updateInfomation(InfomationListVO infomationlistVO) throws Exception {
		return sqlSession.update("com.garam.web.infomation.Infomation_Mapper.updateInfomation", infomationlistVO);
	}

	@Override
	public int deleteInfomation(int no) throws Exception {
		return sqlSession.update("com.garam.web.infomation.Infomation_Mapper.deleteInfomation", no);
	}

}
