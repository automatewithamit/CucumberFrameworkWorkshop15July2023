package com.awa.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManager {
    OptionsManager optionsManager = new OptionsManager();
    private static WebDriver driver;

    //Start the Browser
    public void startBrowser(String browserName) {
        if (browserName.toLowerCase().equals("chrome")) {
            driver = new ChromeDriver(optionsManager.getChromeOptions());
        } else if (browserName.toLowerCase().equals("edge")) {
            driver = new EdgeDriver(optionsManager.getEdgeOptions());
        } else {
            System.out.println("No Browser Matched");
        }
        driver.manage().window().maximize();
    }

    //This method return the
    public static WebDriver getDriver() {
        return driver;
    }

    public static void navigateToURL(String url) {
        DriverManager.getDriver().navigate().to(url);
    }
}
