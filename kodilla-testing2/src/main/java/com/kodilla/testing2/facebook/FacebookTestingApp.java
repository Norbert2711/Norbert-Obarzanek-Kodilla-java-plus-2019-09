package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";
    public static final String XPATH_WAIT_FOR = "//select[1]";
    public static final String XPATH_INPUT_NAME = "//div[contains(@class, \"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\")]/input";
    public static final String XPATH_INPUT_LASTNAME = "//div[contains(@class, \"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\")]/input";
    public static final String XPATH_INPUT_TEL_NUMB = "//div[contains(@class, \"uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput\")]/input";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        WebElement setName = driver.findElement(By.xpath(XPATH_INPUT_NAME));
        setName.sendKeys("My name here");

        WebElement setLastName = driver.findElement(By.xpath(XPATH_INPUT_LASTNAME));
        setLastName.sendKeys("My last name here");

        WebElement setTelNum = driver.findElement(By.xpath(XPATH_INPUT_TEL_NUMB));
        setTelNum.sendKeys("123-456-789");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed()) ;

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectComboDay);
        selectDay.selectByIndex(27);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(10);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(19);
        //27.paź.2020r.
    }
}
