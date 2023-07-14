package com.awa.webelements;

import com.awa.utilities.WebElementUtil;
import org.openqa.selenium.*;

public class Button {
    public By locator;

    public Button(By locator) {
        this.locator = locator;
    }

    public void click() {
        System.out.println("Clicking on Button with locator : " + locator);
        WebElementUtil.click(locator);
        System.out.println("Clicked Button with locator : " + locator);
    }
    public boolean isDisplayed(){
        return WebElementUtil.isDisplayed(locator);
    }

}
