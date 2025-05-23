package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverFactory;

public class Hooks {

    @Before
    public void startDriver() {
        DriverFactory.getDriver();
    }

    @After
    public void quitDriver() {
        DriverFactory.quitDriver();
    }
}

