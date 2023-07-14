package com.awa.framework;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.ArrayList;
import java.util.List;

public class OptionsManager {
    public ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        List<String> argumentsList = new ArrayList<>();
        argumentsList.add("−−incognito");
        options.addArguments(argumentsList);
        return options;
    }

    public EdgeOptions getEdgeOptions() {
        EdgeOptions options = new EdgeOptions();

        return options;
    }
}
