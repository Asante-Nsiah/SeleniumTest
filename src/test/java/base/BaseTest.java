package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://invoice-app-6rkf.vercel.app/");

        homePage = new HomePage(driver);

        WebElement cardOpen = driver.findElement(By.cssSelector("div.theme-switcher img.moon"));
        cardOpen.click();



        System.out.println(driver.getTitle());
        ;
//       driver.quit();
    }

    public static void main(String[] args) {
        BaseTest test = new BaseTest();
        test.setUp();
    }
}
