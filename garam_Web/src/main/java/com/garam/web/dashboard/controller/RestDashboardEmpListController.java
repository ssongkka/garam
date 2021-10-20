package com.garam.web.dashboard.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.Pagination;
import com.garam.common.model.para.ParaInt2VO;
import com.garam.web.dashboard.service.DashboardService;

@RestController
@RequestMapping(value = "/dashEmpList")
public class RestDashboardEmpListController {

	private static final Logger logger = LoggerFactory.getLogger(DashboardController.class);

	@Inject
	private DashboardService dashBoardService;

	@RequestMapping(value = "/getEmpList", method = { RequestMethod.POST })
	public List<EmployeeList_VO> getEmpList(@RequestBody ParaInt2VO paraint2VO, Model model) throws Exception {
		return dashBoardService.getEmpList(paraint2VO);
	}

	@RequestMapping(value = "/getEmpListCnt", method = { RequestMethod.POST })
	public int getEmpListCnt() throws Exception {
		return dashBoardService.getEmpListCnt();
	}
}