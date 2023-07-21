package com.google.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ChoicePage {
    public SelenideElement choiceTab = $(By.xpath("//div[3]/a[1]/img"));
}
