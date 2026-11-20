package Day_5;

import com.sun.jdi.event.ThreadDeathEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {
    // http://the-internet.herokuapp.com/iframe
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        System.out.println("Browser Launched");
        driver.manage().window().maximize();
        System.out.println("Browser Maximized");
        driver.get("http://the-internet.herokuapp.com/iframe");
        System.out.println("WebPage Opened");
        WebElement iframe=driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));
        System.out.println("Is Iframe Displayed"+iframe.isDisplayed());
        driver.switchTo().frame(iframe);
        WebElement body = driver.findElement(By.xpath("//body"));
        System.out.println("Content: "+body.getText());
        Thread.sleep(2000);
        body.clear();
        Thread.sleep(2000);
        body.click();
        body.sendKeys("Learning Selenium iFrame Handling.");
        Thread.sleep(2000);
        System.out.println(body.getText());
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        String heading = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
        System.out.println("Heading: "+heading);
        driver.quit();


    }
}
