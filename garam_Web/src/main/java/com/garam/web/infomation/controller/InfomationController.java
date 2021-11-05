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
import com.garam.web.infomation.model.InfomationReplyVO;
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
	public String infomationForm(@ModelAttribute("InfomationListVO") InfomationListVO infomationListVO, Model model) {
		return "infomation/infomationForm";
	}

	@RequestMapping(value = "/infomation/infomationSave", method = RequestMethod.POST)
	public String infomationSave(Model model, @ModelAttribute("InfomationListVO") InfomationListVO infomationListVO,
			@RequestParam("mode") String mode) throws Exception {

		if (mode.equals("edit")) {
			String check = this.infomationService.updateInfomation(infomationListVO);
			if (check != null) {
				int num = infomationListVO.getNo();

				model.addAttribute("msg", "수정 완료");
				model.addAttribute("url", "/infomation/infomationContent" + "?no=" + num);
				return "layout/alertInfo";
			} else {
				model.addAttribute("msg", "수정 실패!");
				model.addAttribute("url", "/infomation/infomationForm");
				return "layout/alertInfo";
			}
		} else {
			String check = this.infomationService.insertInfomation(infomationListVO);
			if (check != null) {
				model.addAttribute("msg", "등록 완료");
				model.addAttribute("url", "/infomation");
				return "layout/alertInfo";
			} else {
				model.addAttribute("msg", "등록 실패!");
				model.addAttribute("url", "/infomation/infomationForm");
				return "layout/alertInfo";
			}
		}

	}

	@RequestMapping(value = "/infomation/infomationContent", method = RequestMethod.GET)
	public String getInfomationContent(Model model, @RequestParam("no") int no) throws Exception {
		model.addAttribute("infomationContent", infomationService.getInfomationContent(no));
		model.addAttribute("infomationReplyVO", new InfomationReplyVO());
		return "infomation/infomationContent";
	}

	@RequestMapping(value = "/infomation/infomationdDelete")
	public String deleteInfomationContent(Model model, @RequestParam("no") int no) throws Exception {
		int check = infomationService.deleteInfomation(no);

		System.out.println("삭제  " + check);

		if (check > 0) {
			model.addAttribute("msg", "삭제 완료");
			model.addAttribute("url", "/infomation");
			return "layout/alertInfo";
		} else {
			model.addAttribute("msg", "삭제 실패!");
			model.addAttribute("url", "/infomation/infomationForm");
			return "layout/alertInfo";
		}
	}

	@RequestMapping(value = "/infomation/infomationEdit")
	public String editForm(@RequestParam("no") int no, @RequestParam("mode") String mode, Model model)
			throws Exception {
		model.addAttribute("infomationContent", infomationService.getInfomationContent(no));
		model.addAttribute("mode", mode);
		model.addAttribute("InfomationListVO", new InfomationListVO());

		return "infomation/infomationForm";
	}
}