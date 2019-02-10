package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Products {

    @FindBy(id = "products")
    WebElement prodlist;

    @FindBy(xpath = "//*[@id='products']//child::li/child::a")
    List<WebElement> list;

    @FindBy(id = "keywords")
    WebElement searchbox;

    @FindBy(xpath="//*[@value='Search']")
    WebElement searchbutton;

    @FindBy(id = "add-to-cart-button")
    WebElement addtocart;

    public void enterSearchString(String prodname) {
        this.searchbox.sendKeys(prodname);
    }

    public void clickSearch() {
        this.searchbutton.click();
    }

    public List<WebElement> productListing(){
        return list;
    }

    public void clickProduct(WebElement el) {
        el.click();
    }

    public void addToCart() {
        addtocart.click();
    }


}
