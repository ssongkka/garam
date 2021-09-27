package com.garam.web.dashboard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.VehicleInfo_VO;
import com.garam.common.util.save_Map;
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
		model.addAttribute("veList", dash_Service.getVeList());
		get_Map_Emp();
		get_Map_Ve();

		return "dashBoard/dashBoard";
	}

	private void get_Map_Emp() {

		List<EmployeeList_VO> emp_List;
		Map<String, String> re_Emp_Map = new HashMap<String, String>();
		try {
			emp_List = dash_Service.getEmpList();

			for (EmployeeList_VO list : emp_List) {
				re_Emp_Map.put(list.getId(), list.getName());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		save_Map.setMap_Emp_ID_Name(re_Emp_Map);

		System.out.println(re_Emp_Map);
	}

	private void get_Map_Ve() {

		List<VehicleInfo_VO> ve_List;
		Map<String, String> re_Ve_Map = new HashMap<String, String>();
		try {
			ve_List = dash_Service.getVeList();

			for (VehicleInfo_VO list : ve_List) {
				re_Ve_Map.put(list.getCar_number(), list.getVehicle());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		save_Map.setMap_Ve_ID_Name(re_Ve_Map);

		System.out.println(re_Ve_Map);
	}
}