package org.example.habrtest.pages.MainPage;

import org.example.habrtest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import java.util.List;

public class HabrAllFlowsPage {
    WebDriver driver;
    AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(HabrAllFlowsPage.class));
    @FindBy(css = ".tm-section-name__text")
    private WebElement allFlowsSummary;
    public Boolean flowsSummaryIsDisplayed(){
        LOG.info("Отображение заголовка на странице с потоками");
        return allFlowsSummary.isDisplayed();
    }
    @FindBy(css = ".tm-tabs__tab-link.tm-tabs__tab-link")
    private List<WebElement> menuElements;
    public HabrAllFlowsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".tm-tabs__tab-link.tm-tabs__tab-link")
    private List<WebElement> allFlowsMenuList;
    public int getMenuPunctsAmount(){
        LOG.info("Вывести количество пунктов меню на странице Все потоки");
        return allFlowsMenuList.size();
    }
    public List<WebElement> getAllFlowsMenuList(){
        LOG.info("Возратить весь список меню");
        return allFlowsMenuList;
    }

}
