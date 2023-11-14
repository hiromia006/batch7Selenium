package com.selenium.features.test.class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");

        System.out.println(driver.findElement(By.className("login_logo")).getText());


        driver.navigate().to("https://parabank.parasoft.com/");

        System.out.println(driver.findElements(By.tagName("a")).size());

        Thread.sleep(2000);


        driver.quit();
    }
}
