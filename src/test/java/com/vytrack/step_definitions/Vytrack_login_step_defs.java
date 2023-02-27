package com.vytrack.step_definitions;

import com.vytrack.pages.Vytrack_login_page;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Vytrack_login_step_defs {

    Vytrack_login_page page = new Vytrack_login_page();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack_url"));
    }
    @When("user log in as the {string}")
    public void user_log_in_as_the(String position) {

        position = position.toLowerCase().trim();
        for (int i = 0; i < position.length(); i++) {
            position=position.replaceAll(" ","");
            position=position.trim().toLowerCase();
        }

        if (position.equals("driver")){
            page.input_username.sendKeys(ConfigurationReader.getProperty("driver_username"));
            page.input_password.sendKeys(ConfigurationReader.getProperty("driver_password"));
            page.btn_login.click();
        }

        if (position.equals("salesmanager")){
            BrowserUtils.sleep(2);
            page.input_username.sendKeys(ConfigurationReader.getProperty("salesmanager_username"));
            page.input_password.sendKeys(ConfigurationReader.getProperty("salesmanager_password"));
            page.btn_login.click();
        }

        if (position.equals("storemanager")){
            page.input_username.sendKeys(ConfigurationReader.getProperty("storemanager_username"));
            page.input_password.sendKeys(ConfigurationReader.getProperty("storemanager_password"));
            page.btn_login.click();
        }

    }
    @Then("user should see the title {string}")
    public void user_should_see_the_title(String actualTitle) {
        Assert.assertEquals("Dashboard",actualTitle);
    }


}
