package stepdef;

import basicTemplate.configs.browserSelector;
import basicTemplate.configs.utils;
import basicTemplate.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static java.lang.Thread.sleep;


public class loginScreen extends browserSelector {

    loginPage Obj = new loginPage();
    String title;

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
        title = page.title();
        Assert.assertEquals(title, "Login - MRI Energy");
    }


    @When("User enter the valid credentials of admin")
    public void userEnterTheValidCredentialsOfAdmin() {
        loginPage.login();
    }

    @Then("Verify User should be able to redirect to HomePage")
    public void verifyUserShouldBeAbleToRedirectToHomePage() throws InterruptedException {
        sleep(100);
        Assert.assertTrue(utils.isElementPresent(loginPage.UserIcon));
        System.out.println("Verify User is redirected to HomePage");
    }
}
