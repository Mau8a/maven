package com.mx.datiodb;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class OpenBrowser {

    @Test
    public void openBrowser() throws InterruptedException {
        Configuration.browser = "firefox";
        open("https://google.com/");
        $(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).waitUntil(Condition.visible, 60000);
        $(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("youtube");
        $(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).pressEnter();
        $(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/a/h3")).waitUntil(Condition.hidden, 60000);
        $(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/a/h3")).click();
    }

}
