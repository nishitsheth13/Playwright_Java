package hooks;

import basicTemplate.configs.browserSelector;
import basicTemplate.configs.utils;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class hooks extends utils {

    @BeforeAll
    public static void before() throws Exception {
        browserSelector.setUp();
    }

    @AfterAll
    public static void after() throws Exception {
        browserSelector.tearDown();
    }


    @BeforeSuite
    @Parameters("Browsers")
    public void beforeTest(String browsers) throws Exception {
        browserSelector.LaunchBrowser(browsers);
    }

    @AfterSuite
    public void afterTest() throws Exception {
        browserSelector.closeBrowser();
    }

}
