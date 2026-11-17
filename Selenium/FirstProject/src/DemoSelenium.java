import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelenium {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:63342/FirstProject/Selenium/DemoPage.html?_ijt=m3m7ph5eis00l4v1uooshjanei&_ij_reload=RELOAD_ON_SAVE");
        driver.findElement(By.id("firstName")).sendKeys("Bhanu Prakash");
        driver.findElement(By.id("lastName")).sendKeys("Pindi");
        driver.findElement(By.id("email")).sendKeys("Bhanu@gmail.com");
        driver.findElement(By.id("submit")).click();
    }
}
