package com.garam.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.garam.web.User.UserVO;

@Controller
@RequestMapping(value = "/")
public class HomeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginForm(Model model) throws Exception {
		model.addAttribute("userVO", new UserVO());
		return "/home";
	}
}
