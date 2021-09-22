package com.garam.web.dashboard.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garam.common.model.EmployeeInfo_VO;
import com.garam.web.dashboard.service.DashboardService;

@RestController
@RequestMapping(value = "/dashEmp")
public class RestDashoboardEmpController {

	private static final Logger logger = LoggerFactory.getLogger(DashoboardController.class);

	@Inject
	private DashboardService dashBoardService;

	@RequestMapping(value = "/getEmpcontents", method = { RequestMethod.POST })
	public List<EmployeeInfo_VO> getEmpContents(@RequestParam("id") String id) throws Exception {
		return dashBoardService.getEmpContents(id);
	}
}