package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FirstSeleniumTest {

    WebDriver driver;

    //before - setUp -> предусловие (метод перед тестами)
    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("remote-allow-origins=*");
        driver = new ChromeDriver(options);

        // driver.get("https://www.google.com"); или driver.navigate().to("https://www.google.com");// with history
        driver.navigate().to("https://telranedu.web.app/login");// with history

        //maximize browser window -> окно браузера разворачивается полностью
        driver.manage().window().maximize();
    }

    //tests
    @Test
    public void findElementByTagName() {
        System.out.println("Site opened!!!");

        //find element by tag
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText()); // расспечатается элемент текста

        //find list of elements
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

        //find element by class name
        WebElement element1 = driver.findElement(By.className("navbar-component_nav__1X_4m"));
        System.out.println(element1.getText());

        //find element by name
        driver.findElement(By.name("email"));

    }

    //parent
    // //h1/parent::*
    // //h1/parent::div
    // //h1/..

    // ancestor(предки)
    // //h1/ancestor::* (all)
    // //h1/ancestor::div (two options)
    // //h1/ancestor::div[2] (one option)

    // following-sibling
    // //h1/following-sibling::a

    //preceding-sibling
    // //a[@href='/login']/preceding-sibling::h1
    // //a[@href='/login']/preceding-sibling::a



    //after - tearDown -> метод закрывает браузер
    @AfterMethod
    public void tearDown() {
        driver.quit();// all tabs & close browser
        // driver.close(); -> only one tab (if tab only one -> close browser)
    }
}