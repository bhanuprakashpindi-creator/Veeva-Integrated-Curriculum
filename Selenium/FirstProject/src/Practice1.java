import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Practice1 {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.findElement(By.id("firstName")).sendKeys("Bhanu Prakash");
        driver.findElement(By.id("lastName")).sendKeys("Pindi");
        driver.findElement(By.id("userEmail")).sendKeys("Bhanu@gmail.com");
        driver.findElement(By.id("gender-radio-1")).click();
        driver.findElement(By.id("userNumber")).sendKeys("6304383411");
        driver.findElement(By.cssSelector("input[name='age']")).sendKeys("21");
        driver.close();
        }
}