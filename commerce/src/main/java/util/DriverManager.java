package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;

public class DriverManager {
    public static WebDriver driver;


    public DriverManager(@Optional("Chrome") String browser) {
        if (browser.equals("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkolla\\Documents\\Automation KT\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("disable-infobars");
            options.addArguments("--disable-extensions");
            driver = new ChromeDriver(options);
        }
        if (browser.equals("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\vkolla\\Documents\\Automation KT\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.get("http://10.136.127.137:3000/");

    }

}
