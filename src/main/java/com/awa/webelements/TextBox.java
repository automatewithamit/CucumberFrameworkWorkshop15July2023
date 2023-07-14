package com.awa.webelements;

import com.awa.utilities.WebElementUtil;
import org.openqa.selenium.By;

public class TextBox {
    public By locator;

    public TextBox(By locator) {
        this.locator = locator;
    }

    public void clearText() {
        System.out.println("Clearing text from the locator : " + locator);
        WebElementUtil.clearText(locator);
        System.out.println("Cleared text from the locator : " + locator);
    }

    public void setText(String text) {
        System.out.println("Setting text ->  " + text + " to the locator : " + locator);
        WebElementUtil.setText(locator, text);
        System.out.println("Text -> " + text + " got set to the locator : " + locator);
    }
}
