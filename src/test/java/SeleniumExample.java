import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SeleniumExample
{
    @Test
    public  void KeyboardAndMouseInput() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/keypress");

        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Zina Mazurkevych");

        WebElement button = driver.findElement(By.id("button"));
        button.click();
        driver.get("http://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("1555 Park Blvd, Palo Alto, CA");

        Thread.sleep(1000);

        WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

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
