package com.garam.web.infomation.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.garam.common.model.para.ParameterVO;
import com.garam.web.infomation.model.InfomationListVO;
import com.garam.web.infomation.model.InfomationReplyVO;

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
	public int insertInfomation(InfomationListVO infomationListVO) throws Exception {
		return sqlSession.insert("com.garam.web.infomation.Infomation_Mapper.insertInfomation", infomationListVO);
	}

	@Override
	public int updateInfomation(InfomationListVO infomationListVO) throws Exception {
		return sqlSession.update("com.garam.web.infomation.Infomation_Mapper.updateInfomation", infomationListVO);
	}

	@Override
	public int deleteInfomation(int no) throws Exception {
		return sqlSession.update("com.garam.web.infomation.Infomation_Mapper.deleteInfomation", no);
	}

	@Override
	public int completeInfomation(ParameterVO parameterVO) throws Exception {
		return sqlSession.update("com.garam.web.infomation.Infomation_Mapper.completeInfomation", parameterVO);
	}

	@Override
	public int undoCompleteInfomation(ParameterVO parameterVO) throws Exception {
		return sqlSession.update("com.garam.web.infomation.Infomation_Mapper.undoCompleteInfomation", parameterVO);
	}

	@Override
	public List<InfomationReplyVO> getInfomationReplyList(ParameterVO parameterVO) throws Exception {
		return sqlSession.selectList("com.garam.web.infomation.InfomationReply_Mapper.getInfomationReplyList",
				parameterVO);
	}

	@Override
	public int insertInfomationReply(InfomationReplyVO infomationReplyVO) throws Exception {
		return sqlSession.insert("com.garam.web.infomation.InfomationReply_Mapper.insertInfomationReply",
				infomationReplyVO);
	}

	@Override
	public int updateInfomationReply(InfomationReplyVO infomationReplyVO) throws Exception {
		return sqlSession.update("com.garam.web.infomation.InfomationReply_Mapper.updateInfomationReply",
				infomationReplyVO);
	}

	@Override
	public int deleteInfomationReply(ParameterVO parameterVO) throws Exception {
		return sqlSession.update("com.garam.web.infomation.InfomationReply_Mapper.deleteInfomationReply", parameterVO);
	}

	@Override
	public int getReplyCnt(ParameterVO parameterVO) throws Exception {
		return sqlSession.selectOne("com.garam.web.infomation.InfomationReply_Mapper.getInfoReplyListCnt", parameterVO);
	}
}
