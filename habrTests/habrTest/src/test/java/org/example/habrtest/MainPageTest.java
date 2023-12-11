package org.example.habrtest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class MainPageTest {
    private WebDriver driver;


    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.habr.com/");


    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void shapowBoxFind() {

        WebElement enterButton = driver.findElement(By.xpath("//a/button[contains(text(), 'Войти')] "));
        enterButton.click();
        List<WebElement> shadowBox = driver.findElements(By.xpath("//*[@class = 'shadow-box']"));
        assertFalse(shadowBox.isEmpty(), "Shadowbox меню не найдено");

    }
    @Test
    public void searchGames() {
        String word = "Reforge";
        WebElement searchMagnif = driver.findElement(By.xpath("//a[@href = \"/ru/search/\" ]"));
        searchMagnif.click();
        WebElement searchField = driver.findElement(By.xpath("//input[@name = 'q' ]"));
        searchField.sendKeys(word);
        WebElement searchButton = driver.findElement(By.xpath("//div[@class='tm-input-text-decorated__label tm-input-text-decorated__label_after']"));
        searchButton.click();
        assertEquals(word, "Reforge", "Не верное значение в строке поиска");

    }
}
