package Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class MutipleWindowsDemo {
    //https://the-internet.herokuapp.com/windows
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        System.out.println("Browser Launched");
        driver.manage().window().maximize();
        System.out.println("Browser Maximized");
        driver.get("https://the-internet.herokuapp.com/windows");
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Handle: "+parentHandle);
        System.out.println("Webpage Opened");
        driver.findElement(By.xpath("//div/a[text()='Click Here']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> handlers=driver.getWindowHandles();
        System.out.println("Total Handles: "+handlers.size());
        for (String string:handlers)
        {
            driver.switchTo().window(string);
        }
        System.out.println("Child Title: "+driver.getTitle());

        driver.close();
        driver.switchTo().window(parentHandle);
        System.out.println("Parent Title: "+driver.getTitle());

    }
}
