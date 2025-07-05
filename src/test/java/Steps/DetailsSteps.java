package Steps;

import Pages.DetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DetailsSteps {


    @Then("User enters all the required details")
    public void user_enters_all_the_required_details() {
        DetailsPage.user_enters_all_the_required_details();
        System.out.println("User Entered all the required details successfully");
    }

    @And("User clicks on Create an account button")
    public void user_clicks_on_create_an_account_button()throws InterruptedException {
       DetailsPage.user_clicks_on_create_an_account_button();
        System.out.println("User clicked on Create an account button");
    }

    @Then("User Logs in with valid credentials")
    public void user_logs_in_with_Valid_Credentials() {
        DetailsPage.user_logs_in_with_Valid_Credentials();
        System.out.println("User successfully Signed In with valid credentials");
    }

    @And("User should logged in successfully")
    public void user_should_logged_In_Successfully() {
        DetailsPage.user_should_logged_In_Successfully();
    }
    @Then("Sign out from application")
    public void user_sign_out_from_application() throws InterruptedException {
        DetailsPage.user_sign_out_from_application();
        System.out.println("User successfully ,Signed out from application");
    }

}
