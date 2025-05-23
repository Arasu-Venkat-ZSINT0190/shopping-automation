package stepdefs;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;
import utils.DriverFactory;

public class AddToCartSteps {
    private WebDriver driver;

    private HomePage homePage;
    private ProductPage productPage;
    private CartPage cartPage;

    public AddToCartSteps() {
        this.driver = DriverFactory.getDriver();
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
    }

    @Given("user is logged in and on the homepage")
    public void user_is_logged_in_and_on_homepage() {
        driver.get("https://www.advantageonlineshopping.com/");
    }

    @When("user clicks on {string} category")
    public void user_clicks_category(String categoryName) {
        homePage.selectCategory(categoryName);
    }

    @When("user selects a tablet product")
    public void user_selects_a_tablet_product() {
        homePage.clickAnyProduct();
    }

    @When("user clicks on \"Add to Cart\" button")
    public void user_clicks_add_to_cart() {
        productPage.clickAddToCart();
    }


    @When("user clicks on cart icon at top")
    public void user_clicks_on_cart_icon() {
        homePage.clickCartIcon();
    }

    @Then("user should see the added product in the cart")
    public void user_should_see_product_in_cart() {
        Assert.assertTrue(cartPage.isProductInCart());
    }
}
