package pl.coderslab.seleniumcourseonlteaw43.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreMyAccountPage {

    public MyStoreMyAccountPage(WebDriver driver) { PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addresses-link")
    private WebElement addressesButton;

    @FindBy(css = "[href=\"https://mystore-testlab.coderslab.pl/index.php?controller=address\"]")
    private WebElement createNewButton;

    public void clickAddressesButton() {
        addressesButton.click();
    }

    public void clickCreateNewButton() {
        createNewButton.click();
    }

}
