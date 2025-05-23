package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

public class HomePage extends ElementUtils {
    private WebDriver driver;

    private By tabletsCategory = By.id("tabletsImg");
    private By firstProduct = By.cssSelector("div.categoryRight li:nth-child(1) img");
    private By cartIcon = By.id("menuCart");

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void selectCategory(String categoryName) {
        if (categoryName.equalsIgnoreCase("TABLETS")) {
           click(tabletsCategory);
        }
    }

    public void clickAnyProduct() {
      click(firstProduct);
    }

    public void clickCartIcon() {
        click(cartIcon);
    }
}
