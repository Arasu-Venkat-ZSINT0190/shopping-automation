package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ElementUtils;

public class SignupPage extends ElementUtils {
    WebDriver driver;

    // Locators (unchanged)
    private final By usernameInput = By.name("usernameRegisterPage");
    private final By emailInput = By.name("emailRegisterPage");
    private final By passwordInput = By.name("passwordRegisterPage");
    private final By confirmPasswordInput = By.name("confirm_passwordRegisterPage");
    private final By firstNameInput = By.name("first_nameRegisterPage");
    private final By lastNameInput = By.name("last_nameRegisterPage");
    private final By phoneInput = By.name("phone_numberRegisterPage");
    private final By countryDropdown = By.name("countryListboxRegisterPage");
    private final By cityInput = By.name("cityRegisterPage");
    private final By addressInput = By.name("addressRegisterPage");
    private final By stateInput = By.name("state_/_province_/_regionRegisterPage");
    private final By postalCodeInput = By.name("postal_codeRegisterPage");
    private final By agreeCheckbox = By.name("i_agree");
    private final By registerButton = By.id("register_btn");
    private final By loggedInUser = By.xpath("//span[@class='hi-user containMiniTitle ng-binding']");

    public SignupPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    // New method for direct registration page opening
    public void openRegistrationPage(String url) {
        driver.get(url);
        waitForLoaderToDisappear();
    }

    public void fillSignupForm(String username, String email, String password, String confirmPassword,
                               String firstName, String lastName, String phone, String country,
                               String city, String address, String state, String postalCode) {
        type(usernameInput, username);
        type(emailInput, email);
        type(passwordInput, password);
        type(confirmPasswordInput, confirmPassword);
        type(firstNameInput, firstName);
        type(lastNameInput, lastName);
        type(phoneInput, phone);
        selectByVisibleText(countryDropdown, country);
        type(cityInput, city);
        type(addressInput, address);
        type(stateInput, state);
        type(postalCodeInput, postalCode);
        click(agreeCheckbox);
    }

    public void clickRegisterButton() {
        click(registerButton);
    }

    public String getLoggedInUsername() {
        return getText(loggedInUser);
    }
}
