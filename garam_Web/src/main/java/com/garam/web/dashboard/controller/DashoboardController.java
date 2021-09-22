package com.garam.web.dashboard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.VehicleInfo_VO;
import com.garam.web.dashboard.service.DashboardService;

@Controller
@RequestMapping(value = "/")
public class DashoboardController {

	@Inject
	private DashboardService dash_Service;

	@RequestMapping(value = "/dashBoard")
	public String getEmpList(Model model) throws Exception {
		model.addAttribute("empList", dash_Service.getEmpList());
		model.addAttribute("veidList", dash_Service.getVeIDList());
		get_Map_Emp();

		return "dashBoard/dashBoard";
	}

	private void get_Map_Emp() {

		List<EmployeeList_VO> emp_List;
		try {
			emp_List = dash_Service.getEmpList();
			Map<String, String> re_Emp_Map = new HashMap<String, String>();

			for (EmployeeList_VO list : emp_List) {
				re_Emp_Map.put(list.getId(), list.getName());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}