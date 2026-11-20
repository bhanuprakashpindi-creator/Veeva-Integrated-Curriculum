package Day_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitDemo {
//    Task 1: Implicit Wait
//Scenario: You are automating a web application where elements may take a few seconds to appear.
    public static void main(String[] args) {

        WebDriver webDriver=new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.manage().window().maximize();
        System.out.println("Browser Launched And Maximized");
        webDriver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
        System.out.println("Website Opened");
        webDriver.findElement(By.xpath("//div/child::div/button[text()='Start']")).click();
        System.out.println("Start Button Clicked");
      WebElement text = webDriver.findElement(By.xpath("//div/child::div[@id='finish']/h4"));
      boolean displayed = text.isDisplayed();
      if (displayed)
          System.out.println("Element Located");
      else
          System.out.println("Element Not Located");
        System.out.println(text.getText());
    }
}
