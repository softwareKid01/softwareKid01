package Chapter11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.event.ActionListener;
import java.security.Key;
import java.sql.Driver;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AtlantBh {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/C://Users//tarik//Documents//chromedriver_win32//chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.atlantbh.com/");

//       List<WebElement> AtlantbhJobs =  driver.findElements(By.cssSelector(".column-link"));
//        for (int i=0;i<AtlantbhJobs.size();i++){
//            String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
//            driver.findElements(By.cssSelector(".column-link")).get(i).sendKeys(clickOnLinkTab);
//        }
        Thread.sleep(2000);
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.className("sf-with-ul"))).build().perform();
        Thread.sleep(1000);


//        driver.findElement(By.xpath("//li[@id='menu-item-14329'] //a")).click();
//
//        Set<String> windows = driver.getWindowHandles();
//        Iterator<String> it = windows.iterator();
//        String parentId = it.next();
//        String childId = it.next();
//        driver.switchTo().window(childId);
//        driver.switchTo().window(parentId);

        driver.findElement(By.xpath("//div[@class='slaask-button-cross']")).click();
        driver.switchTo().frame(1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='slaask-widget-homepage-cta']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='slaask-user-group-67340']")).click();
        driver.findElement(By.xpath("//textarea[@id='slaask-input']")).sendKeys("Hello,my name is Tarik and I am interested in Atlantbh Intenship.");

        driver.findElement(By.xpath("//div[@id='slaask-send-input-trigger']")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tarikdedic18@gmail.com");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//div[@id='slaask-button-cross']")).click();
        Thread.sleep(1000);
/////////////////////////////////////This below is to contact company///////////////////////////

        driver.findElement(By.tagName("textarea")).sendKeys("Hello my name is Tarik. " +
                "I am fresh graduate and have passion for Automation Testing with Selenium. " +
                "I am willing to learn and further more improve my QA Autom ation knowledge." +
                " Behind I have couple of small projects related to Selenium automation. " +
                "Thank you, I hope we will be soon in touch.");
        driver.findElement(By.cssSelector("input[name='form-input-mail']"))
                .sendKeys("tarikdedic18@gmail.com");
        driver.findElement(By.cssSelector("input[name='form-input-text']")).sendKeys("Tarik Dedic");
        driver.findElement(By.cssSelector("input[value='Contact us']")).click();


//Postovanje, zbog ove skripte i zbog
// testiranja i popravljanja mojih testnih
// gresaka, mozda ste dobili par mojih poruka,
// koje su dosle sa ove skripte.





    }
}
