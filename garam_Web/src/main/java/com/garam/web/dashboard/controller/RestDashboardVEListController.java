package com.garam.web.dashboard.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.garam.common.model.VehicleList_VO;
import com.garam.common.model.para.ParaInt2VO;
import com.garam.web.dashboard.service.DashboardService;

@RestController
@RequestMapping(value = "/dashVEList")
public class RestDashboardVEListController {

	private static final Logger logger = LoggerFactory.getLogger(DashboardController.class);

	@Inject
	private DashboardService dashBoardService;

	@RequestMapping(value = "/getVEList", method = { RequestMethod.POST })
	public List<VehicleList_VO> getEmpList(@RequestBody ParaInt2VO paraint2VO, Model model) throws Exception {
		return dashBoardService.getVeList(paraint2VO);
	}

	@RequestMapping(value = "/getVEListCnt", method = { RequestMethod.POST })
	public int getEmpListCnt() throws Exception {
		return dashBoardService.getVEListCnt();
	}
}