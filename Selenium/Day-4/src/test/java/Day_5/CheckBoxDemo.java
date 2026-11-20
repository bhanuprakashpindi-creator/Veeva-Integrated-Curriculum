package Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class CheckBoxDemo {
    //https://the-internet.herokuapp.com/checkboxes
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
       List<WebElement> checkboxes = driver.findElements(By.xpath("//form/input"));
        System.out.println("Total CheckBoxes: "+checkboxes.size());
        checkboxes.forEach(check-> System.out.println("Initial Status: " +check.isSelected()));
        if (!driver.findElement(By.xpath("//form/input[1]")).isSelected())
        {
            System.out.println("First Check Box Not Selected");
            driver.findElement(By.xpath("//form/input[1]")).click();
            System.out.println("First Check Box Got Selected");
        }
        if (driver.findElement(By.xpath("//form/input[2]")).isSelected())
        {
            System.out.println("Second Check Box  Selected");
            driver.findElement(By.xpath("//form/input[2]")).click();
            System.out.println("Second Check Box Got UnSelected");
        }
        checkboxes.forEach(check-> System.out.println("Final Status: "+check.isSelected()));
        driver.quit();
    }
}
