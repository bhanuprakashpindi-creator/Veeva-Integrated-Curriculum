package Day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class FluentWaitDemo {
    //Scenario
    //You are automating a webpage where a checkbox is dynamically removed and added.
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        System.out.println("Browser Opened");
        driver.manage().window().maximize();
        System.out.println("Browser Maximized");
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        System.out.println("Website Opened");
        WebElement checkBox = driver.findElement(By.xpath("//div[@id='checkbox']/input[@type='checkbox']"));
        if (checkBox.isDisplayed())
        {
            System.out.println("CheckBox Located..");
        }
        else
            System.out.println("CheckBox Not Located");
        driver.findElement(By.xpath("//div/child::form[@id='checkbox-example']/button")).click();
        System.out.println("Remove Button Clicked");
        if (checkBox.isDisplayed())
        System.out.println("Waiting For Checkbox Removal");
        FluentWait<WebDriver> fluentWait=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        boolean isdisplayed = fluentWait.until(d->d.findElements(By.xpath("//div[@id='checkbox']/input[@type='checkbox']")).isEmpty());
        if (isdisplayed)
            System.out.println("CheckBox is Removed");
        driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
        System.out.println("Add Button Clicked");
        System.out.println("Waiting for CheckBox");
        WebElement checkBox2 = fluentWait.until(d->d.findElement(By.xpath("//input[@type='checkbox']")));
        if (checkBox2.isDisplayed())
            System.out.println("CheckBox Displayed Again");
        else System.out.println("No Displayed CheckBox");
    }
}
