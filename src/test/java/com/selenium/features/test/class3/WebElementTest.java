package com.selenium.features.test.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class WebElementTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


//        driver.findElement(By.id("userName")).sendKeys("dd");
//        driver.findElement(By.id("userName")).clear();
//        driver.findElement(By.id("userName")).sendKeys("dd");

        WebElement webElement = driver.findElement(By.id("userName"));
        webElement.sendKeys("Full Name");
        Thread.sleep(1500);
        webElement.clear();
        webElement.sendKeys("Sobuj");

       WebElement webElement1=driver.findElement(By.id("currentAddress"));
        System.out.println(webElement1.getTagName());
        System.out.println(webElement1.getRect().x);
        System.out.println(webElement1.getRect().y);
        System.out.println(webElement1.getCssValue("font-family"));

        WebElement element= driver.findElement(By.id("submit"));
        System.out.println(element.isDisplayed());
        element.click();

        driver.navigate().to("https://demoqa.com/links");
        List<WebElement> webElements=driver.findElements(By.tagName("a"));
        for (WebElement element1:webElements){
            System.out.println(element1.getAttribute("href"));
        }

        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().forward();


        driver.quit();

    }

}
