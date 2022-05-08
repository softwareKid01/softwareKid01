import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDowns {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver",
                "/C://Users//tarik//Documents//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(1000);
        int count = 1;
        while (count < 5){
            Thread.sleep(1000);
            driver.findElement(By.id("hrefIncAdt")).click();
            count++;
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

//a[@value='MAA']
    }
}
