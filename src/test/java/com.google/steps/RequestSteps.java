package com.google.steps;

import io.cucumber.java.ru.Пусть;
import com.google.pages.StartPage;

import static com.codeborne.selenide.Selenide.page;

public class RequestSteps {
    @Пусть("^делаем запрос$")
    public void find() {
        StartPage startPage = page(StartPage.class);
        System.out.println("Successfully opened the page...");
        startPage.findTab.setValue("Картинки\n");
    }
}
