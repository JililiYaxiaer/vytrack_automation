package com.vytrack.step_definitions;

import com.vytrack.pages.History_functions_page;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class History_step_defs {

    History_functions_page page = new History_functions_page();

    @When("user clicks hamburger icon dropdown will be displayed")
    public void user_clicks_hamburger_icon_dropdown_will_be_displayed() {
        BrowserUtils.sleep(5);
        page.icon_hamburger.click();
        Assert.assertTrue(page.dropdown.isDisplayed());
    }

    @Then("user could navigate to {string} page")
    public void user_could_navigate_to_page(String title) {
        BrowserUtils.sleep(5);
        page.navigateToPage(title);
    }

    @Then("user be able to see the title contains {string} page")
    public void user_be_able_to_see_the_title_contains_page(String expected) {
        BrowserUtils.sleep(5);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expected));
    }
    @Then("user will see previous searched page {string} been displayed as the first in the queue")
    public void user_will_see_previous_searched_page_been_displayed_as_the_first_in_the_queue(String firstPage) {
        BrowserUtils.sleep(5);
        Assert.assertTrue(page.selection_first.getText().equals(firstPage));

    }

}
