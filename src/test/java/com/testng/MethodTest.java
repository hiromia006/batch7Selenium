package com.testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MethodTest extends BaseMethodTest {
    @Test(priority = 0)
    public void verifySourceDemoTittleShouldShould() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");

    }

    @Test(priority = 1, enabled = true)
    public void verifySourceDemoTittleShouldShould_2() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");

    }

    @Test(priority = 0)
    public void verifySourceDemoTittleShouldShould_3() {
        Assert.assertEquals(driver.getTitle(), "Swag Labs");

    }

    @Test(priority = 3, description = "Login with standard_user")
    public void loginShouldSucceed() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

    }
}
