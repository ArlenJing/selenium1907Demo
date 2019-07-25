package com.meyoung.day2;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class ActionsTest01 {
    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "E:\\ideawork\\Selenium_Demo190710\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        //全局等待
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closedBrownser() {
        driver.quit();
    }

    @Test
    public void getTextTest() throws InterruptedException {
        driver.get("http://www.baidu.com/");
        driver.findElement(By.xpath("//a[text()='新闻']")).click();
        //System.out.println(text.getText());
        Thread.sleep(3000);
    }

    //打开百度首页
    //截图
    @Test
    public void screenShotFile() {
        driver.get("http://www.baidu.com/");
        //以下代码是得到截图并保存下来
        File screenShotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShotFile, new File("E:\\ideawork\\Selenium_Demo190710\\picture\\test01.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ;
    }

    @Test
    public void clickTest() throws InterruptedException {
        driver.get("http://www.40012366.com.cn/");
        driver.findElement(By.xpath(".//*[@id='ypt']")).click();
        //Thread.sleep(5000);
        String handle = driver.getWindowHandle();
        // 获取所有页面的句柄，并循环判断不是当前的句柄
        for (String handles : driver.getWindowHandles()) {
            if (handles.equals(handle))
                continue;
            driver.switchTo().window(handles);
        }
        driver.findElement(By.xpath("/html/body/div[1]/div/div/a[1]")).click();
        driver.findElement(By.id("account")).sendKeys("3946");
        driver.findElement(By.id("password")).sendKeys("111");
    }
}
