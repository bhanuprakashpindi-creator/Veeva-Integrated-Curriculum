package Day_5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    //https://the-internet.herokuapp.com/javascript_alerts

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        System.out.println("Browser Launched");
        driver.manage().window().maximize();
        System.out.println("Browser maximized");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println("Website Opened");
        //Task 1: Simple Alert
        driver.findElement(By.xpath("//div/child::ul/li/button[text()='Click for JS Alert']")).click();
        System.out.println("Js Alert Button Clicked");
        System.out.println("Pop Up Showed");
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Clicked Ok In The POPUP");
        System.out.println("Result: "+driver.findElement(By.cssSelector("p[id='result']")).getText());
        //Task 2: Confirmation Alert
        driver.findElement(By.xpath("//div/child::ul/li[2]/button[text()='Click for JS Confirm']")).click();
        System.out.println("Js Confirm Button Clicked");
        System.out.println("Pop Up Showed");
        alert = driver.switchTo().alert();
        System.out.println("The Message: "+alert.getText());
        alert.accept();
        System.out.println("Clicked Ok In The POPUP");
        System.out.println("Result: "+driver.findElement(By.cssSelector("p[id='result']")).getText());
        //Task 3: Prompt Alert
        driver.findElement(By.xpath("//div/child::ul/li[3]/button[text()='Click for JS Prompt']")).click();
        System.out.println("Js Prompt Button Clicked");
        System.out.println("Pop Up Showed");
        alert = driver.switchTo().alert();
        System.out.println("The Message: "+alert.getText());
        alert.sendKeys("Bhanu");
        alert.accept();System.out.println("Clicked Ok In The POPUP");
        System.out.println("Result: "+driver.findElement(By.cssSelector("p[id='result']")).getText());
        driver.close();

    }
}
