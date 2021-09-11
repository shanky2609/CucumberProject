package stepdefinations;

import AutomationS.CucumberProject.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{
	
	@Before("@DataParameterization")
	public void beforevalidation()
	{
		System.out.println("I am dataparameterization before");
	}
	
	@After("@DataParameterization")
	public void Aftervalidation()
	{
		System.out.println("I am dataparameterization After");
	}

	@After("@Selenium")
	public void AfterSelenium()
	{
		driver.close();
	}

}
