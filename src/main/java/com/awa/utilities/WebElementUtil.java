package com.awa.utilities;

import com.awa.framework.DriverManager;
import com.awa.globalresources.GlobalVariable;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WebElementUtil {

    

    public static void click(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(GlobalVariable.timeout20Sec));
        WebElement element = null;
        System.out.println();
        try {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            element = DriverManager.getDriver().findElement(by);
            element.click();
        } catch (ElementClickInterceptedException e) {
            Assert.isTrue(false, "Element Click Intercepted : There was some other Element tried to hide it  " + e.getMessage());
        } catch (NoSuchElementException e) {
            Assert.isTrue(false, "Element Could not been Found   " + e.getMessage());
        } catch (Exception e) {
            Assert.isTrue(false, "Exception Occurred while Clicking...." + e.getMessage());
        }


    }

    public static void clearText(By locator) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(GlobalVariable.timeout20Sec));
        try {
            WebElement element = DriverManager.getDriver().findElement(locator);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.clear();
        } catch (ElementClickInterceptedException e) {
            Assert.isTrue(false, "Element Click Intercepted : There was some other Element tried to hide it  " + e.getMessage());
        } catch (NoSuchElementException e) {
            Assert.isTrue(false, "Element Could not been Found   " + e.getMessage());
        } catch (Exception e) {
            Assert.isTrue(false, "Exception Occurred while Clicking...." + e.getMessage());
        }

    }

    public static void setText(By locator, String text) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(GlobalVariable.timeout20Sec));
        try {
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            WebElement element = DriverManager.getDriver().findElement(locator);
            element.clear();
            element.sendKeys(text);
        } catch (ElementClickInterceptedException e) {
            Assert.isTrue(false, "Element Click Intercepted : There was some other Element tried to hide it  " + e.getMessage());
        } catch (NoSuchElementException e) {
            Assert.isTrue(false, "Element Could not been Found   " + e.getMessage());
        } catch (Exception e) {
            Assert.isTrue(false, "Exception Occurred while Clicking...." + e.getMessage());
        }

    }

    public static void scrollToElement(By locator, String text) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(GlobalVariable.timeout20Sec));
        try {
            Actions action = new Actions(DriverManager.getDriver());
            wait.until(ExpectedConditions.elementToBeClickable(locator));
            WebElement element = DriverManager.getDriver().findElement(locator);
            action.scrollToElement(element).build().perform();
        } catch (ElementClickInterceptedException e) {
            Assert.isTrue(false, "Element Click Intercepted : There was some other Element tried to hide it  " + e.getMessage());
        } catch (NoSuchElementException e) {
            Assert.isTrue(false, "Element Could not been Found   " + e.getMessage());
        } catch (Exception e) {
            Assert.isTrue(false, "Exception Occurred while Clicking...." + e.getMessage());
        }

    }

    public static void selectDropdown(By by, String text) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(GlobalVariable.timeout20Sec));
        WebElement element = null;

        try {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            element = DriverManager.getDriver().findElement(by);
            Select select = new Select(element);
            select.selectByValue(text);
            //wait.until(ExpectedConditions.ElementToBeSelected(by));
        } catch (ElementClickInterceptedException e) {
            Assert.isTrue(false, "Element Click Intercepted : There was some other Element tried to hide it  " + e.getMessage());
        } catch (NoSuchElementException e) {
            Assert.isTrue(false, "Element Could not been Found   " + e.getMessage());
        } catch (Exception e) {
            Assert.isTrue(false, "Exception Occurred while Clicking...." + e.getMessage());
        }
    }

    public static String getText(By locator) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(GlobalVariable.timeout20Sec));
        String text = "";
        try {
            WebElement element = DriverManager.getDriver().findElement(locator);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            text = element.getText();
        } catch (ElementClickInterceptedException e) {
            Assert.isTrue(false, "Element Click Intercepted : There was some other Element tried to hide it  " + e.getMessage());
        } catch (NoSuchElementException e) {
            Assert.isTrue(false, "Element Could not been Found   " + e.getMessage());
        } catch (Exception e) {
            Assert.isTrue(false, "Exception Occurred while Clicking...." + e.getMessage());
        }
        return text;
    }

    public static List<WebElement> getListOfElements(By locator) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofMinutes(GlobalVariable.timeout20Sec));
        List<WebElement> elementsList = null;
        try {
            elementsList = DriverManager.getDriver().findElements(locator);

        } catch (ElementClickInterceptedException e) {
            Assert.isTrue(false, "Element Click Intercepted : There was some other Element tried to hide it  " + e.getMessage());
        } catch (NoSuchElementException e) {
            Assert.isTrue(false, "Element Could not been Found   " + e.getMessage());
        } catch (Exception e) {
            Assert.isTrue(false, "Exception Occurred while Clicking...." + e.getMessage());
        }
        return elementsList;
    }

    public static boolean isDisplayed(By locator){
        boolean isDisplayed = false;
        try{
            WebElement element = DriverManager.getDriver().findElement(locator);
            isDisplayed= element.isDisplayed();
        }
        catch (Exception e){

        }
        return isDisplayed;

    }
}
