import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class ECommerceAutomation {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
    //disables the popup message of google password risk
        options.addArguments("--disable-features=PasswordLeakDetection");

        WebDriver driver = new ChromeDriver(options);
        //
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        System.out.println("User Name Entred");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        System.out.println("Password Entered");
        driver.findElement(By.cssSelector("#login-button")).click();
        System.out.println("Login Successfull!");
        /// /////////////////////// Login Completed

        System.out.println("Title :"+driver.getTitle());
        List<WebElement> webElements=driver.findElements(By.className("inventory_item_name"));
        System.out.println("========== PRODUCT LIST ==========");
        webElements.forEach(webElement -> System.out.println(webElement.getText()));
        System.out.println("Total Products :"+webElements.size());

        /// ///////////////////Product List Completed

        WebElement backPack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        System.out.println("Product Name : "+backPack.getText());
        System.out.println("Price :"+driver.findElement(By.xpath("//div[@class ='pricebar']/div[@class='inventory_item_price']")).getText());
        // product search completed

        System.out.println("========== SHOPPING CART ==========");
        //added Sauce Labs Backpack to cart
        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        System.out.println("Added: Sauce Labs Backpack");
        driver.findElement(By.xpath("//div/button[@id='add-to-cart-sauce-labs-bike-light']")).click();
        System.out.println("Cart Count : "+driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText());
        // testing of cart added function completed

        driver.findElement(By.className("shopping_cart_link")).click();
        System.out.println(driver.findElement(By.className("inventory_item_name")).getText());
        System.out.println(driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).getText());
        System.out.println("Cart verification: PASSED");
        //removing back-light from cart
        driver.findElement(By.xpath("//div/button[@id='remove-sauce-labs-bike-light']")).click();
        System.out.println("========== REMOVE PRODUCT ==========");
        System.out.println("Removed: Sauce Labs Bike Light");
        System.out.println("Cart Count: "+driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).getText());
        System.out.println("========== REMAINING PRODUCTS ==========");
        List<WebElement> webElementList=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        webElementList.forEach(webElement -> System.out.println(webElement.getText()));
        System.out.println("Final Cart Verification: PASSED");
        System.out.println();
        System.out.println("========== CHECKOUT INFORMATION ==========");
        driver.findElement(By.xpath("//div/button[@id='checkout']")).click();
        System.out.println("Current URL: " + driver.getCurrentUrl());
          System.out.println("Page Title: " + driver.getTitle());
          System.out.println("Checkout button clicked");
          driver.findElement(By.id("first-name")).sendKeys("Bhanu Prakash");
          System.out.println("First Name : Bhanu Prakash");
          driver.findElement(By.xpath("//div/input[@id='last-name']")).sendKeys("Pindi");
          System.out.println("Last Name : Pindi");
          driver.findElement(By.id("postal-code")).sendKeys("534447");
          System.out.println("Postal Code: 534447");
          driver.findElement(By.id("continue")).click();
            System.out.println("\n" +
                "Customer information submitted successfully!");
        System.out.println("========== CHECKOUT OVERVIEW ==========");
            System.out.println("Page Title :"+driver.getTitle());
        System.out.println("Heading: "+driver.findElement(By.xpath("//span[@class='title']")).getText());
        System.out.println("Checkout Verification: PASSED");
        System.out.println("Products:");
        driver.findElements(By.xpath("//div[@class='inventory_item_name']")).forEach(element-> System.out.println("Product: "+element.getText()));
        System.out.println("========== PRODUCT PRICES ==========");
        driver.findElements(By.xpath("//div[@class='inventory_item_price']")).forEach(webElement -> System.out.println("Price: "+webElement.getText()));
        System.out.println("========== PRICE SUMMARY ==========");
        System.out.println(driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText());
        System.out.println(driver.findElement(By.xpath("//div[@class='summary_tax_label']")).getText());
        System.out.println(driver.findElement(By.className("summary_total_label")).getText());
        System.out.println("Price Verification: PASSED");
        driver.findElement(By.id("finish")).click();
        System.out.println("========== ORDER CONFIRMATION ==========");
        System.out.println("Confirmation: "+driver.findElement(By.xpath("//h2[@class='complete-header']")).getText());
        String discription=driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
        System.out.println("Discription: "+discription);
        System.out.println("Order Placed : PASSED");
        Thread.sleep(1000);
        System.out.println("=============== Logout=============");
        driver.findElement(By.xpath("//div/button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.partialLinkText("Logout")).click();
        System.out.println("Logout Successfull!!!");


    }
}
