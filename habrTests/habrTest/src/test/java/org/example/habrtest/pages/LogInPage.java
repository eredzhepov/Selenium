package org.example.habrtest.pages;

import org.example.habrtest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import static org.example.habrtest.MyWait.myWait;

public class LogInPage {
    WebDriver driver;
    @FindBy(css = ".shadow-box")
    private WebElement shadowBox;
    AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(LogInPage.class));
    public Boolean shadowBoxIsVisible(){
        return shadowBox.isDisplayed();
    }


    @FindBy(css = ".form__remind-password-link")
    private WebElement forgotPasswordButton;
    public void clickForgotPasswordButton(){
        LOG.info("Нажата кнопка Забыли пароль?");
        forgotPasswordButton.click();
    }

    public LogInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
