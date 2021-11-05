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
		return "infomation/infomationForm";
	}

	@RequestMapping(value = "/infomation/infomationSave", method = RequestMethod.POST)
	public String infomationSave(Model model,
			@ModelAttribute("InfomationListParamVO") InfomationListVO infomationListVO) throws Exception {

		String check = this.infomationService.insertInfomation(infomationListVO);
		if (check != null) {
			model.addAttribute("msg", "��� �Ϸ�");
			model.addAttribute("url", "/infomation");
			return "layout/alertInfo";
		} else {
			model.addAttribute("msg", "��� ����!");
			model.addAttribute("url", "/infomation/infomationForm");
			return "layout/alertInfo";
		}
	}

	@RequestMapping(value = "/infomation/infomationContent", method = RequestMethod.GET)
	public String getInfomationContent(Model model, @RequestParam("no") int no) throws Exception {
		model.addAttribute("infomationContent", infomationService.getInfomationContent(no));
		return "infomation/infomationContent";
	}

	@RequestMapping(value = "/infomation/infomationdDelete")
	public String deleteInfomationContent(Model model, @RequestParam("no") int no) throws Exception {
		int check = infomationService.deleteInfomation(no);

		System.out.println("����  " + check);

		if (check > 0) {
			model.addAttribute("msg", "���� �Ϸ�");
			model.addAttribute("url", "/infomation");
			return "layout/alertInfo";
		} else {
			model.addAttribute("msg", "���� ����!");
			model.addAttribute("url", "/infomation/infomationForm");
			return "layout/alertInfo";
		}
	}
}