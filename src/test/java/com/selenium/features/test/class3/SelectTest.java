package com.selenium.features.test.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        Select select1=new Select(driver.findElement(By.name("country")));
        Thread.sleep(1000);
        select1.selectByVisibleText("AMERICAN SAMOA");
        Thread.sleep(1000);
        select1.selectByIndex(9);
        Thread.sleep(1000);
        select1.selectByValue("ANGOLA");
        Thread.sleep(1000);

        for (WebElement element:select1.getOptions()){
            System.out.println(element.getTagName() + " "+element.getAttribute("value")+ " "+element.getText());
        }


        driver.quit();
    }
}
