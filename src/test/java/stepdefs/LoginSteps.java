package stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on the Advantage Online Shopping homepage")
    public void user_on_homepage() {
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.openHomePage("https://advantageonlineshopping.com/#/");
    }

    @When("user clicks on the user icon")
    public void user_clicks_user_icon() {
        loginPage.clickUserIcon();
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user should see the username {string} displayed on the dashboard")
    public void user_should_see_username(String expectedUsername) {
        String actualUsername = loginPage.getLoggedInUsername();
        Assert.assertTrue("Expected username not found on dashboard!", actualUsername.contains(expectedUsername));
    }
}
