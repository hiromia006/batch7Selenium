package com.selenium.features.test.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        String originalWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://demoqa.com/sample");
        Thread.sleep(2000);
        System.out.println("New Tab : " + driver.findElement(By.id("sampleHeading")).getText());
        driver.close();
        driver.switchTo().window(originalWindow);
        System.out.println(driver.getTitle());

        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://demoqa.com/sample");
        Thread.sleep(2000);
        System.out.println("New Tab : " + driver.findElement(By.id("sampleHeading")).getText());
        driver.close();
        driver.switchTo().window(originalWindow);

        driver.quit();
        System.out.println(driver.getTitle());
    }
}
