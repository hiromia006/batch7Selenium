package com.testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SauceDemoTest {
    @Test
    public void verifySourceDemoTittleShouldShould() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        driver.quit();
    }

    @Test
    public void verifySourceDemoTittleShouldShould_2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        driver.quit();
    }

    @Test
    public void loginShouldSucceed() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        driver.quit();
    }
}
