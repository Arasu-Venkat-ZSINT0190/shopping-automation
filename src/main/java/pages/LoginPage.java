package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementUtils;

public class LoginPage extends ElementUtils {
    WebDriver driver;

    private final By userIcon = By.id("menuUser");
    private final By usernameInput = By.name("username");
    private final By passwordInput = By.name("password");
    private final By loginButton = By.id("sign_in_btn");
    private final By loggedInUser = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void clickUserIcon() {
        click(userIcon);
    }

    public void enterUsername(String username) {
         type(usernameInput, username);
    }

    public void enterPassword(String password) {
          type(passwordInput, password);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public String getLoggedInUsername() {
             return getText(loggedInUser);
    }
}
