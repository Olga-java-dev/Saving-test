package com.google.hooks;

import com.codeborne.selenide.Configuration;
import com.google.webdriver.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.open;

public class CucumberHooks {
    @Before("@mobile")
    public void setUp() {
        Configuration.headless=false;
        System.out.println("Starting Browser...");
        open("https://www.google.com/");
        System.out.println("123");
    }

    @After("@mobile")
    public void tearDown() {
        Browser.closeBrowser();
    }
}
