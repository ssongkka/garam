package com.garam.web;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.garam.common.model.EmployeeInfo_VO;
import com.garam.common.model.EmployeeList_VO;
import com.garam.web.dashboard.dao.DashboardDAO;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration(locations = { "classpath:spring/root-context.xml",

		"classpath:spring/dataSource-context.xml" })

public class dashBoard_Test {

	private static final Logger logger = LoggerFactory.getLogger(DashboardDAO.class);

	@Inject
	private DashboardDAO dashboarddao;

	@Test
	public void test_Get_Emp_List() throws Exception {
		List<EmployeeList_VO> emp_List = dashboarddao.getEmpList();

		logger.info("\n Board \n");
		if (emp_List.size() > 0) {
			for (EmployeeList_VO list : emp_List) {
				logger.info(list.getId());
			}
		} else {
			logger.info("데이터 없음");
		}

	}
}
