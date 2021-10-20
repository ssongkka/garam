package com.garam.web.dashboard.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.garam.web.dashboard.service.DashboardService;

@Controller
@RequestMapping(value = "/")
public class DashboardController {

	@Inject
	private DashboardService dash_Service;

	@RequestMapping(value = "/dashBoard")
	public String getList(Model model, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "1") int range) throws Exception {

		return "dashBoard/dashBoard";
	}
}