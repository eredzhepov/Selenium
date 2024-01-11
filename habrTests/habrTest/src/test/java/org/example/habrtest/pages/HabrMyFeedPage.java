package org.example.habrtest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HabrMyFeedPage {
    WebDriver driver;
    @FindBy(css = ".tm-section-name__text")
    private WebElement myFeedSummary;
    public Boolean myFeedSummaryIsDisplayed(){
        return myFeedSummary.isDisplayed();
    }
    public HabrMyFeedPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
