package stepDefs;

import basicTemplate.configs.browserSelector;
import basicTemplate.configs.utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static java.lang.Thread.sleep;


public class login extends browserSelector {

    basicTemplate.pages.login Obj = new basicTemplate.pages.login();
    String title;
    SoftAssert asserts = new SoftAssert();

    @Given("Enter URL")
    public void verifyURL() {
        System.out.println("Enter URL");
        page.navigate(URL);

    }

    @When("Browser is Open")
    public void verifyBrowser() {
        if (page != null) {
            System.out.println("Browser is open");
        } else {
            System.out.println("Browser not opened");
        }


    }

    @Then("User is redirected to the application's URL")
    public void verifyRedirection() {
        System.out.println("Verify User is redirected to URL");
    }


    @When("User enter the valid credentials of admin")
    public void userEnterTheValidCredentialsOfAdmin() {
        basicTemplate.pages.login.login();
    }

    @Then("Verify User should be able to redirect to HomePage")
    public void verifyUserShouldBeAbleToRedirectToHomePage() throws InterruptedException {
        sleep(1000);
        asserts.assertTrue(utils.isElementPresent(basicTemplate.pages.login.UserIcon));
        System.out.println("Verify User is redirected to HomePage");
    }
}
