package pl.coderslab.seleniumcourseonlteaw43.pop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreLoginPage {

    public MyStoreLoginPage(WebDriver driver) { PageFactory.initElements(driver, this);
    }

    @FindBy(className = "user-info")
    private WebElement signInLink;

    @FindBy(id = "field-email")
    private WebElement emailInput;

    @FindBy(id = "field-password")
    private WebElement passwordInput;

    @FindBy(id ="submit-login")
    private WebElement signInButton;

    public void signIn() {
        signInLink.click();
        emailInput.sendKeys("tren.verde@gmail.com");
        passwordInput.sendKeys("CodersLab2023");
        signInButton.click();
    }

}
