package Chapter11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class handlingCalendarDinamically {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/C://Users//tarik//Documents//chromedriver_win32//chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.path2usa.com/travel-companions");
        while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August")){
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }
        driver.findElement(By.xpath("//*[@id='travel_date']")).click();
        List<WebElement> dates = driver.findElements(By.className("day"));
        int count = driver.findElements(By.className("day")).size();

        for (int i=0;i<count;i++){
            String text = driver.findElements(By.className("day")).get(i).getText();
            if (text.equalsIgnoreCase("23")){
                driver.findElements(By.className("day")).get(i).click();
                System.out.println("herheheh");
                break;
            }
        }
    }
}
