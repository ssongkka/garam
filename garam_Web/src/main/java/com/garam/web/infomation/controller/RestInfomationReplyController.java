package com.garam.web.infomation.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.garam.common.model.para.ParameterVO;
import com.garam.web.infomation.model.InfomationReplyVO;
import com.garam.web.infomation.service.InfomationService;

@RestController
@RequestMapping(value = "/infomationReply")
public class RestInfomationReplyController {

	private static final Logger logger = LoggerFactory.getLogger(RestInfomationReplyController.class);

	@Inject
	private InfomationService infomationService;

	@RequestMapping(value = "/getInfomationList", method = { RequestMethod.POST })
	public List<InfomationReplyVO> getInfomationReplyList(@RequestBody ParameterVO parameterVO) throws Exception {
		return infomationService.getInfomationReplyList(parameterVO);
	}

	@RequestMapping(value = "/infomationSave", method = { RequestMethod.POST })
	public int InfomationReplySave(@RequestBody InfomationReplyVO infomationReplyVO) throws Exception {
		return infomationService.insertInfomationReply(infomationReplyVO);
	}
}