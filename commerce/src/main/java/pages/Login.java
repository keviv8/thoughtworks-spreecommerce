package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

    @FindBy(id = "spree_user_email")
    WebElement username;

    @FindBy(id = "spree_user_password")
    WebElement password;
    @FindBy(xpath = "//*[@value='Login']")
    WebElement loginbutton;

    public void enterUsername(String uname) {
        this.username.sendKeys(uname);
    }

    public void enterPass(String passkey) {
        this.password.sendKeys(passkey);
    }

    public void clickLogin() {
        this.loginbutton.click();
    }

}
