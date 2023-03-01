package com.vytrack.pages;

import com.vytrack.utilities.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignSC_Page {
    public CampaignSC_Page() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@class='dropdown dropdown-level-1'])[5]")
    public WebElement btn_marketing;

    @FindBy(xpath = "(//a[@href='/campaign/'])[3]")
    public WebElement btn_campaign;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement btn_createCampaign;

    @FindBy(xpath = "//span[@class='select2-arrow']")
    public WebElement btn_owner;


    @FindBy(xpath = "//input[contains(@class,'select2-input')]")
    public WebElement inp_owner;

    @FindBy(xpath = "//input[contains(@id,'oro_campaign_form_name')]")
    public WebElement inp_name;

    @FindBy(xpath = "//input[contains(@id,'oro_campaign_form_code')]")
    public WebElement inp_code;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[1]")
    public WebElement inp_startDate;

    public WebElement selectDate(String num){
        String date = "//table//tbody//tr//td[.='" + num + "']";

        return Driver.getDriver().findElement(By.xpath(date));

    }

    

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[2]")
    public WebElement inp_endDate;

    @FindBy(xpath = "//body[contains(@id,'oro_campaign_form_description')]")
    public WebElement inp_description;

    @FindBy(xpath = "//input[contains(@id,'oro_campaign_form_budget')]")
    public WebElement inp_budget;

    @FindBy(xpath = "//select[contains(@id,'oro_campaign_form_reportPeriod')]")
    public WebElement select_report;

    @FindBy(xpath = "//button[@class='btn btn-success main-group action-button']")
    public WebElement btn_save;





































}
