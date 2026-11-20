package Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {
    //https://the-internet.herokuapp.com/nested_frames
    public static void main(String[] args) {
        //Task 1: Nested Frames
        WebDriver driver=new ChromeDriver();
        System.out.println("Browser Launched");
        driver.manage().window().maximize();
        System.out.println("Browser Maximized");
        driver.get("https://the-internet.herokuapp.com/nested_frames");
        System.out.println("Webpage Opened");
        WebElement topFrame=driver.findElement(By.name("frame-top"));
        System.out.println("Switched To Top Frame");
        driver.switchTo().frame(topFrame);
        WebElement leftFrame=driver.findElement(By.name("frame-left"));
        System.out.println("Switched To Left Frame");
        driver.switchTo().frame(leftFrame);
        System.out.println("Frame text: "+driver.findElement(By.tagName("body")).getText());
        driver.switchTo().parentFrame();
        System.out.println("Returned to Parent Frame");
        driver.switchTo().defaultContent();
        System.out.println("Returned To Main Page");
        driver.close();

    }
}
