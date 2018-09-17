import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPage
{
    @Test
    public void scrollPage()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/scroll");

        WebElement name2 = driver.findElement(By.id("name"));
        Actions actions = new Actions(driver);
        actions.moveToElement(name2);
        name2.sendKeys("Zina Mazurkevych");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/01/2018");

        driver.quit();
    }
}
