package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWorkFindElement {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void findElementsByCssTest(){

        driver.findElement(By.cssSelector("#small-searchterms"));
        driver.findElement(By.cssSelector("#newsletter-email"));
        driver.findElement(By.cssSelector(".nivoSlider"));
        driver.findElement(By.cssSelector(".topic-html-content"));
        driver.findElement(By.cssSelector("[method='get']"));
        driver.findElement(By.cssSelector("[value='Subscribe']"));
        driver.findElement(By.cssSelector("[alt*='Tricentis Demo Web Shop']"));
        driver.findElement(By.cssSelector("[alt^='Tricentis']"));
        driver.findElement(By.cssSelector("[alt$='Shop']"));
        driver.findElement(By.cssSelector("[type='submit']"));
    }
    @Test
    public void findElementByXpathTest(){
        driver.findElement(By.xpath("//*[@id='small-searchterms']"));
        driver.findElement(By.xpath("//*[@id='newsletter-email']"));
        driver.findElement(By.xpath("//*[@class='nivoSlider']"));
        driver.findElement(By.xpath("//*[@class='topic-html-content']"));
        driver.findElement(By.xpath("//*[contains(.,'All rights reserved.')]"));
        driver.findElement(By.xpath("//html/body/div[4]/div[2]/div[1]/div[1]/ul/li[3]/a"));
//        driver.findElement(By.xpath("//*[@class='bar-notification']"));
        driver.findElement(By.xpath("//*[@class='bar-notification']"));
    }
}
