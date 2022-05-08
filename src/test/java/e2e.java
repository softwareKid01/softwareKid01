import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "/C://Users//tarik//Documents//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(2000);
        //travel from
        //div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='RDP']
        //Travel to
        //(//a[@value='IXJ'])[2]
        //OR
        //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXJ']
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='IXJ']")).click();
        //driver.findElement(By.cssSelector("ui-state-default.ui-state-highlight.ui-state-hover")).click();
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }

        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000);
        int count = 1;
        while (count < 5){
            Thread.sleep(1000);
            driver.findElement(By.id("hrefIncAdt")).click();
            count++;
        }

        driver.findElement(By.id("btnclosepaxoption")).click();

        driver.findElement(By.cssSelector("input[value='Search']")).click();



    }
}
