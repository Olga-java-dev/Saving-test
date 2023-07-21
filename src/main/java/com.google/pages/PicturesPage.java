package com.google.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PicturesPage {
    public SelenideElement picTab = $(By.xpath("//*[@id=\"bqHHPb\"]/div/div/a[1]/div"));
    public SelenideElement getPicTab = $(By.xpath("//*[@id=\"islrg\"]/div[1]/div[3]/a[1]/div[1]/img"));
    public SelenideElement sourceTab = $(By.xpath("//*[@id=\"Sva75c\"]/div[2]/div[2]/div[2]/div[2]/c-wiz/div/div/div/div[4]/div[1]/a[1]/h3"));
}
