package com.kodilla.testing2.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.kodilla.testing2.config.WebDriverConfig;


public class GoogleTestingApp {

    public static void main(String[] args) {

        final String SEARCHFIELD = "lst-ib";

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.google.com/");

        WebElement serachField = driver.findElement(By.id(SEARCHFIELD));
        serachField.sendKeys("Kodilla");
        serachField.submit();
        }
    }

