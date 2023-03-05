package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class History_functions_page {

    public History_functions_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//a[@class='oro-dropdown-toggle']")
    public WebElement icon_hamburger;

    @FindBy(xpath = "//div[@class='tabbable tabs-left']")
    public WebElement dropdown;

    @FindBy(xpath = "(//li[@class='first'])[1]")
    public WebElement selection_first;


    public void navigateToPage(String page){
        String locator = "(//div[@class='tab-content']//a[normalize-space()='"+page+"'])[1]";
        WebElement element = Driver.getDriver().findElement(By.xpath(locator));
        element.click();
    }










//(//div[@class='tab-content']//a[normalize-space()='Calendar Events - Activities'])[1]
////ul[@class='extra-list']//li//a

    ////a[normalize-space()='Create Campaign - Campaigns - Marketing']





}
