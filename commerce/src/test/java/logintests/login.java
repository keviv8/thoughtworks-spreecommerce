package logintests;

import org.testng.Assert;
import org.testng.annotations.*;
import steps.LoginSteps;
import steps.LogUserOut;
import util.DriverManager;


public class login {

    @BeforeSuite
    @Parameters({"browser"})
    public void initiateBrowser(@Optional("Chrome") String bro)
    {
        DriverManager driverManager = new DriverManager(bro);
    }

    @DataProvider(name="login")
    public static Object[][] loginData() {
        return new Object[][] {{"xj@xj.com","123456"},{"xt@xt.com","xtxtxt"},{"abc@abc.com","123456"}};
    }

    @Test(dataProvider = "login")
    @Parameters({"userName", "password"})
    public void testValidLogin(String userName, String password) {

        LoginSteps loginSteps = new LoginSteps();
        LogUserOut lo = new LogUserOut();
        String myAccountString = loginSteps.Login(userName, password);
        Assert.assertEquals("MY ACCOUNT", myAccountString);
        lo.logout();
//        searchproduct sp = new searchproduct();
//        int n = sp.SearchProd("Bag");

//        System.out.println("number of products: " + n);
//        ArrayList<String> products = sp.ProductListing();
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).contains("Bag"))
//                System.out.println("Bag is here. Product name is : " + products.get(i));
//        }
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        DriverManager.driver.close();
    }


}
