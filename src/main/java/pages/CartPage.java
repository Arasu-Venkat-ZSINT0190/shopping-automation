package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

public class CartPage extends ElementUtils {
    private WebDriver driver;

    private By cartProducts = By.cssSelector("div#shoppingCart");
    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isProductInCart() {
        return !driver.findElements(cartProducts).isEmpty();
    }
}
