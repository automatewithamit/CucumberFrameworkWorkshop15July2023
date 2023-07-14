package com.awa.hooks;

import com.awa.framework.DriverManager;
import com.awa.framework.OptionsManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {

    DriverManager driverManager = new DriverManager();
    OptionsManager manager = new OptionsManager();

    @Before
    public void setUp() {
        System.out.println("This is set up");
        driverManager.startBrowser("chrome");

    }

    @After
    public void tearDown() {
        System.out.println("This is Tear Down");
        DriverManager.getDriver().close();
    }

}
