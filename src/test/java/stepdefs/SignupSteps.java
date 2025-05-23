package stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import pages.SignupPage;
import utils.DriverFactory;

public class SignupSteps {
    WebDriver driver;
    SignupPage signupPage;

    @Given("user is on the Advantage Online Shopping registration page")
    public void user_on_registration_page() {
        driver = DriverFactory.getDriver();
        signupPage = new SignupPage(driver);
        // Directly open the registration page URL
        signupPage.openRegistrationPage("https://advantageonlineshopping.com/#/register");
    }

    @When("user fills the signup form with {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void user_fills_signup_form(String username, String email, String password, String confirmPassword,
                                       String firstName, String lastName, String phone, String country,
                                       String city, String address, String state, String postalCode) {
        signupPage.fillSignupForm(username, email, password, confirmPassword, firstName,
                lastName, phone, country, city, address, state, postalCode);
    }

    @When("user submits the registration form")
    public void user_submits_registration() {
        signupPage.clickRegisterButton();
    }

    @Then("user should see the username after signup {string} displayed on the dashboard")
    public void user_should_see_username_after_signup(String expectedUsername) {
        String actualUsername = signupPage.getLoggedInUsername();
        Assert.assertTrue("Expected username not found on dashboard!", actualUsername.contains(expectedUsername));
    }
}
