package basicTemplate.configs;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class utils extends baseClass {

    public static void clickOnElement(String element) {
        page.locator(element).click();
    }

    public static void selectDropDownValueByText(String element, String Text) {
        page.locator(element).click();
    }

    public static void clearText(String by) {
        page.locator(by).clear();
    }

    public static void enterText(String element, String inputText) {
        if (inputText != null && !inputText.isEmpty()) {
            clickOnElement(element);
            page.locator(element).fill(inputText);
        }
    }

    public static String timeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("MMDDYYYY-HHmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static boolean isElementPresent(String element) {
        return page.locator(element).isVisible();

    }

    public static void UploadFile(String by, String args) {
        Locator fileInput = page.locator(by);
        fileInput.setInputFiles(Paths.get("C://Users//Nishit.Sheth//IdeaProjects//MRIEnergy_AutomationSuite//Extent-Report//PdfReport//extentPdf.pdf"));
    }

 /*   public static void selectElementByIndex(String by, int integer) {
        Select select = new Select(page.locator(by));
        select.selectByIndex(integer);
    }*/

    public String getScreenShotPath(String TestName) throws IOException, AWTException {
        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get(System.getProperty("user.dir") + "//Reports//" + "//Screenshots//" + TestName + utils.timeStamp() + ".png"))
                .setFullPage(true));

        String destPath = System.getProperty("user.dir") + "//Reports//" + "//Screenshots//" + TestName + utils.timeStamp() + ".png";

        return destPath;
    }


}
