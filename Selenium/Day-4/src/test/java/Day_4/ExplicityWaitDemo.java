package Day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicityWaitDemo {
//    Scenario
//You are automating a webpage where an element exists in the DOM ,
//  but remains hidden until a loading operation completes.
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        System.out.println("Browser Launched");
        driver.manage().window().maximize();
        System.out.println("Browser Maximized");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div/button[text()='Start']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //System.out.println(wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div/child::div/h3"))));

        //checking for invisibility of element
        Boolean element2=wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div/child::div[@id='loading']")));
        if (element2)
            System.out.println("Element Invisible");


        WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/child::div[@id='finish']/h4")));

        Boolean isdisplayed=element.isDisplayed();

        if (isdisplayed)
            System.out.println("Element Displayed");
        else System.out.println("No Element Displayed");
        System.out.println(element.getText());
    }
}
