package com.google.steps;

import com.google.pages.ChoicePage;
import io.cucumber.java.ru.Пусть;

import static com.codeborne.selenide.Selenide.page;

public class ChoiceSteps {
    @Пусть("^выбираем картинку$")
    public void choice() {
        ChoicePage choicePage = page(ChoicePage.class);
        System.out.println("Successfully opened the page...");
        choicePage.choiceTab.click();
    }
}
