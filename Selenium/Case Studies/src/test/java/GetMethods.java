import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.ListResourceBundle;
import java.util.Set;

public class GetMethods {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        //get() - used to open the website or webpage
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //gettitle retrun the title of webpage
        String title = driver.getTitle();
        System.out.println("Title :"+title);
        //getCurrentUrl retruns the url in string
        String url = driver.getCurrentUrl();
        System.out.println("URL: "+url);
        //getPageSource returns source code of the page
        String pageSource = driver.getPageSource();
        System.out.println("Page Source: "+pageSource);
        //getWindowHandle returns the window id in string which keeps changing every time
        String id = driver.getWindowHandle();
        System.out.println(id);
        //getWindowHandles returns the all window id
        Set<String> ids=driver.getWindowHandles();
        ids.forEach(System.out::println);

    }
}
