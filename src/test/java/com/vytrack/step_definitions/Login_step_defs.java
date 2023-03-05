package com.vytrack.step_definitions;

import com.vytrack.pages.Login_page;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_step_defs {

    Login_page page = new Login_page();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
    }
    @When("user log in as the {string}")
    public void user_log_in_as_the(String position) {

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));

        position = position.toLowerCase().trim();
        for (int i = 0; i < position.length(); i++) {
            position=position.replaceAll(" ","");
            position=position.trim().toLowerCase();
        }

        if (position.equals("driver")){
           page.login_driver();
        }

        if (position.equals("salesmanager")){
           page.login_salesManager();
        }

        if (position.equals("storemanager")){
           page.login_storeManager();
        }

    }
    @Then("user should see the title {string}")
    public void user_should_see_the_title(String actualTitle) {
        Assert.assertEquals("Dashboard",actualTitle);
    }


}
