package stepDefs;

import basicTemplate.configs.browserSelector;
import basicTemplate.pages.treeConfigurations;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class treeConfiguration extends browserSelector {
    SoftAssert asserts = new SoftAssert();
    treeConfigurations tree = new treeConfigurations();

    @When("User try to modify the Tree Configuration")
    public void user_try_to_modify_the_tree_configuration() throws InterruptedException {
        tree.configTree();
    }

    @Then("Verify that User should be success in the Modification of Tree Configuration")
    public void verify_that_user_should_be_success_in_the_modification_of_tree_configuration() throws InterruptedException {
        Thread.sleep(10000);
        assertThat(page.getByText("BrdEleM01")).isVisible();
    }

}
