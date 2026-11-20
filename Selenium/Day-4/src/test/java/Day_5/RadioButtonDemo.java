package Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtonDemo {
//    https://demoqa.com/radio-button
public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/radio-button");
    List<WebElement> options=driver.findElements(By.xpath("//input[@type='radio']"));
    System.out.println("Total Options: "+options.size());
    System.out.println("Initial States: ");
    options.forEach(op-> System.out.println(op.isSelected()));
    if (!options.get(0).isSelected())
    {
        options.get(0).click();
        System.out.println("YES Radio Button is Selected");
    }
    options.get(1).click();
    System.out.println("Final Status: ");
    options.forEach(op-> System.out.println(op.isSelected()));

    if (options.get(2).isEnabled())
        System.out.println("No is Enabled");
    else
        System.out.println("No is Not Enabled");
    driver.quit();
}
}
