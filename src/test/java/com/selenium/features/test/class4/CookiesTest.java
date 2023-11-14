package com.selenium.features.test.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");

        driver.manage().window().maximize();
        for (Cookie cookie : driver.manage().getCookies()) {
            System.out.println(cookie.getName() + " " + cookie.getValue());
        }
//        Cookie cookie=new Cookie("sobuj", "askldsalkdjlksak");
        driver.manage().addCookie(new Cookie("sobuj", "askldsalkdjlksak"));
        System.out.println(driver.manage().getCookieNamed("sobuj"));

        System.out.println("================================================");
        System.out.println("Size : " + driver.manage().getCookies().size());
        for (Cookie cookie : driver.manage().getCookies()) {
            System.out.println(cookie.getName() + " " + cookie.getValue());
        }
        driver.manage().deleteCookieNamed("sobuj");

        driver.manage().deleteAllCookies();

        System.out.println("Size " + driver.manage().getCookies().size());

        driver.quit();
    }
}
