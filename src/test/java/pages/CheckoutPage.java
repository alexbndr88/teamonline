package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    @FindBy(id = "item")
    WebElement item;

    @FindBy(id = "quantity")
    WebElement quantityInput;

    @FindBy(id = "checkoutButton")
    WebElement checkoutButton;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectItem() {
        item.click();
    }

    public void enterQuantity(String quantity) {
        quantityInput.sendKeys(quantity);
    }

    public void clickCheckoutButton() {
        checkoutButton.click();
    }
}