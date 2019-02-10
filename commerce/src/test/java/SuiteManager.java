import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import util.DriverManager;

public class SuiteManager {
    public static WebDriver driver;
    @BeforeSuite
    @Parameters({"browser"})
    public void InstantiateBrowser(String bro) {
        DriverManager driverManager = new DriverManager(bro);
        driver= driverManager.driver;


    }

    @AfterSuite
    public void closeBrowser() {
        driver.quit();
    }
}
