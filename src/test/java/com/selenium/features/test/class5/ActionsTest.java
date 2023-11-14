package com.selenium.features.test.class5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionsTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.linkText("Main Item 2"))).build().perform();
        Thread.sleep(2000);

        actions.moveToElement(driver.findElement(By.linkText("SUB SUB LIST »"))).build().perform();
        Thread.sleep(2000);

        actions.moveToElement(driver.findElement(By.linkText("Sub Sub Item 1"))).click().build().perform();
        Thread.sleep(2000);

        driver.navigate().to("https://demoqa.com/droppable");
        Actions actions2 = new Actions(driver);

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        actions2.dragAndDrop(draggable, droppable).build().perform();
        Thread.sleep(2000);

        actions.contextClick(droppable).perform();
        Thread.sleep(2000);

        driver.navigate().to("https://demoqa.com/buttons");
        Actions actions3 = new Actions(driver);
        actions3.doubleClick(driver.findElement(By.id("doubleClickBtn"))).build().perform();
        Thread.sleep(2000);


        driver.quit();
    }
}
