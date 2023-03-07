package com.vytrack.step_definitions;


import com.vytrack.pages.NewContactAT_Page;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class NewContactStepDefs {
    NewContactAT_Page vtPage = new NewContactAT_Page();

    @Given("User go to login page and put valid credentials")
    public void userGoToLoginPageAndPutValidCredentials() {
        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        vtPage.loginAsUser();
    }

    @When("User get link {string} on main page and click it")
    public void userGetLinkOnMainPageAndClickIt(String link) {
        BrowserUtils.sleep(3);
        Assert.assertEquals(link, vtPage.createContactLink.getText());
        vtPage.createContactLink.click();
    }


    @Then("Verify user sees {string}  in the title")
    public void verifyUserSeesContainsInTheTitle(String title) {
        BrowserUtils.sleep(2);
        Assert.assertEquals(title, Driver.getDriver().getTitle());
        BrowserUtils.sleep(2);
    }

    @Then("User enters all credentials")
    public void user_enters_all_credentials(Map<String,String>list) {
        for (Map.Entry<String, String> each : list.entrySet()) {
            if (each.getKey().equals("method") || each.getKey().equals("gender") || each.getKey().equals("source")) {
                vtPage.dropdownChoice(each.getKey(), each.getValue());
                BrowserUtils.sleep(1);
            } else if (each.getKey().equals("birthday")) {
                vtPage.birthdayTable.click();
                BrowserUtils.sleep(1);
                String[] birthday = each.getValue().split("/");
                int day = Integer.parseInt(birthday[0]);
                int month = Integer.parseInt(birthday[1]);
                int year = Integer.parseInt(birthday[2]);
                vtPage.selectDate(10, 8, 1987);
            } else {
                vtPage.validCredentials(each.getKey(), each.getValue());
                BrowserUtils.sleep(1);
            }
        }

    }
    @Then("User click Save and Close button")
    public void userClickButton() {
        BrowserUtils.sleep(1);
    vtPage.saveAndCloseButton.click();
    }


    @Then("User should be able see confirmation message:{string}")
    public void userShouldBeAbleSeeConfirmationMessage(String message) {
        BrowserUtils.sleep(1);
        Assert.assertTrue(vtPage.msg_save.isDisplayed());
        BrowserUtils.sleep(1);

    }
}



