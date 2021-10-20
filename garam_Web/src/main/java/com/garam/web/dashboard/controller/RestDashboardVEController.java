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
import com.garam.common.model.VehicleInfo_VO;
import com.garam.web.dashboard.service.DashboardService;

@RestController
@RequestMapping(value = "/dashVE")
public class RestDashboardVEController {

	private static final Logger logger = LoggerFactory.getLogger(DashboardController.class);

	@Inject
	private DashboardService dashBoardService;

	@RequestMapping(value = "/getVEContents", method = { RequestMethod.POST })
	public List<VehicleInfo_VO> getEmpContents(@RequestParam("car_number") String car_number) throws Exception {
		return dashBoardService.getVEContents(car_number);
	}
}