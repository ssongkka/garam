package com.garam.web.infomation.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.garam.common.model.para.ParameterVO;
import com.garam.web.infomation.service.InfomationService;

@RestController
@RequestMapping(value = "/infomationComplete")
public class RestInfomationController {

	private static final Logger logger = LoggerFactory.getLogger(RestInfomationController.class);

	@Inject
	private InfomationService infomationService;

	@RequestMapping(value = "/complete", method = { RequestMethod.POST })
	public int complete(@RequestBody ParameterVO parameterVO) throws Exception {
		return infomationService.completeInfomation(parameterVO);
	}

	@RequestMapping(value = "/undoComplete", method = { RequestMethod.POST })
	public int undoComplete(@RequestBody ParameterVO parameterVO) throws Exception {
		return infomationService.undoCompleteInfomation(parameterVO);
	}
}