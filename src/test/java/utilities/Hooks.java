package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import setups.InitiateDriver;
import setups.SetupDriver;

public class Hooks extends SetupDriver {

    @Before
    public void beforeScenario(){
        System.out.println("mulai dulu");
        startBrowser();
    }

    @After
    public void afterScenario(){
        closeBrowser();
    }
}
