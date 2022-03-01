package com.stepdef;

import org.junit.Assert;

import com.utility.Addition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	 Addition addition;
	@Before
	public void setUp()
	{
		addition=new Addition();
	}
	

@Given("^two numbers	#some precondition step$")
public void two_numbers_some_precondition_step() throws Throwable {
	Assert.assertNotNull(addition);
   }

@When("^add two numbers (\\d+) and (\\d+)	#some Key actions$")
public void add_two_numbers_and_some_Key_actions(int arg1, int arg2) throws Throwable {
  addition.add(arg1, arg2);
}

@Then("^result should be (\\d+)	#outcome or validation$")
public void result_should_be_outcome_or_validation(int arg1) throws Throwable {
   System.out.println(arg1);
   Assert.assertEquals(arg1, addition.returnResult());
}

@After
public void tearDown()
{
	
}

}
