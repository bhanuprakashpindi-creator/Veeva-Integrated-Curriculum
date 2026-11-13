import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Ecap {
    public static void main(String[] args) throws Exception {
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        login(driver);
        checkAttendance(driver);
    }
    public static void login(WebDriver driver)
    {
        driver.get("https://sves.org.in/ecap/");
        driver.findElement(By.id("txtId2")).sendKeys("23a81a4351");
        driver.findElement(By.id("txtPwd2")).sendKeys("Bhanu@123");
        driver.findElement(By.id("imgBtn2")).click();

    }
    public static void checkAttendance(WebDriver driver)
    {
        driver.findElement(By.partialLinkText("ATTENDANCE")).click();
        driver.switchTo().frame("capIframe");
        driver.findElement(By.id("radTillNow")).click();
        driver.findElement(By.id("btnShow")).click();
    }
}
