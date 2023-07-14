package com.awa.pageobjects;

import com.awa.webelements.Button;
import org.openqa.selenium.By;

public class FlipkartHomePage extends BasePage {
    Button cartButton = new Button(By.xpath("//a[.='Cart']"));
    Button loginCloseButton = new Button(By.xpath("//button[.='Request OTP']/ancestor::form/../../../../../button"));

    public void clickCartButton() {
        if (loginCloseButton.isDisplayed())
            loginCloseButton.click();
        cartButton.click();
    }
}
