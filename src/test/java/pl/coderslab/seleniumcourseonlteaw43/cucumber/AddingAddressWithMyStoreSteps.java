package pl.coderslab.seleniumcourseonlteaw43.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.seleniumcourseonlteaw43.pop.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddingAddressWithMyStoreSteps {

    private WebDriver driver;
    private MyStoreLoginPage myStoreLoginPage;
    private MyStoreMyAccountPage myStoreMyAccountPage;
    private MyStoreAddressesPage myStoreAddressesPage;
    private MyStoreAddressAddedSuccessfully myStoreAddressAddedSuccessfully;


    @Given("Page MyStore opened in browser")
    public void openedInABrowser() {
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        this.driver.get("https://mystore-testlab.coderslab.pl");
        this.myStoreLoginPage = new MyStoreLoginPage(driver);
        this.myStoreMyAccountPage = new MyStoreMyAccountPage(driver);
        this.myStoreAddressesPage = new MyStoreAddressesPage(driver);
        this.myStoreAddressAddedSuccessfully = new MyStoreAddressAddedSuccessfully(driver);
    }

    @When("User is signed in")
    public void credentials() {myStoreLoginPage.signIn();}

    @And("Addresses tab is selected")
    public void addressesButton() {myStoreMyAccountPage.clickAddressesButton();}

    @And("the 'Create New Address' button is clicked")
    public void createNewButton() {myStoreMyAccountPage.clickCreateNewButton();}

    @Then("Fields: {string} {string} {string} {string} {string} are completed")
    public void fillForm(String alias, String address, String city, String postcode, String phone){
        myStoreAddressesPage.fillForm(alias, address, city, postcode, phone);}

    @And("Address is saved")
    public void saveButton() {myStoreAddressesPage.clickSaveButton();}

    @And("Address is added successfully")
    public void finalCheck(){
        assertTrue(myStoreAddressAddedSuccessfully.isAccountCreationSuccessPanelDisplayed());}

//    @And("Browser is closed")
//    public void closeBrowser() {this.driver.quit();}

}
