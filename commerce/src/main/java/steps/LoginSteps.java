package steps;

import org.openqa.selenium.support.PageFactory;
import pages.Home;
import pages.Login;
import pages.UserLandingPage;
import util.DriverManager;


public class LoginSteps {

    Home homePage;
    Login loginPage;
    UserLandingPage landingPage;


   public LoginSteps() {
        homePage = PageFactory.initElements(DriverManager.driver, Home.class);
        loginPage = PageFactory.initElements(DriverManager.driver, Login.class);
        landingPage = PageFactory.initElements(DriverManager.driver, UserLandingPage.class);

    }

    public String Login(String username, String password) {

//        new DriverManager();
//        driver = DriverManager.driver;
//
//        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.id("link-to-login")));
        homePage.clickOnLoginLink();
        loginPage.enterUsername(username);
        loginPage.enterPass(password);
        loginPage.clickLogin();


//        WebElement login_button = driver.findElement(By.id("link-to-login"));
//        login_button.click();
//
//        WebElement userName = driver.findElement(By.id("spree_user_email"));
//        userName.sendKeys(username);
//        WebElement passKey = driver.findElement(By.id("spree_user_password"));
//        passKey.sendKeys(password);
//        driver.findElement(By.xpath("//*[@value='Login']")).submit();
//        new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MY ACCOUNT")));
//        WebElement myAccountLink = driver.findElement(By.linkText("MY ACCOUNT"));
        String actual = landingPage.getMyAccountText();
        return actual;


    }
}
