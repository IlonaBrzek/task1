package pl.coderslab.seleniumcourseonlteaw43.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreAddressesPage {

    public MyStoreAddressesPage(WebDriver driver) { PageFactory.initElements(driver, this);
    }

    @FindBy(id = "field-alias")
    private WebElement aliasInput;

    @FindBy(id = "field-address1")
    private WebElement addressInput;

    @FindBy(id = "field-city")
    private WebElement cityInput;

    @FindBy(id = "field-postcode")
    private WebElement zipInput;

    @FindBy(id = "field-phone")
    private WebElement phoneInput;

    @FindBy(css = "[type='submit']")
    private WebElement saveButton;

    public void fillForm (String alias, String address, String city, String postcode, String phone) {
        aliasInput.sendKeys(alias);
        addressInput.sendKeys(address);
        cityInput.sendKeys(city);
        zipInput.sendKeys(postcode);
        phoneInput.sendKeys(phone);
    }

    public void clickSaveButton() {saveButton.click();}
}
