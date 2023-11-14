package com.selenium.features.test.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigateTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(1500);

        driver.navigate().to("https://demoqa.com/links");
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().forward();
        Thread.sleep(1500);
        driver.navigate().refresh();

        driver.quit();

    }
}
