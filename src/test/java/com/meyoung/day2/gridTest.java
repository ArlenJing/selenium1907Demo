package com.meyoung.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
public class gridTest {
/*    WebDriver driver;

    @BeforeMethod
    public void openBrowser() {
//        System.setProperty("webdriver.chrome.driver", "E:\\ideawork\\Selenium_Demo190710\\drivers\\chromedriver.exe");
//        driver = new ChromeDriver();

    }
    @AfterMethod
    public void closed(){
        driver.quit();
    }*/
    @DataProvider(name = "date1")
    public Object[][]dateT(){
        return new Object[][]{
                {"http://192.168.0.215:5555"},{"http://192.168.0.215:8888"}
        };
    }
    @Test(dataProvider = "date1")
    public  void grid2(String url) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = null;
        if (url.equals("http://192.168.0.215:5555")) {
            desiredCapabilities = DesiredCapabilities.chrome();
        }else if(url.equals("http://192.168.0.215:8888")){
            desiredCapabilities = DesiredCapabilities.firefox();
        }
        String Url = url+"/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(Url),desiredCapabilities);
        driver.get("http://www.baidu.com");
        Thread.sleep(3000);
        driver.quit();
    }
}
