package basicTemplate.pages;

import basicTemplate.configs.browserSelector;
import basicTemplate.configs.utils;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.testng.annotations.*;
import basicTemplate.configs.listener;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class treeConfigurations extends utils {




    @AfterTest
    public void closeBrowser() throws Exception {
        browserSelector.closeBrowser();
    }


    @BeforeTest
    @Parameters("Browser")
    public void launchBrowser(@Optional("chrome") String Browser) throws Exception {
        browserSelector.LaunchBrowser(Browser);
        login.login();
    }

@Test
    public void configTree() throws InterruptedException {
    try {
        Locator setupmenu = page.locator("a").filter(new Locator.FilterOptions().setHasText("Setup"));
        Locator configureTreeLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Configure Tree"));
        Locator addRootCompanyButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Root Company"));
        Locator companyNameLabel = page.getByLabel("Company Name");
        Locator countryDropdown = page.locator("xpath=/html/body/div[1]/div[2]/div/form/div/div[1]/div/div[2]/div/div[2]/div[2]/div[7]/div/span/button");
        Locator unitedKingdomOption = page.getByText("United Kingdom");
        Locator accrualMethodsLink = page.getByText("Accrual Methods");
        Locator Path = page.getByText("Click and choose the correct");
        Locator transferAllToButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Transfer All To"));
        Locator fuelTypesLink = page.getByText("Fuel Types");
        Locator addFuelTypeButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Fuel Type"));
        Locator openButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Open"));//AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Open")
        Locator electricityOption = page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("Electricity"));
        Locator textBox = page.getByRole(AriaRole.TEXTBOX);
        Locator dataTableButton = page.getByLabel("Data table").getByRole(AriaRole.BUTTON).nth(2);
        Locator generalTagsLink = page.getByText("General Tags Accrual Methods");
        Locator saveAndCloseButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save and Close"));
        Locator addGroupButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Group"));
        Locator groupNameField = page.locator("#uxName");
        Locator groupCountryDropdown = page.locator("#cboCountry");
        Locator addGroupButton2 = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add"));
        Locator addCompanyButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Company"));
        Locator companyCountryField = page.getByLabel("Country");
        Locator indiaOption = page.getByRole(AriaRole.OPTION, new Page.GetByRoleOptions().setName("India"));
        Locator calanderOption = page.locator("xpath=/html/body/div[1]/div[2]/div/form/div/div[1]/div/div[2]/div/div[2]/div[1]/div[4]/div/span/button");
        Locator augustButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("August"));
        Locator goToPreviousPeriodButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Go to the previous period"));
        Locator janButton = page.getByText("Jan");
        Locator firstJanButton = page.getByLabel("Sunday, 1 January").getByText("1");
        Locator tagsTab = page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Tags")).locator("span");
        Locator taxRatesTab = page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Tax Rates")).locator("span");
        Locator suppliersTab = page.getByRole(AriaRole.TAB, new Page.GetByRoleOptions().setName("Suppliers")).locator("span");
        Locator mriIndiaLink = page.locator("#ctl00_Body_T_T").getByText("MRI India");
        Locator editButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Edit"));
        Locator globalMRITreeItem = page.getByRole(AriaRole.TREEITEM, new Page.GetByRoleOptions().setName(" Global MRI")).locator("svg");
        Locator apacItem = page.getByText("APAC");
        Locator AddSite = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add"));
        Locator ContractLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Contract"));
        Locator addSiteButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Site"));
        Locator siteNameField = page.locator("#txtSName");
        Locator siteCountryDropdown = page.locator("#cboSCountryID");
        Locator save = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add"));
        Locator benchmarkingLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Benchmarking"));
        Locator activePeriodsLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Active Periods"));
        Locator etCurveLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("ET Curve"));
        Locator notesLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Notes"));
        Locator customFieldsLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Custom Fields"));
        Locator saveButton = page.locator("#ctl00_Body_uxSave_input");
        Locator generalLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("General"));
        Locator siteCodeField = page.locator("#txtSSiteCode");
        Locator addMeterButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add Meter"));
        Locator meterNameField = page.locator("#txtMName");
        Locator meterTypeDropdown = page.locator("#uxMeterTypeID");
        Locator meterReadFrequencyDropdown = page.locator("#cboMMeterReadFrequencyID");
        Locator meterModelDropdown = page.locator("#cboMMeterModelID");
        Locator meterCodeField = page.locator("#txtMMeterCode");
        Locator cumulativeReadingsCheckbox = page.locator("#chkMCumulativeReadings");
        Locator serialNumberField = page.locator("#txtMSerialNumber");
        Locator meterNumberField = page.locator("#txtMMeterNumber");
        Locator meterNumberPrefixField = page.locator("#uxMeterNumberPrefix");
        Locator dataImportCodeField = page.locator("#txtMDataImportCode");
        Locator contractLink = page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Contract"));
        Locator billingCheckbox = page.getByLabel("Billing");

        page.navigate("https://uksestdevtest02.ukest.lan/eSight/cmstartpage.aspx");
        setupmenu.click();
        configureTreeLink.click();
        Thread.sleep(3000);
        removeConfig();
        page.reload();
        addRootCompanyButton.click();
        Thread.sleep(3000);
        companyNameLabel.click();
        Thread.sleep(3000);
        companyNameLabel.fill("Global MRI");
        countryDropdown.click();
        unitedKingdomOption.click();
        accrualMethodsLink.click();
        transferAllToButton.click();
        fuelTypesLink.click();
        Thread.sleep(2000);
        addFuelTypeButton.click();
        Thread.sleep(2000);
        openButton.click();
        Thread.sleep(2000);
        electricityOption.click();
        Thread.sleep(2000);
        textBox.click();
        textBox.fill("Electricity");
        Thread.sleep(2000);
        dataTableButton.click();
        Thread.sleep(5000);
        saveAndCloseButton.click();
        Thread.sleep(5000);
        addGroupButton.click();
        groupNameField.click();
        groupNameField.fill("APAC");
        groupCountryDropdown.selectOption("100");
        addGroupButton2.click();
        addCompanyButton.click();
        companyNameLabel.click();
        companyNameLabel.fill("MRI India");
        companyCountryField.click();
        companyCountryField.fill("india");
        indiaOption.click();
        calanderOption.click();
        //calender
        augustButton.click();
        for (int i = 0; i < 7; i++) {
            goToPreviousPeriodButton.click();
        }
        janButton.click();
        firstJanButton.click();
        tagsTab.click();
        accrualMethodsLink.click();
        transferAllToButton.click();
        taxRatesTab.click();
        fuelTypesLink.click();
        suppliersTab.click();
        saveAndCloseButton.click();
        mriIndiaLink.click();
        editButton.click();
        //path
        Path.click();
        globalMRITreeItem.click();
        apacItem.click();
        saveAndCloseButton.click();
        mriIndiaLink.click();
        addSiteButton.click();
        siteNameField.click();
        siteNameField.fill("Baroda");
        siteCountryDropdown.selectOption("100");
        benchmarkingLink.click();
        activePeriodsLink.click();
        etCurveLink.click();
        notesLink.click();
        customFieldsLink.click();
        saveButton.click();
        saveButton.click();
        generalLink.click();
        siteCodeField.click();
        siteCodeField.fill("Baroda1");
        save.click();
        addMeterButton.click();
        meterNameField.click();
        meterNameField.fill("Electricity Meter");
        meterTypeDropdown.selectOption("9");
        meterReadFrequencyDropdown.selectOption("9");
        meterModelDropdown.selectOption("15");
        meterCodeField.click();
        meterCodeField.fill("Baroda1");
        cumulativeReadingsCheckbox.check();
        serialNumberField.click();
        serialNumberField.fill("Baroda");
        serialNumberField.press("ArrowLeft");
        serialNumberField.press("ArrowLeft");
        serialNumberField.press("ArrowLeft");
        serialNumberField.press("ArrowLeft");
        serialNumberField.press("ArrowRight");
        serialNumberField.fill("Baroda1");
        meterNumberField.click();
        meterNumberField.fill("BrdEleM01");
        meterNumberPrefixField.click();
        meterNumberPrefixField.fill("10241542100");
        dataImportCodeField.click();
        dataImportCodeField.fill("IMCBrd01");
        contractLink.click();
        billingCheckbox.check();
        generalLink.click();
        save.click();
    } catch (Exception e) {
        e.printStackTrace();

    }

    }

    public void removeConfig() throws InterruptedException {

        if(page.getByText("Global MRI").isVisible()){
            page.getByText("Global MRI").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Delete")).click();
            page.locator("#uxDeleteReason").click();
            page.locator("#uxDeleteReason").fill("remove tree config");
            page.locator("#uxCurrentUserName").click();
            page.locator("#uxCurrentUserName").fill("admin");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Confirm Delete")).click();
            Thread.sleep(5000);
        }

    }





}
