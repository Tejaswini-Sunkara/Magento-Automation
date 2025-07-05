package Pages;

import org.openqa.selenium.By;
import static Utility.BrowserDriver.driver;

public class HomePages {

    public static String CreateAccount_xpath = "(//a[text()='Create an Account'])[1]";

    public static void User_clicks_on_Create_an_Account_on_Homepage() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[text()='Create an Account'])[1]")).isDisplayed();
        driver.findElement(By.xpath(CreateAccount_xpath)).click();
        Thread.sleep(9000);

    }

    public static void User_Navigates_To_Sign_In_Page() {
        driver.findElement(By.linkText("Sign In")).click();
    }

}
