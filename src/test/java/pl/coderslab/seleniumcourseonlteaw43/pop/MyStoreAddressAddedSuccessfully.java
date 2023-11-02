package pl.coderslab.seleniumcourseonlteaw43.pop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreAddressAddedSuccessfully {

    @FindBy(css = "#notifications > div > article > ul > li")
    private WebElement addressCreationSuccessPanel;

    public MyStoreAddressAddedSuccessfully(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public boolean isAccountCreationSuccessPanelDisplayed() {
        return "Address successfully added!".equals(addressCreationSuccessPanel.getText());
    }

}
