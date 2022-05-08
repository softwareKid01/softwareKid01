package Chapter8_FunctionalTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class selenium1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/C://Users//tarik//Documents//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        WebDriverWait w = new WebDriverWait(driver,5);
        Thread.sleep(3000);
        String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot"};
        addItems(driver,itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

        driver.findElement(By.cssSelector("button.promoBtn")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
       System.out.println( driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }

    public static void addItems(WebDriver driver,String[] itemsNeeded){
        List<WebElement> products =  driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0;i<products.size();i++){
            String[] name = products.get(i).getText().split("-");
            String fromattedName = name[0].trim();
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(fromattedName)){
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

            }
        }
    }
}
