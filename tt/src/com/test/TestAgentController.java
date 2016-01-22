package com.test;

import com.enuoai.soa.agent.controller.AgentController;
import com.enuoai.soa.agent.controller.AgentControllerService;
import com.enuoai.soa.agent.controller.CommissionData;
import com.enuoai.soa.agent.controller.CommissionDataResult;
import com.enuoai.soa.agent.controller.CommissionParm;

public class TestAgentController {

	public static void main(String[] args) {
		AgentControllerService service = new AgentControllerService();
		AgentController agentController = service.getAgentControllerPort();
		
		CommissionParm commissionParm = new CommissionParm();
		commissionParm.setAgentId("b6c94b5a1c104656aecf8942eef61222");
		commissionParm.setStartDate("2015-01-01");
		commissionParm.setEndDate("2016-01-01");
		CommissionDataResult rs = agentController.getCommission(commissionParm );
		CommissionData data = rs.getData();
		System.out.println(data.getMonthCommissionList());
		System.out.println(data.getTotalCommission());
		System.out.println(data.getTotalOpenAccountCommission());
	}
}
