package com.google.steps;

import com.google.pages.PicturesPage;
import io.cucumber.java.ru.Пусть;

import static com.codeborne.selenide.Selenide.page;

public class SearchSteps {
    @Пусть("^ищем картинку$")
    public void search() {
        PicturesPage picturesPage = page(PicturesPage.class);
        System.out.println("Successfully opened the page...");
        picturesPage.picTab.click();
        picturesPage.getPicTab.click();
        picturesPage.sourceTab.click();
    }
}
