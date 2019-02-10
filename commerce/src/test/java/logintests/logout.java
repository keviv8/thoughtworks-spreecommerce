package logintests;

import org.testng.annotations.Test;
import steps.LogUserOut;

public class logout {


    public void logOut() {
        LogUserOut lo = new LogUserOut();
        lo.logout();
    }
}
