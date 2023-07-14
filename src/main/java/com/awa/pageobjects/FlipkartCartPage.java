package com.awa.pageobjects;


import com.awa.webelements.Button;
import com.awa.webelements.Label;
import org.openqa.selenium.By;

public class FlipkartCartPage extends BasePage {
    Label missingCartLabel = new Label(By.xpath("//div[text()='Missing Cart items?']"));

    public boolean isMissingCartDisplayed(){
        return missingCartLabel.isDisplayed();
    }


}
