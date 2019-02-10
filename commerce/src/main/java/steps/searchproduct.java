package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.Products;
import util.DriverManager;

import java.util.ArrayList;
import java.util.List;


public class searchproduct {

    Products prodPage;

    public searchproduct() {
        prodPage = PageFactory.initElements(DriverManager.driver, Products.class);
    }

    public void SearchProd(String prodname) {


        System.out.println("In search prod method");
        prodPage.enterSearchString(prodname);
        prodPage.clickSearch();
        List<WebElement> li = prodPage.productListing();
        for (WebElement l : li) {
            System.out.println(l.getText());
            if (l.getText().equals(prodname)) {
                prodPage.clickProduct(l);
                prodPage.addToCart();
                break;
            }
        }
//        prodPage.clickProduct();

//        WebDriver driver = DriverManager.driver;
//        driver.findElement(By.id("keywords")).sendKeys(prodname);
//        driver.findElement(By.xpath("//*[@value='Search']")).click();
//        List<WebElement> l1 = driver.findElements(By.xpath("//*[@id='products']//child::li"));
//        return l1.size();

    }

    public ArrayList<String> ProductListing() {
        WebDriver driver = DriverManager.driver;
        ArrayList<String> pl = new ArrayList<String>();
        List<WebElement> l1 = driver.findElements(By.xpath("//*[@id='products']//child::li/child::a"));
        for (WebElement l : l1) {
            pl.add(l.getText());
        }
        return pl;
    }

}
