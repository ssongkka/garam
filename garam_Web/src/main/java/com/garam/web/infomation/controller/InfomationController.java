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
import com.garam.web.infomation.model.InfomationListParamVO;
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
			@ModelAttribute("InfomationListParamVO") InfomationListParamVO infomationListParamVO,
			RedirectAttributes rttr) throws Exception {

		String check = this.infomationService.insertInfomation(infomationListParamVO);
		System.out.println("확인해봐라   " + check);
		if (check != null) {
			model.addAttribute("msg", "등록 완료");
			return "infomation/infomationSave";
		} else {
			model.addAttribute("msg", "등록 실패!");
			return "infomation/infomationSave";
		}
	}

	@RequestMapping(value = "/infomation/infomationContent", method = RequestMethod.GET)
	public String getInfomationContent(Model model, @RequestParam("no") int no) throws Exception {
		model.addAttribute("infomationContent", infomationService.getInfomationContent(no));
		return "infomation/infomationContent";
	}

	@RequestMapping(value = "/infomation/infomationContent/infomationComplete", method = RequestMethod.GET)
	public String completeInfomation(RedirectAttributes rttr, @RequestParam("no") int no) throws Exception {
		infomationService.completeInfomation(no);
		return "redirect:/infomation";
	}
}