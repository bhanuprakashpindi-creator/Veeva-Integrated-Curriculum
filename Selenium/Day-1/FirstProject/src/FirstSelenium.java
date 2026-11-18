import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //maximize browser
        Thread.sleep(2000);
        driver.manage().window().maximize();
        //open google
        Thread.sleep(2000);
        driver.get("https://www.google.com");
        // get page title
        Thread.sleep(2000);
        System.out.println("The Page Title :"+driver.getTitle());
        //get url link
        Thread.sleep(2000);
        System.out.println("The Page Link :"+driver.getCurrentUrl());
        Thread.sleep(2000);
        //navigate to wikipedia
        driver.navigate().to("https://www.wikipedia.org");
        // navigate backward
        Thread.sleep(2000);
        driver.navigate().back();
        //navigate forward
        Thread.sleep(2000);
        driver.navigate().forward();
        //refresh page
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        //close browser
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.in");
        driver.close();

    }
}
