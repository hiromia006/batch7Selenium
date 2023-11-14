package com.selenium.features.test.class5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ExplicitWaitTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("user-name")))).sendKeys("standard_user");
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(1500);

        System.out.println(driver.findElement(By.className("login_logo")).getText());

        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[data-test='login-button']")))).click();

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[data-test='login-button']"))));
        driver.findElement(By.cssSelector("[data-test='login-button']")).click();

        Thread.sleep(1500);

        driver.findElement(By.linkText("Sauce Labs Backpack")).click();
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);

        driver.findElement(By.partialLinkText("ike Ligh")).click();
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);

        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        System.out.println(webElements.size());
        for (WebElement element : webElements) {
            System.out.println(element.getText());
        }

        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(1500);


        driver.quit();


    }
}
