package stepDef;

import basicTemplate.configs.browserSelector;
import basicTemplate.configs.utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class hooks extends utils {

    @Before
    public void before() throws Exception {
        browserSelector.setUp();
    }

    @After
    public void after() throws Exception {
        browserSelector.tearDown();
    }

    @Parameters("Browsers")
    @BeforeTest
    public void beforeTest(String browsers) throws Exception {
        browserSelector.LaunchBrowser(browsers);
    }

    @AfterTest
    public void afterTest() throws Exception {
        browserSelector.closeBrowser();
    }

}
