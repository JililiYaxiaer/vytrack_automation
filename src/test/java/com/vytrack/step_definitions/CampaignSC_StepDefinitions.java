package com.vytrack.step_definitions;

import com.vytrack.pages.CampaignSC_Page;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class CampaignSC_StepDefinitions {

    CampaignSC_Page campaignSCPage = new CampaignSC_Page();
    Actions actions = new Actions(Driver.getDriver());

    @When("user clicks marketing and clicks campaign")
    public void user_clicks_marketing_and_clicks_campaign() {
      actions.moveToElement(campaignSCPage.btn_marketing).perform();
        BrowserUtils.sleep(2);
      campaignSCPage.btn_campaign.click();
    }
    @When("user click Create Campaign button")
    public void user_click_create_campaign_button() {
        BrowserUtils.sleep(2);
      campaignSCPage.btn_createCampaign.click();
    }
    @When("user is on the Create Campaign page")
    public void user_is_on_the_create_campaign_page() {
        BrowserUtils.sleep(2);
       String expectedTitle = "Create";
       String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
    @When("user choose {string}")
    public void user_choose(String owner) {
        campaignSCPage.btn_owner.click();
        BrowserUtils.sleep(2);
        campaignSCPage.inp_owner.click();
        campaignSCPage.inp_owner.sendKeys(owner);
        BrowserUtils.sleep(2);
        campaignSCPage.inp_owner.sendKeys(Keys.ENTER);

    }
    @When("user enters name {string}")
    public void user_enters_name(String name) {
        BrowserUtils.sleep(2);
       campaignSCPage.inp_name.sendKeys(name);
    }
    @When("user enters code {string}")
    public void user_enters_code(String code) {
    campaignSCPage.inp_code.sendKeys(code);
    }



    @And("user enters start date {string} and  {string} and {string}")
    public void userEntersStartDateAndAnd(String day, String month, String year) {
       campaignSCPage.inp_startDate.click();

        BrowserUtils.sleep(2);

       Select months = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-month']")));
       months.selectByVisibleText(month);

       Select years = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-year']")));

       years.selectByVisibleText(year+"");

       campaignSCPage.selectDate(Integer.parseInt(day)).click();


    }

    @And("user enters end date {string} and  {string} and {string}")
    public void userEntersEndDateAndAnd(String day, String month, String year) {
        campaignSCPage.inp_endDate.click();

        BrowserUtils.sleep(2);

        Select months = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        months.selectByVisibleText(month);

        Select years = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='ui-datepicker-year']")));

        years.selectByVisibleText(year);

        campaignSCPage.selectDate(Integer.parseInt(day)).click();


    }

    @When("user enters description {string}")
    public void user_enters_description(String description) {

       Driver.getDriver().switchTo().frame(0);
       campaignSCPage.inp_description.sendKeys(description);
       BrowserUtils.sleep(2);
       Driver.getDriver().switchTo().parentFrame();
    }
    @When("user enters budget {string}")
    public void user_enters_budget(String budget) {
       campaignSCPage.inp_budget.sendKeys(budget);
    }
    @When("user choose report scale {string}")
    public void user_choose_report_scale(String reportScale) {
        Select select = new Select(campaignSCPage.select_report);
        select.selectByVisibleText(reportScale);
    }
    @When("user clicks save button")
    public void user_clicks_save_button() {
        BrowserUtils.sleep(2);
        campaignSCPage.btn_save.click();
    }


    @Then("user can see successfull message")
    public void userCanSeeSuccessfullMessage() {
        Assert.assertTrue( campaignSCPage.msg_save.isDisplayed());

    }


    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        Assert.assertTrue(campaignSCPage.msg_err_name.isDisplayed());
        Assert.assertTrue(campaignSCPage.msg_err_code.isDisplayed());
    }
}
