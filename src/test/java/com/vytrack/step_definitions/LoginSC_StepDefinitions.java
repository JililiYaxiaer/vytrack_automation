package com.vytrack.step_definitions;

import com.vytrack.pages.LoginSC_Page;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginSC_StepDefinitions {

    LoginSC_Page loginSCPage = new LoginSC_Page();

    @When("user login as {string}")
    public void user_login_as(String user) {
       if (user.contains("Sales")){
           loginSCPage.login_salesManager();
       } else if (user.contains("Store")){
           loginSCPage.login_salesManager();
       } else if (user.contains("Driver")){
           loginSCPage.login_driver();
       }else{
           System.out.println("Invalid chaice");
       }
    }
    @Then("user sould see the title is {string}")
    public void user_sould_see_the_title_is(String expectedTitle) {
     String actualTitle = Driver.getDriver().getTitle();

     Assert.assertEquals(actualTitle,expectedTitle);

    }


}