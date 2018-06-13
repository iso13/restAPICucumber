package com.step_definitions;

import com.utils.CucumberLog;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {
	@Before
	public void startUp(Scenario scenario){
		CucumberLog.info("# # # # # # # # Started Scenario : " + scenario.getName() + "# # # # # # # # ");
	}

	@After
	public void tearDown(Scenario scenario){
		CucumberLog.info("# # # # # # # # Ended Scenario : " + scenario.getName() + "# # # # # # # # ");
	}

}
