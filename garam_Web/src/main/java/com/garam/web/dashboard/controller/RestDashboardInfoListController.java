package com.garam.web.dashboard.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.garam.common.model.para.ParameterVO;
import com.garam.web.dashboard.model.info_VO;
import com.garam.web.dashboard.service.DashboardService;

@RestController
@RequestMapping(value = "/dashInfoList")
public class RestDashboardInfoListController {

	private static final Logger logger = LoggerFactory.getLogger(DashboardController.class);

	@Inject
	private DashboardService dashBoardService;

	@RequestMapping(value = "/getInfoList", method = { RequestMethod.POST })
	public List<info_VO> getEmpList(@RequestBody ParameterVO parameterVO) throws Exception {
		return dashBoardService.getInfoList(parameterVO);
	}

	@RequestMapping(value = "/getInfoListCnt", method = { RequestMethod.POST })
	public int getEmpListCnt() throws Exception {
		return dashBoardService.getInfoListCnt();
	}
}