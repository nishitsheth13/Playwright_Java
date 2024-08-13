package basicTemplate.pages;


import basicTemplate.configs.browserSelector;
import basicTemplate.configs.loadProps;
import basicTemplate.configs.utils;
import org.testng.annotations.*;


public class loginPage extends utils {

    public static String U_name = loadProps.getProperty("Username");

    public static String P_word = loadProps.getProperty("Password");
    public static String username = "//input[@id='Username']";

    public static String password = "//input[@id='Password']";

    public static String SignInButton = "//button[@name='button']";

    public static String UserIcon = "//span[@class='menu_user_title']";


    @Test
    public static void login() {
        clickOnElement(username);
        enterText(username, U_name);
        clickOnElement(password);
        enterText(password, P_word);
        clickOnElement(SignInButton);

    }

    public static void logout() {
        clickOnElement(SignInButton);
    }

    @AfterTest
    public void closeBrowser() throws Exception {
        browserSelector.closeBrowser();
    }


    @BeforeTest
    @Parameters("Browser")
    public void launchBrowser(@Optional("chrome")String Browser) throws Exception {
        browserSelector.LaunchBrowser(Browser);
    }

//    @Test
//    public void verifyDropdown(){
//        driver.get("url");
//        clickOnElement(dropdown);
//        WebElement divElement = driver.findElement(DropdownOptions); // Replace "your-div-class-name" with the actual class name
//        String script = "arguments[0].style.display='block';";
//        ((JavascriptExecutor) driver).executeScript(script, divElement);
//        List<WebElement> hiddenElements = divElement.findElements(By.tagName("div"));
//      // Assuming the hidden elements are also divs
//        for (WebElement element : hiddenElements) {
//            if(element.getText().equals("ESS")) {
//                element.click();
//                break;
//            }
//        }
//
//    }
}
