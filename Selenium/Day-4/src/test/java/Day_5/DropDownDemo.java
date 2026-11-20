package Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownDemo {
    //Website :- https://the-internet.herokuapp.com/dropdown
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        System.out.println("Browser Launched");
        driver.manage().window().maximize();
        System.out.println("Browser Maximized");
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println("Website Opened");
        WebElement dropDown = driver.findElement(By.cssSelector("#dropdown"));
        System.out.println("DropDown Located: "+dropDown.isDisplayed());

        List<WebElement> options = dropDown.findElements(By.xpath("//select[@id='dropdown']/option"));
        System.out.println("Available Options: ");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        Select select=new Select(dropDown);
        select.selectByVisibleText("Option 1");
        WebElement selectedOption=select.getFirstSelectedOption();
        System.out.println(selectedOption.getText());
        select.selectByValue("2");
        selectedOption=select.getFirstSelectedOption();
        System.out.println(selectedOption.getText());
        select.selectByIndex(1);
        selectedOption=select.getFirstSelectedOption();
        System.out.println(selectedOption.getText());
        System.out.println("Is Multiple: "+select.isMultiple());
        System.out.println("Selected Option: "+select.getFirstSelectedOption().getText());
        driver.close();
    }
}
