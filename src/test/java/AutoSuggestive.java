import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


import java.time.Duration;
import java.util.List;

public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/C://Users//tarik//Documents//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        int counter = 0;

       for (WebElement option : options){
           if (option.getText().equalsIgnoreCase("India")){
               option.click();
           }
       }

       ////////////////////////////////////HANDLING CALENDER///////////////////////////////////////////

        // ui-datepicker-week-end ui-datepicker-days-cell-over  ui-datepicker-today
        //ctl00_mainContent_view_date1
//        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//       Thread.sleep(1000);
//        System.out.println( driver.findElement(By.className("ui-datepicker-week-end.ui-datepicker-days-cell-over.ui-datepicker-today")).getText());

//////////////////////////////////////////Enabled/Disabled///////////////
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        if( driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            System.out.println("its enabled");
           Assert.assertTrue(true);
        }else{
            Assert.assertTrue(false);
        }
    }
}
