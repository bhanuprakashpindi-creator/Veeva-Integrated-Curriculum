import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://amazon.com");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0,2000)");
        System.out.println("Scrolled Down");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-2000)");
        System.out.println("Scrolled Up");
    }
}
