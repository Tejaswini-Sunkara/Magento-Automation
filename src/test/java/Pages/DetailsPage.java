package Pages;

import Utility.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.util.concurrent.TimeUnit;

public class DetailsPage extends BrowserDriver {

    public static void user_enters_all_the_required_details() {
        driver.findElement(By.id("firstname")).sendKeys("Kiho");
        driver.findElement(By.id("lastname")).sendKeys("David");
        driver.findElement(By.id("email_address")).sendKeys("davidkiho19988@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Password@123490");
        driver.findElement(By.id("password-confirmation")).sendKeys("Password@123490");
}

    public static void user_clicks_on_create_an_account_button() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[text()='Create an Account'])[1]")).isDisplayed();
        driver.findElement(By.xpath("(//span[text()='Create an Account'])[1]")).click();

    }
    public static void user_logs_in_with_Valid_Credentials() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='60%'");

        driver.findElement(By.xpath("//span[text()='Email']/following::input[1]")).sendKeys("davidkiho19988@gmail.com");
        System.out.println("Email entered successfully");
        driver.findElement(By.xpath("(//span[text()='Password']/following::input)[1]")).sendKeys("Password@123490");
        System.out.println("Password entered successfully");
        driver.findElement(By.xpath("(//span[text()='Sign In'])[1]")).click();
    }
    public static void user_should_logged_In_Successfully() {
        String val = driver.findElement(By.xpath("(//span[@class='logged-in'])[1]")).getText();
        System.out.println(val +"User logged in successfully");
    }
    public static void user_sign_out_from_application() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("(//button[@class='action switch'])[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();
    }
}