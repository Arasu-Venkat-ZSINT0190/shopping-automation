package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

public class ProductPage extends ElementUtils {
    private WebDriver driver;

    private By addToCartBtn = By.name("save_to_cart");

    public ProductPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickAddToCart() {
    click(addToCartBtn);
    }
}
