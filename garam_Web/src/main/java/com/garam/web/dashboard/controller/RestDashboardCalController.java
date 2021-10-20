package com.garam.web.dashboard.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.garam.common.model.Calendar_VO;
import com.garam.common.model.para.ParaStr2VO;
import com.garam.web.dashboard.service.DashboardService;

@RestController
@RequestMapping(value = "/dashCal")
public class RestDashboardCalController {

	private static final Logger logger = LoggerFactory.getLogger(DashboardController.class);

	@Inject
	private DashboardService dashBoardService;

	@RequestMapping(value = "/getCalList", method = { RequestMethod.POST })
	public List<Calendar_VO> getEmpContents(@RequestBody ParaStr2VO para2vo) throws Exception {
		return dashBoardService.getCalList(para2vo);
	}
}