package com.selenium.features.test.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        WebElement element = driver.findElement(By.id("confirmButton"));
        element.click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
        element.click();
        driver.switchTo().alert().accept();

        WebElement element1 = driver.findElement(By.id("promtButton"));
        element1.click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        element1.click();
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
        element1.click();
        Thread.sleep(1000);
        driver.switchTo().alert().sendKeys("Batch 7");
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(1000);

        driver.quit();


    }
}
