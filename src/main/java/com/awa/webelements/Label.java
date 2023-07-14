package com.awa.webelements;

import com.awa.utilities.WebElementUtil;
import org.openqa.selenium.By;

public class Label {
    public By locator;

    public Label(By locator) {
        this.locator = locator;
    }


    public String getText() {
        return WebElementUtil.getText(locator);
    }

    public boolean isDisplayed() {
        return WebElementUtil.isDisplayed(locator);
    }

}
