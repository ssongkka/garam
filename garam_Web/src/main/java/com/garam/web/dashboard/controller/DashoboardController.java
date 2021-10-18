package com.garam.web.dashboard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.garam.common.model.EmployeeList_VO;
import com.garam.common.model.VehicleInfo_VO;
import com.garam.common.util.Pagination;
import com.garam.common.util.save_Map;
import com.garam.web.dashboard.service.DashboardService;

@Controller
@RequestMapping(value = "/")
public class DashoboardController {

	@Inject
	private DashboardService dash_Service;

	@RequestMapping(value = "/dashBoard")
	public String getList(Model model, @RequestParam(required = false, defaultValue = "1") int page,
			@RequestParam(required = false, defaultValue = "1") int range) throws Exception {

		// 전체 게시글 개수

		int listCnt = dash_Service.getEmpListCnt();
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);
		System.out.println(listCnt);

		System.out.println(page);
		System.out.println(range);

		// Pagination 객체생성

		Pagination pagination = new Pagination();
		pagination.pageInfo(page, range, listCnt);

		model.addAttribute("pagination", pagination);

		model.addAttribute("empList", dash_Service.getEmpList(pagination));
		model.addAttribute("veidList", dash_Service.getVeIDList());
		model.addAttribute("veList", dash_Service.getVeList());

		return "dashBoard/dashBoard";
	}

//	private void get_Map_Emp() {
//
//		List<EmployeeList_VO> emp_List;
//		Map<String, String> re_Emp_Map = new HashMap<String, String>();
//		try {
//			emp_List = dash_Service.getEmpList();
//
//			for (EmployeeList_VO list : emp_List) {
//				re_Emp_Map.put(list.getId(), list.getName());
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		save_Map.setMap_Emp_ID_Name(re_Emp_Map);
//
//		System.out.println(re_Emp_Map);
//	}
//
//	private void get_Map_Ve() {
//
//		List<VehicleInfo_VO> ve_List;
//		Map<String, String> re_Ve_Map = new HashMap<String, String>();
//		try {
//			ve_List = dash_Service.getVeList();
//
//			for (VehicleInfo_VO list : ve_List) {
//				re_Ve_Map.put(list.getCar_number(), list.getVehicle());
//			}
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		save_Map.setMap_Ve_ID_Name(re_Ve_Map);
//
//		System.out.println(re_Ve_Map);
//	}
}