import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Practice3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        driver.get("https://www.google.com");
        String googleWindow = driver.getWindowHandle();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.in");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        Set<String> handles = driver.getWindowHandles();
        handles.forEach(System.out::println);
        Thread.sleep(2000);
        driver.switchTo().window(googleWindow);

        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.quit();

    }
}
