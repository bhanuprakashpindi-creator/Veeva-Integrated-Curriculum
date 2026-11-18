import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.URI;
import java.time.Duration;
import java.util.List;

public class Automation {
    public static void main(String[] args) throws InterruptedException {

        //Task 1: Browser Launch
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        System.out.println("Page Title: "+driver.getTitle());
        System.out.println("URL: "+driver.getCurrentUrl());

        //Task 2: Homepage Verification
        boolean logo = driver.findElement(By.xpath("//div/child::img")).isDisplayed();
        if (logo)
        {
            System.out.println("Logo Displayed!!");
            System.out.println(driver.findElement(By.xpath("//div/child::img")).getText());
        }
        else System.out.println("Logo Not Displayed");
        Thread.sleep(3000);
        //Task 3: Navigate to Products
       boolean link= driver.findElement(By.partialLinkText("Products")).isEnabled();
       if (link)
       {
           System.out.println("Yes The Link Is Enabled");
       }
       driver.findElement(By.partialLinkText("Products")).click();
        System.out.println("URL: "+ driver.getCurrentUrl());
        Thread.sleep(3000);
        //Task 4: Extract Product Information
        System.out.println("========== PRODUCT DETAILS ==========");
        System.out.println("Product Name: "+driver.findElement(By.xpath("//div[@class='productinfo text-center']/p")).getText());
        System.out.println("Product Price: "+driver.findElement(By.xpath("//div/child::img/following-sibling::h2")).getText());
        logo = driver.findElement(By.xpath("//div/descendant::img")).isDisplayed();
        if (logo)
            System.out.println("Image Displayed: "+logo);
        else System.out.println("Image Displayed: "+logo);
        System.out.println("Image URL: "+driver.findElement(By.xpath("//div[@class='col-sm-4']/descendant::img")).getAttribute("src"));

        //task -5 Search Products
        WebElement search=driver.findElement(By.xpath("//div/child::input[@type='text']"));

       Boolean searchBar = search.isDisplayed();
       if (searchBar)
       {
           System.out.println("Search Bar is Displayed");
       }
       else System.out.println("Search Bar is Not Displayed");
       search.sendKeys("Blue Top");
        System.out.println(search.getAttribute("value"));
        search.clear();
        search.sendKeys("Blue Top");
        driver.findElement(By.xpath("//div/child::button[@id='submit_search']")).click();
        System.out.println(driver.findElement(By.xpath("//div/child::img/following-sibling::p")).getText());
        //Task 6 – Add Product to Cart
        driver.navigate().back();
        System.out.println("Came Back");
        driver.findElement(By.xpath("//div/child::button[@id='submit_search']")).click();
        System.out.println("Adding To Cart");
        driver.findElement(By.cssSelector("a.add-to-cart[data-product-id='1']")).click();
        System.out.println("Added to cart");
        Thread.sleep(3000);
       driver.findElement(By.xpath("//u[normalize-space()='View Cart']")).click();
        System.out.println("Cart Clicked");
        boolean productAddded = driver.findElement(By.xpath("//div/table/child::tbody/descendant::a[text()='Blue Top']")).isDisplayed();
        if (productAddded)
        {
            System.out.println("Blue Top is Visible in  The Cart ");
        }
        else System.out.println("Blue Top Not Visible in the cart");
        System.out.println("Product Details");
        System.out.println("Product Name: "+driver.findElement(By.xpath("//div/table/child::tbody/descendant::td[@class='cart_description']/h4/a")).getText());
        System.out.println("Product Price: "+driver.findElement(By.xpath("//div/table/child::tbody/descendant::td[3]/p")).getText());
        System.out.println("Product Quanitity: "+driver.findElement(By.xpath("//div/table/child::tbody/descendant::td[4]/button")).getText());
        System.out.println("Product Total: "+driver.findElement(By.xpath("//div/table/child::tbody/descendant::td[5]/p")).getText());
        driver.findElement(By.xpath("//div/table/child::tbody/descendant::td[6]/a")).click();
        System.out.println("Removed From Cart");
        Thread.sleep(2000);
        List<WebElement> products = driver.findElements(
                By.xpath("//div/table/child::tbody/descendant::a[text()='Blue Top']")
        );

        if (products.isEmpty()) {
            System.out.println("Product Removed Successfully");
        } else {
            System.out.println("Product Still in Cart");
        }
        List<WebElement> webElement=driver.findElements(By.xpath("//div/table/child::tbody/tr"));
        for (WebElement webElement1 : webElement)
        {
            System.out.println("Product Details");
            System.out.println("Product Name: "+webElement1.findElement(By.xpath(".//descendant::td[@class='cart_description']/h4/a")).getText());
            System.out.println("Product Price: "+driver.findElement(By.xpath(".//descendant::td[3]/p")).getText());
            System.out.println("Product Quanitity: "+driver.findElement(By.xpath(".//descendant::td[4]/button")).getText());
            System.out.println("Product Total: "+driver.findElement(By.xpath(".//descendant::td[5]/p")).getText());
        }
        System.out.println("Remaining Products: "+webElement.size());
        System.out.println(driver.findElement(By.xpath("//div/span/p/b")).getText());
    }
}
