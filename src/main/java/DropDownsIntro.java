import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownsIntro {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "/C://Users\\tarik//Documents//chromedriver_win32//chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //DropDown with select Tag
        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropDown);
        dropdown.selectByIndex(3);
        Thread.sleep(1000);
        System.out.println( dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        Thread.sleep(1000);
        System.out.println( dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
        Thread.sleep(1000);
        System.out.println( dropdown.getFirstSelectedOption().getText());


    }
}
