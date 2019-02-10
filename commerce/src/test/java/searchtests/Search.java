package searchtests;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.LoginSteps;
import steps.searchproduct;
import util.DriverManager;


public class Search {

//    @BeforeSuite
//    public void initiateBrowser()
//    {
//        DriverManager driverManager = new DriverManager();
//    }

    @Test(groups = { "regression" })
    @Parameters({"prodname"})
    public void searchprod(String prod)
    {
//        LoginSteps loginSteps = new LoginSteps();
//        String myAccountString = loginSteps.Login("xj@xj.com", "123456");
        searchproduct sp = new searchproduct();
        sp.SearchProd(prod);
    }


}
