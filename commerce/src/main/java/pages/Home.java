package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

    @FindBy(id = "link-to-login")
    WebElement loginLink;

    public void clickOnLoginLink() {
        this.loginLink.click();
    }


}
