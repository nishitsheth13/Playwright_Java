package basicTemplate.configs;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class browserSelector extends baseClass {
    public static String brows = loadProps.getProperty("Browser");
    public static String URL = loadProps.getProperty("URL");
    public static boolean Recording = Boolean.parseBoolean(loadProps.getProperty("RecordingMode"));
    public static boolean Screenshot = Boolean.parseBoolean(loadProps.getProperty("ScreenshotsMode"));
    public static Playwright playwright;
    public static Browser browser;
    public static BrowserContext context;

    public static void setUp() throws Exception {
        if (brows.equalsIgnoreCase("chrome")) {
            Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setArgs(Collections.singletonList("--start-maximized"))
                    .setHeadless(false));

            Path videoDir = Paths.get(System.getProperty("user.dir") +"/Recordings/");
            if (!Files.exists(videoDir)) {
                Files.createDirectories(videoDir);
            }

            if (Recording) {
                // Configure browser context to ignore HTTPS errors
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true)
                        .setRecordVideoDir(videoDir)
                        .setRecordVideoSize(1280, 720);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();
            } else {
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();

            }
            page.navigate(URL);
        } else if (brows.equalsIgnoreCase("edge")) {
            Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setChannel("msedge")
                    .setArgs(Collections.singletonList("--start-maximized"))
                    .setHeadless(false));
            Path videoDir = Paths.get(System.getProperty("user.dir") +"/Recordings/");

            if (Recording) {
                // Configure browser context to ignore HTTPS errors
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true)
                        .setRecordVideoDir(videoDir)
                        .setRecordVideoSize(1280, 720);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();
            } else {
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();

            }
            page.navigate(URL);

        } else if (brows.equalsIgnoreCase("firefox")) {
            Playwright playwright = Playwright.create();
            Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions()
                    .setArgs(Collections.singletonList("--start-maximized"))
                    .setHeadless(false));
            Path videoDir = Paths.get(System.getProperty("user.dir") +"/Recordings/");

            if (Recording) {
                // Configure browser context to ignore HTTPS errors
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true)
                        .setRecordVideoDir(videoDir)
                        .setRecordVideoSize(1280, 720);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();
            } else {
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();

            }
            page.navigate(URL);
        } else {
            System.out.println("This Browser is not found in your system.");
        }

    }


    public static void tearDown() throws Exception {
        if (page != null) {
            page.close();
        }
        if (context != null) {
            context.close();
        }
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }


    //For Parallel Execution using Testng XML

    public static void LaunchBrowser(String brows) throws Exception {
        if (brows.equalsIgnoreCase("chrome")) {
            Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setArgs(Collections.singletonList("--start-maximized"))
                    .setHeadless(false));

            Path videoDir = Paths.get(System.getProperty("user.dir") +"/Recordings/");
            if (!Files.exists(videoDir)) {
                Files.createDirectories(videoDir);
            }
            if (Recording) {
                // Configure browser context to ignore HTTPS errors
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true)
                        .setRecordVideoDir(videoDir)
                        .setRecordVideoSize(1280, 720);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();
            } else {
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();

            }
            page.navigate(URL);


        } else if (brows.equalsIgnoreCase("edge")) {
            Playwright playwright = Playwright.create();
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setChannel("msedge")
                    .setArgs(Collections.singletonList("--start-maximized"))
                    .setHeadless(false));
            Path videoDir = Paths.get(System.getProperty("user.dir") +"/Recordings/");

            if (Recording) {
                // Configure browser context to ignore HTTPS errors
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true)
                        .setRecordVideoDir(videoDir)
                        .setRecordVideoSize(1280, 720);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();
            } else {
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();

            }
            page.navigate(URL);

        } else if (brows.equalsIgnoreCase("firefox")) {
            Playwright playwright = Playwright.create();
            Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions()
                    .setArgs(Collections.singletonList("--start-maximized"))
                    .setHeadless(false));
            Path videoDir = Paths.get(System.getProperty("user.dir") +"/Recordings/");

            if (Recording) {
                // Configure browser context to ignore HTTPS errors
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true)
                        .setRecordVideoDir(videoDir)
                        .setRecordVideoSize(1280, 720);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();
            } else {
                Browser.NewContextOptions contextOptions = new Browser.NewContextOptions()
                        .setViewportSize(null)
                        .setIgnoreHTTPSErrors(true);
                BrowserContext context = browser.newContext(contextOptions);
                context.setDefaultTimeout(45000);
                context.setDefaultNavigationTimeout(45000);
                page = context.newPage();

            }
            page.navigate(URL);

        } else {
            System.out.println("This Browser is not found in your system.");
        }

    }

    public static void closeBrowser() throws Exception {
        if (page != null) {

            page.close();
        }
        if (context != null) {
            context.close();
        }
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }


}
