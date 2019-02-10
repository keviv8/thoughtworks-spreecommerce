package steps;

import org.openqa.selenium.support.PageFactory;
import pages.Home;
import pages.Login;
import pages.UserLandingPage;
import util.DriverManager;


public class LogUserOut {
    UserLandingPage landingPage;

    public LogUserOut() {
        landingPage = PageFactory.initElements(DriverManager.driver, UserLandingPage.class);
    }

    public void logout() {
        landingPage.logOut();
    }
}
