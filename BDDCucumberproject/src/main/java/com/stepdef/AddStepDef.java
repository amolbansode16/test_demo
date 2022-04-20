package com.stepdef;

import org.junit.Assert;

import calculator.Addition;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddStepDef {
	
	public Addition add;
	
	@Before
	public void setUp()
	{
		 add=new Addition();
	}
	@Given("^two numbers$")
	public void two_numbers() throws Throwable {
	   Assert.assertNotNull(add);
	}
	@When("^add two number (\\d+) and (\\d+)$")
	public void add_two_number_and(int arg1, int arg2) throws Throwable {
	   add.addition(arg1, arg2);
	}





	@Then("^result should be (\\d+)$")
	public void result_should_be(int arg1) throws Throwable {
	   System.out.println(arg1);
	   System.out.println(add.getResult());
	   
	   Assert.assertEquals(arg1, add.getResult());
	}
}
