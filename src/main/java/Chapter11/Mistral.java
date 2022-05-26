package Chapter11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Mistral {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/C://Users//tarik//Documents//chromedriver_win32//chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.mistral.ba/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.className("mega-menu-link"))).build().perform();
        driver.findElement(By.linkText("Junior Accelerator Program")).click();
        driver.findElement(By.xpath("//a[1]//div[1]")).click();

        driver.findElement(By.tagName("textarea")).sendKeys("Hello my name is Tarik. " +
                "I am fresh graduate and have passion for Automation Testing with Selenium. " +
                "I am willing to learn and further more improve my QA Autom ation knowledge." +
                " Behind I have couple of small projects related to Selenium automation. " +
                "Thank you, I hope we will be soon in touch.");
        driver.findElement(By.cssSelector("input[placeholder='e-mail']"))
                .sendKeys("tarikdedic18@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Tarik Dedic");
        driver.findElement(By.cssSelector("input[type='submit']")).click();

    }
}
