package com.google.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPage {
    public SelenideElement downloadTab = $(By.xpath("(//div[1]/div/a)[5]"));
}
