package com.meyoung.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CloseBrowserTest {
    @Test
    public void closeChrome ()throws InterruptedException{
        System.setProperty("webdriver.chromr.driver","E:\\ideawork\\Selenium_Demo190710\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //OpenBrowserTest.openChrome();
        //等待5秒
        Thread.sleep(5000);
        driver.close();
    }
}
