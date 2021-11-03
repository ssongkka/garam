package com.garam.web.infomation.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.garam.web.dashboard.service.DashboardService;
import com.garam.web.infomation.model.InfomationListVO;
import com.garam.web.infomation.service.InfomationService;

@Controller
@RequestMapping(value = "/")
public class InfomationController {

	@Inject
	private InfomationService infomationService;

	@RequestMapping(value = "/infomation", method = RequestMethod.GET)
	public String getInfomationList(Model model) throws Exception {
		model.addAttribute("infoList", infomationService.getInfomationList());
		return "infomation/infomation";
	}

	@RequestMapping(value = "/infomation/infomationForm")
	public String infomationForm() {
		return "/infomation/infomationForm";
	}

	@RequestMapping(value = "/infomationSave", method = RequestMethod.POST)
	public String infomationSave(@ModelAttribute("InfomationListVO") InfomationListVO infomationListVO,
			RedirectAttributes rttr) throws Exception {

		infomationService.insertInfomation(infomationListVO);

		return "redirect:/infomation";
	}

}