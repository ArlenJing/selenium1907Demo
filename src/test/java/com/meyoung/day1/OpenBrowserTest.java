package com.meyoung.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OpenBrowserTest {
    @Test
    public static void OpenFirefox1(){
        WebDriver webDriver = new FirefoxDriver();
    }
    @Test
     public void OpenFirefox2() {
        System.setProperty("webdriver.firefox.bin", "E:\\360download\\firefox-47.0.win64.sdk\\firefox-sdk\\bin\\firefox.exe");
        WebDriver webDriver = new FirefoxDriver();
    }
    @Test
    public static void openChrome(){
        System.setProperty("webdriver.chrome.driver","E:\\ideawork\\Selenium_Demo190710\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
    }
    @Test
    public void openIE(){
        System.setProperty("webdriver.ie.driver","E:\\ideawork\\Selenium_Demo190710\\drivers\\IEDriverServer.exe");
        WebDriver webDriver = new InternetExplorerDriver();
    }
}
