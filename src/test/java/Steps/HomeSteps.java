package Steps;

import Pages.HomePages;
import Utility.BrowserDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static Utility.BrowserDriver.driver;

public class HomeSteps {

    @Given("User Navigates to Magento homepage")
    public void user_navigates_to_magento_homepage() {
        BrowserDriver.initializeDriver();
        driver = BrowserDriver.getDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//a[text()='Create an Account'])[1]")).isDisplayed();
        System.out.println("User navigates to Magento homepage");
    }

    @When("Users clicks on Create an Account On Homepage")
    public void User_clicks_on_Create_an_Account_on_Homepage() throws InterruptedException {
        HomePages.User_clicks_on_Create_an_Account_on_Homepage();
        System.out.println("User clicks on Create Account link On Homepage");
    }

    @When("User Navigates to Sign In page")
    public void User_Navigates_To_Sign_In_Page() {
        HomePages.User_Navigates_To_Sign_In_Page();
        System.out.println("User Navigates to sign In Page");
    }









}
