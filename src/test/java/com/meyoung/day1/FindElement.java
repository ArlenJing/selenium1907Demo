package com.meyoung.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindElement {
    WebDriver driver;
    @BeforeMethod
    public void openBrownser(){
        System.setProperty("webdriver.chrome.driver","E:\\ideawork\\Selenium_Demo190710\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void byID(){
        driver.get("http://www.baidu.com");
        WebElement id1 = driver.findElement(By.id("su"));
        System.out.println("返回的值："+id1);
    }
    @AfterMethod
    public void closeBrownser(){
        driver.quit();
    }
    @Test
    public void byXpath() throws InterruptedException {
        driver.get("https://www.baidu.com/");
        Thread.sleep(3000);
        WebElement list = driver.findElement(By.id("su"));
       // for (int i=0;i<list.size();i++) {
           // String text = list.get(i).getText();
            System.out.println("返回的文本：" + list.toString());
    }
}
