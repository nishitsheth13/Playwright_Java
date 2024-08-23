package basicTemplate.pages;

import basicTemplate.configs.browserSelector;
import basicTemplate.configs.loadProps;
import basicTemplate.configs.utils;
import org.testng.annotations.*;

import static basicTemplate.pages.login.username;
import static java.lang.Thread.sleep;

public class manageInvoice extends utils {

    public static String AccountNumber = loadProps.getProperty("AccountNumber");
    public static String InvoiceType = loadProps.getProperty("InvoiceType");
    public static String InvoiceNumber = loadProps.getProperty("InvoiceNumber");
    public static String InvoiceCurrency = loadProps.getProperty("InvoiceCurrency");
    public static String InvoiceForwardBalance = loadProps.getProperty("InvoiceForwardBalance");
    public static String InvoiceNetTotal = loadProps.getProperty("InvoiceNetTotal");
    public static String InvoiceTaxTotal = loadProps.getProperty("InvoiceTaxTotal");
    public static String InvoiceTotal = loadProps.getProperty("InvoiceTotal");
    public static String InvoiceInternalNotes = loadProps.getProperty("InvoiceInternalNotes");
    public static String InvoiceExternalNotes = loadProps.getProperty("InvoiceExternalNotes");
    public static String InvoiceSearchTaxCharge = loadProps.getProperty("InvoiceSearchTaxCharge");
    public static String SearchMeterText = loadProps.getProperty("SearchMeterText");
    public static String InvoiceTax = loadProps.getProperty("InvoiceTax");
    public static String SearchRateDescription = loadProps.getProperty("RateDescription");
    public static String InvoiceStartDay = loadProps.getProperty("InvoiceStartDay");
    public static String InvoiceStartDate = loadProps.getProperty("InvoiceStartDate");
    public static String DueDate = loadProps.getProperty("DueDate");
    public static String EndMonth = loadProps.getProperty("EndMonth");
    public static String EndDate = loadProps.getProperty("EndDate");
    public static String InvoiceDate = loadProps.getProperty("InvoiceDate");
    public static String ReceivedDate = loadProps.getProperty("ReceivedDate");
    public static String Setup = "xpath=//*[@id=\"MainMenu\"]/li[2]/a/div/span";
    public static String invoiceValidationMenu = "xpath=/html/body/form/div[5]/div[1]/div[3]/div[1]/ul/li[6]/a/div/span";
    public static String manageInvoiceLink = "text=Manage Invoices";
    public static String headerSection = "xpath=//*[@id=\"MainPane\"]/div/h3";
    public static String portfolio = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[1]/div[1]/span/button";
    public static String selectPortfolio = "xpath=//span[normalize-space()='Master Portfolio']";
    public static String addButton = "xpath=/html/body/div[1]/div[2]/div/div/div[2]/div/div[1]/button[1]";
    public static String searchAccount = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[1]/div[2]/span/input";
    public static String selectAccount = "xpath=/html[1]/body[1]/div[9]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]";
    public static String searchInvoiceType = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[3]/div[1]/span/input";
    public static String selectInvoiceType = "xpath=/html[1]/body[1]/div[12]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]";
    public static String enterInvoiceNumber = "input[id='invoiceNumber']";
    public static String clickOnStartDateCalender = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[5]/div[1]/div[1]/div[1]/span/button";
    public static String selectStartMonthList = "xpath=/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/button[1]/span[1]";
    public static String selectStartMonth = "xpath=/html/body/div[3]/div/div/div/div[2]/table/tbody/tr[3]/td[3]/span";
    public static String selectStartDate = "xpath=//td[@title='" + InvoiceStartDay + " " + InvoiceStartDate + "']//span[@class='k-link'][normalize-space()='1']";
    public static String clickOnEndDateCalender = "xpath=/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/span[1]/button[1]";
    public static String selectEndMonthList = "xpath=/html/body/div[4]/div/div/div/div[1]/button/span";
    public static String selectEndMonth = "xpath=//td[@title='" + EndMonth + "']";
    public static String selectEndDate = "xpath=//span[normalize-space()='" + EndDate + "']";
    public static String clickOnInvoiceDateCalender = "xpath=/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[1]/span[1]/button[1]";
    public static String selectInvoiceDate = "xpath=//td[1]//span[normalize-space()='" + InvoiceDate + "']";
    public static String clickOnReceivedDateCalender = "xpath=/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[2]/div[2]/span[1]/button[1]";
    public static String selectReceivedDate = "xpath=//td[1]//span[normalize-space()='" + ReceivedDate + "']";
    public static String clickOnDueDateCalender = "xpath=/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[3]/div[1]/span[1]/button[1]";
    public static String selectDueDate = "xpath=//td[1]//span[normalize-space()='" + DueDate + "']"; //td[@title='Thursday, 1 August 2024']//span[@class='k-link'][normalize-space()='1']
    public static String clickOnCurrencyDropdown = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[6]/div[1]/span/input";
    public static String selectCurrency = "xpath=//span[@class='k-list-item-text']";
    public static String netTotal = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[7]/div[1]/span/input";
    public static String invoiceTotal = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[7]/div[3]/span/input";
    public static String taxTotal = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[7]/div[2]/span/input";
    public static String forwardBalance = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[6]/div[2]/span/input";
    public static String internalReference = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[8]/div[1]/span/input";
    public static String externalReference = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[8]/div[2]/span/input";
    public static String finalInvoice = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div/div[1]/div[9]/div/span";
    public static String clickOnNext = "xpath=//button[@class='telerik-blazor k-button k-button-solid k-rounded-full k-button-md k-button-solid-primary']";
    public static String clickOnAttachmentIcon = "xpath=/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/div[2]/button[1]";
    public static String clickOnAddAttachment = "xpath=/html/body/div[3]/div[2]/div[2]/div/div/div[1]/button[1]";
    public static String clickOnUploadAttachment = "xpath=//button[@class='telerik-blazor k-button k-button-solid k-rounded-sm k-button-md k-button-solid-primary']";
    public static String clickOnCloseAttachmentIcon = "xpath=/html/body/div[18]/div[2]/div[1]/div[2]/button";
    public static String selectFileManager = "xpath=.//input[@type='file']";
    public static String closeAttachmentModel = "xpath=/html/body/div[3]/div[2]/div[1]/div[2]/button";
    public static String selectFileInFileManager = "xpath=//button[contains(@aria-label,'Select files... .')]";
    public static String clickOnAddConsumption = "xpath=/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/button[1]";
    public static String clickOnRemoveConsumption = "xpath=/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[2]/div[15]/button[1]";
    public static String CountOfDiv = "xpath=/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[2]/div";
    public static String meterSelection = "xpath=/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[2]/span[1]/button[1]";
    public static String clickOnRateDescription = "//input[@id='ddChargeDescription']";
    public static String selectRateDescription = "//*/text()[normalize-space(.)='Energy Charge - Day']/parent::*";
    public static String searchRateDescription = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div[4]/div[1]/div[6]/span/input";
    public static String selectMeterNumber = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/table/tbody/tr[1]/td[1]/span/button";
    public static String clickOnNextButtonForCharges = "//button[5]";
    public static String addPrice = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/table/tbody/tr[1]/td[4]";
    public static String enterPrice = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/table/tbody/tr[1]/td[4]/span[1]/input";
    public static String addUnit = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/table/tbody/tr[1]/td[5]";
    public static String enterUnits = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/table/tbody/tr[1]/td[5]/span/input";
    public static String saveMeterData = "//div[2]/div[2]/div[1]/div/table/tbody/tr[1]/td[8]/span/button[3]";
    public static String addMeter = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div[1]/div/div[2]/div/div[1]/button[1]";
    public static String clickOnRemoveMeter = "//div[2]/div[2]/div[1]/div/table/tbody/tr[19]/td[8]/span/button[2]";
    public static String removeTaxCharge = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div[4]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/table/tbody/tr[2]/td[8]/span/button";
    public static String addTaxCharge = "//div[@aria-label='Grid toolbar']//div//div//button[@type='button']";
    public static String searchTaxCharge = "//input[@role='combobox']";
    public static String selectTaxCharge = "//span[@class='k-list-item-text']";
    public static String enterMeter = "//input[contains(@placeholder,'Please select')]";
    public static String clickOnSelectMeter = "xpath=//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]";
    public static String selectMeter = "//span[normalize-space()='" + SearchMeterText + "']";
    public static String SelectByDefault="xpath=/html/body/div[7]/div/div/div/div[2]/ul/li[1]/span[1]";
    public static String addTaxRate = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/form/div[4]/div/div[2]/div/div[2]/div[2]/div[2]/div[1]/div/table/tbody/tr/td[3]";
    public static String clearTaxCharge = "//*[name()='path' and contains(@d,'M416 141.3')]";
    public static String clickOnTaxCharge = "xpath=/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]";
    public static String enterTaxRate = "//input[@role='spinbutton']";
    public static String clickOnNextForValidationReview = "//div[@class='telerik-blazor k-split-button k-rounded-full k-button-group']//button[1]";
    public static String ClickToRevalidate = "//div[@aria-label='Grid toolbar']//button[@type='button']";
    public static String clickOnSaveAndClose = "xpath=/html/body/div[1]/div[2]/div/div[3]/span[3]/button";
    public static String clickOnSaveAndContinue = "xpath=/html/body/div[1]/div[2]/div/div/div/div/div[2]/span[2]/button[7]";
    //    public sStringy clickOnAddNoteIcon = By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/span[2]/div[1]/button");
    //    public sStringy addNote = By.xpath("");
    //
    public static String ClickOnPath = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='Path'])[1]/following::p[1]";
    public static String SelectPath = "xpath=//*[normalize-space(text())='Marvel Entertainment']/parent::*";
    public static String clickOnStartDateCalenderOnListing = "xpath=/html/body/div[1]/div[2]/div/div/div[1]/div[6]/div/span[1]/button";
    public static String clickOnStartMonthCalender = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='items per page'])[1]/following::button[1]";
    public static String selectStartMonthOnCalender = "xpath=//span[normalize-space()='Jan']";
    public static String selectStartDateOnMonth = "xpath=/html/body/div[3]/div/div/div/div[2]/table/tbody/tr[1]/td[1]";
    public static String clickOnEndDateCalenderOnListing = "xpath=//div[@id='MainPane']/div/div/div/div[6]/div/span[2]/button";
    public static String clickOnEndMonthCalender = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='items per page'])[1]/following::button[1]";
    public static String selectEndMonthOnCalender = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='Reload'])[1]/preceding::span[1]";
    public static String selectEndDateOnMonth = "xpath=(.//*[normalize-space(text()) and normalize-space(.)='Reload'])[1]/preceding::span[6]";
    public static String ApplyFilterButton = "xpath=//*[@id='MainPane']/div/div/span/span[1]/button";
    public static String selectRawInGrid = "xpath=//tbody/tr[1]/td[1]/span[1]/span[1]/input[1]";
    public static String clickOnOptions = "xpath=/html/body/div[1]/div[2]/div/div/div[2]/div/div[3]/div[2]/div[2]/div[1]/div/table/tbody/tr[1]/td[24]/span/div/button";
    public static String selectDeleteOption = "xpath=/html/body/div[5]/div/div/ul/li[12]/span/div/div[2]";
    public static String deleteText = "xpath=/html/body/div[3]/div[2]/div[2]/div/div[1]/div[3]/span/input";
    public static String SubmitButtonOnDeleteModel = "xpath=/html/body/div[3]/div[2]/div[2]/div/div[2]/div[1]/button";


    @AfterTest
    public void closeBrowser() throws Exception {
        browserSelector.closeBrowser();
    }


    @BeforeTest
    @Parameters("Browser")
    public void launchBrowser(@Optional("chrome") String Browser) throws Exception {
        browserSelector.LaunchBrowser(Browser);
    }


    @Test
    public void redirectToInvoiceList() throws InterruptedException {
        if (page.isVisible(username)) {
            login.login();
            System.out.println("User Logged in.");
        }
        sleep(2000);
        clickOnElement(invoiceValidationMenu);
        sleep(1000);
        clickOnElement(manageInvoiceLink);
        sleep(2000);
    }


    public void createInvoice() throws InterruptedException {
        if (page.isHidden(headerSection)) {
            redirectToInvoiceList();
        }
        invoiceDetail();
        invoiceConsumption();
        invoiceCharges();
        validationSummary();


    }

    public void invoiceDetail() throws InterruptedException {
        sleep(1000);
        clickOnElement(addButton);
        sleep(1000);
        clickOnElement(portfolio);
        isElementPresent(selectPortfolio);
        sleep(1000);
        clickOnElement(selectPortfolio);
        enterText(searchAccount, AccountNumber);
        sleep(200);
        clickOnElement(selectAccount);
        sleep(1000);
        enterText(searchInvoiceType, InvoiceType);
        sleep(1000);
        clickOnElement(selectInvoiceType);
        enterText(enterInvoiceNumber, InvoiceNumber);
        sleep(1000);
        isElementPresent(clickOnStartDateCalender);
        clickOnElement(clickOnStartDateCalender);
        sleep(2000);
        clickOnElement(selectStartMonthList);
        sleep(1000);
        clickOnElement(selectStartMonth);
        sleep(1000);
        isElementPresent(selectStartDate);
        clickOnElement(selectStartDate);
        sleep(1000);
        clickOnElement(clickOnEndDateCalender);
        sleep(1000);
        clickOnElement(selectEndMonthList);
        clickOnElement(selectEndMonth);
        sleep(1000);
        clickOnElement(selectEndDate);
        sleep(1000);
        clickOnElement(clickOnInvoiceDateCalender);
        sleep(1000);
        clickOnElement(selectInvoiceDate);
        sleep(1000);
        clickOnElement(clickOnReceivedDateCalender);
        sleep(1000);
        clickOnElement(selectReceivedDate);
        sleep(1000);
        /*clickOnElement(clickOnDueDateCalender);
        clickOnElement(selectDueDate);*/
        sleep(1000);
        enterText(clickOnCurrencyDropdown, InvoiceCurrency);
        sleep(1000);
        clickOnElement(selectCurrency);
        enterText(forwardBalance, InvoiceForwardBalance);
        enterText(netTotal, InvoiceNetTotal);
        enterText(taxTotal, InvoiceTaxTotal);
        enterText(invoiceTotal, InvoiceTotal);
        enterText(internalReference, InvoiceInternalNotes);
        enterText(externalReference, InvoiceExternalNotes);
        clickOnElement(finalInvoice);
        clickOnElement(clickOnAttachmentIcon);
        sleep(1000);
        clickOnElement(clickOnAddAttachment);
        sleep(1000);
        UploadFile(selectFileManager, selectFileInFileManager);
        sleep(2000);
        clickOnElement(clickOnUploadAttachment);
        sleep(7000);
        clickOnElement(closeAttachmentModel);
        sleep(3000);
        clickOnElement(clickOnNext);
    }

    public void invoiceConsumption() throws InterruptedException {
        sleep(1000);
        clickOnElement(clickOnAddConsumption);
        sleep(1000);
        int consumptionMeter = page.locator(".k-button-solid.k-rounded-full.k-button-md.k-button-solid-base.k-icon-button").count();
        for (int i = 1; consumptionMeter > 1; i++) {
            sleep(1000);
            page.locator(clickOnRemoveConsumption).click();
            consumptionMeter--;
        }
//        clickOnElement(clickOnAddConsumption);
//        Thread.sleep(1000);
//        clickOnElement(meterSelection);
//        Thread.sleep(1000);
//        clickOnElement(selectMeterNumber);|
        sleep(1000);
        clickOnElement(clickOnRateDescription);
        enterText(searchRateDescription, SearchRateDescription);
        sleep(2000);
        clickOnElement(selectRateDescription);
        clickOnElement(clickOnNextButtonForCharges);
    }

    public void invoiceCharges() throws InterruptedException {
        clickOnElement(addMeter);
        sleep(1000);
        clickOnElement(selectMeterNumber);
        sleep(1000);
        if(isElementPresent(selectMeter)) {
         clickOnElement(selectMeter);
         sleep(2000);
        }
        else {
            clickOnElement(SelectByDefault);
        }
        clickOnElement(saveMeterData);
        sleep(1000);
        if(isElementPresent(clickOnRemoveMeter)) {
            clickOnElement(clickOnRemoveMeter);
        }
        sleep(1000);
        clickOnElement(addTaxCharge);
        sleep(1000);
        clickOnElement(removeTaxCharge);
        sleep(1000);
        clickOnElement(removeTaxCharge);
        sleep(1000);
        clickOnElement(clickOnTaxCharge);
        sleep(1000);
        clickOnElement(clearTaxCharge);
        sleep(2000);
        enterText(searchTaxCharge, InvoiceSearchTaxCharge);
        sleep(1000);
        clickOnElement(selectTaxCharge);
        sleep(1000);
        clickOnElement(clickOnSelectMeter);
        enterText(enterMeter, SearchMeterText);
        sleep(1000);
        if(isElementPresent(selectMeter)) {
            clickOnElement(selectMeter);
            sleep(2000);
        }
        else {
            clickOnElement(SelectByDefault);
        }
        clickOnElement(addTaxRate);
        sleep(1000);
        enterText(enterTaxRate, InvoiceTax);
    }

    public void validationSummary() throws InterruptedException {
        sleep(5000);
        clickOnElement(clickOnNextForValidationReview);
        sleep(10000);
        clickOnElement(ClickToRevalidate);
        sleep(10000);
        clickOnElement(clickOnSaveAndClose);
        sleep(2000);
        //    clickOnElement(clickOnSaveAndContinue); For continuing the creation of invoice

    }

    @Test
    public void deleteInvoice() throws InterruptedException {
        if (page.isHidden(headerSection)) {
            redirectToInvoiceList();
            System.out.println("User Already Logged in.");
        }
        sleep(5000);
        clickOnElement(ClickOnPath);
        clickOnElement(SelectPath);
        sleep(1000);
        clickOnElement(clickOnStartDateCalenderOnListing);
        sleep(2000);
        clickOnElement(clickOnStartMonthCalender);
        sleep(1000);
        clickOnElement(selectStartMonthOnCalender);
        sleep(1000);
        clickOnElement(selectStartDateOnMonth);
        sleep(500);
        clickOnElement(clickOnEndDateCalenderOnListing);
        sleep(1000);
        clickOnElement(clickOnEndMonthCalender);
        clickOnElement(selectEndMonthOnCalender);
        sleep(500);
        clickOnElement(selectEndDateOnMonth);
        sleep(500);
        clickOnElement(ApplyFilterButton);
        sleep(500);

        if (page.isVisible(selectRawInGrid)) {
            clickOnElement(selectRawInGrid);
            sleep(2000);
            clickOnElement(clickOnOptions);
            sleep(500);
            clickOnElement(selectDeleteOption);
            sleep(500);
            enterText(deleteText, login.U_name);
            sleep(2000);
            clickOnElement(SubmitButtonOnDeleteModel);
            System.out.println("Invoice Deleted Successfully.");
        }
    }


}
