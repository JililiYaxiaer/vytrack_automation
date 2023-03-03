package com.vytrack.step_definitions;

import com.vytrack.pages.VytrackPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NewContactSD {
    VytrackPage vtPage = new VytrackPage();

    @Given("User go to login page and put valid credentials")
    public void userGoToLoginPageAndPutValidCredentials() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        vtPage.loginAsUser();
    }

    @When("User get link {string} on main page and click it")
    public void userGetLinkOnMainPageAndClickIt(String link) {
        BrowserUtils.sleep(3);
        System.out.println(vtPage.createContactLink.getText());
        Assert.assertEquals(link, vtPage.createContactLink.getText());
        vtPage.createContactLink.click();
    }


    @Then("Verify user sees {string}  in the title")
    public void verifyUserSeesContainsInTheTitle(String title) {
        BrowserUtils.sleep(3);
        Assert.assertEquals(title, Driver.getDriver().getTitle());
    }

    @And("User enters {string}:{string}")
    public void userEnters(String credentials, String inputs) {
        vtPage.validCredentials(credentials,inputs);

    }


    @Then("User should be able see confirmation message:{string}")
    public void userShouldBeAbleSeeConfirmationMessage(String arg0) {
    }


}



