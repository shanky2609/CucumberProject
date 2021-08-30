package stepdefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
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


}
