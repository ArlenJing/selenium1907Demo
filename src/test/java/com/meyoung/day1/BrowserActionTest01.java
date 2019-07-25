package com.meyoung.day1;

import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//每个@Test执行前打开浏览器
public class BrowserActionTest01 {
    WebDriver driver ;
    @BeforeMethod
    public void openChrome(){
        //设置Chromedriver的路径
        System.setProperty("webdriver.chrome.driver","E:\\ideawork\\Selenium_Demo190710\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }


    /*打开Chrome浏览器
    打开百度地址
    等待5秒
    关闭浏览器
    */
    @Test
    public void getTest()throws InterruptedException {
        //打开百度首页
        driver.get("http://40012366.com.cn");
        //等待5秒
        Thread.sleep(5000);
        }
        @Test
    public void backTest() throws InterruptedException {
        //打开百度首页
            driver.get("http://40012366.com.cn");
            //等待3秒
            Thread.sleep(3000);
            //后退
            driver.navigate().back();
            //等待3秒
            Thread.sleep(3000);
            //前进
            driver.navigate().forward();
            //等待三秒
            Thread.sleep(3000);
        }
        @Test
    public void wintest(){
            //实例化dimension类，设置浏览器大小
            Dimension dimension = new Dimension(300,300);
            driver.manage().window().setSize(dimension);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //最大化浏览器窗口
            driver.manage().window().maximize();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //打开百度首页
            driver.get("http://40012366.com.cn");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String title = driver.getTitle();
            //获取当前title，打印
            System.out.println(title);
            String url = driver.getCurrentUrl();
            //打印获取到的当前页面地址
            System.out.println("获取当前页面地址："+url);
            Assert.assertEquals(url,"http://40012366.com.cn/");
        }
        //每个@Test执行后关闭浏览器
        @AfterMethod
    public void brownQuit(){
        driver.quit();
        }
}



