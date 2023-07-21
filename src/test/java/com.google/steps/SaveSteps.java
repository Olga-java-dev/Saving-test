package com.google.steps;

import com.google.pages.DownloadPage;
import io.cucumber.java.ru.Пусть;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.page;

public class SaveSteps {
    @Пусть("^сохраняем картинку$")
    public void save() throws FileNotFoundException {
        DownloadPage downloadPage = page(DownloadPage.class);
        System.out.println("Successfully opened the page...");
        downloadPage.downloadTab.scrollTo().download(10000);
        System.out.println(123);
    }
}
