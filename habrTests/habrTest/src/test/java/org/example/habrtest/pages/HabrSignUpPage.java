package org.example.habrtest.pages;

import org.example.habrtest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

public class HabrSignUpPage {
    WebDriver driver;
    AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(HabrSignUpPage.class));
    @FindBy(css = ".shadow-box__title")
    private WebElement signUpShadowBoxTitle;
    public String getSignUpShadowBoxTitle(){
        LOG.info("Получить заголовок окна регистрации");
        return  signUpShadowBoxTitle.getText();
    }
    public HabrSignUpPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
