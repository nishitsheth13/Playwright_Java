package basicTemplate.configs;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class utils extends base {

    public static void clickOnElement(String element) {
        isElementPresent(element);
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
            isElementPresent(element);
            clickOnElement(element);
            page.locator(element).fill(inputText);
        }
    }

    public static String getText(String element){
         String text = String.valueOf(page.getByText(element));
        return text;

    }

    public static String timeStamp() {
        DateFormat dateFormat = new SimpleDateFormat("MM_DD_YYYY_HHmm");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static boolean isElementPresent(String element) {
        return page.locator(element).isVisible();

    }

    public static void UploadFile(String by, String args) {
        Locator fileInput = page.locator(by);
        fileInput.setInputFiles(Paths.get(System.getProperty("user.dir") + "/MRITestExecutionReports/" + loadProps.getProperty("Version") + "//extentReports//cucumberExtentReports//pdf//Pdf.pdf"));
    }

    public String getScreenShotPath(String TestName) throws IOException, AWTException {
        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get(System.getProperty("user.dir") + "/MRITestExecutionReports/" + loadProps.getProperty("Version") + "/screenShots/" + TestName + "_" + utils.timeStamp() + ".png"))
                .setFullPage(true));

        String destPath = "/MRITestExecutionReports/" + loadProps.getProperty("Version") + "/screenShots/" + TestName + "_" + utils.timeStamp() + ".png";

        return destPath;
    }


}
