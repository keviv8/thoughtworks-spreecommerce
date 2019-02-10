package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLandingPage {

    @FindBy(linkText = "MY ACCOUNT")
    WebElement myAccount;

    @FindBy(linkText = "LOGOUT")
    WebElement logoutButton;



    public String getMyAccountText() {

                return myAccount.getText();
    }

    public void logOut() {
        logoutButton.click();
    }

}
