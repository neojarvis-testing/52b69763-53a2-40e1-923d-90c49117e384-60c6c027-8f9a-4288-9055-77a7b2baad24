package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import stepdefinition.Hooks;
import uistore.HomeLocators_Siva;
import utils.Base;
import utils.ExcelReader;
import utils.GenerateReport;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePage_Siva extends Base {
    private WebDriverHelper wb;

    public HomePage_Siva(WebDriverHelper webDriverHelper) {
        this.wb = webDriverHelper;
    }

    /**
     * @Created by Sivasankar M
     * @Description Verifies all footer links by checking their redirection URLs against expected values,
     * logs results using Extent Reports, and captures additional LoggerHandler logs.
     * @param test ExtentTest instance to log report details.
     */
    public void footerVerification(ExtentTest test) {
        By[] footerLinks = {
            HomeLocators_Siva.contactUs,
            HomeLocators_Siva.luxuryService,
            HomeLocators_Siva.storeFinder,
            HomeLocators_Siva.deliveryInfo,
            HomeLocators_Siva.clickCollect,
            HomeLocators_Siva.returnPolicy,
            HomeLocators_Siva.affirmFinance,
            HomeLocators_Siva.feedBack
        };

        String[] verificationLinks = {
            ExcelReader.readCellValue("Sheet1", "23", "value"),
            ExcelReader.readCellValue("Sheet1", "24", "value"),
            ExcelReader.readCellValue("Sheet1", "25", "value"),
            ExcelReader.readCellValue("Sheet1", "26", "value"),
            ExcelReader.readCellValue("Sheet1", "27", "value"),
            ExcelReader.readCellValue("Sheet1", "28", "value"),
            ExcelReader.readCellValue("Sheet1", "29", "value"),
            ExcelReader.readCellValue("Sheet1", "30", "value")
        };

        LoggerHandler.info("Starting footer verification for all links.");
        scrollToFooter();
        for (int i = 0; i < footerLinks.length; i++) {
            validateLink(footerLinks[i], verificationLinks[i], Hooks.extentTest);
        }
        LoggerHandler.info("Footer verification completed.");
    }

    /**
     * @Created by Sivasankar M
     * @Description Scrolls down to the footer section of the webpage and logs the action in Extent Reports and LoggerHandler.
     */
    public void scrollToFooter() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,6000);");
            Hooks.extentTest.log(Status.INFO, "Scrolled to the footer section.");
            LoggerHandler.info("Successfully scrolled to the footer section.");
        } catch (Exception e) {
            String message = "Failed to scroll to footer: " + e.getMessage();
            Hooks.extentTest.log(Status.FAIL, message);
            LoggerHandler.error(message);
        }
    }

    /**
     * @Created by Sivasankar M
     * @Description Validates the redirection of a footer link by checking its current URL against the expected URL,
     * and logs the results in Extent Reports and LoggerHandler.
     * @param linkLocator Locator for the footer link.
     * @param expectedUrl Expected URL for validation.
     * @param test ExtentTest instance to log report details.
     */
    private void validateLink(By linkLocator, String expectedUrl, ExtentTest test) {
        try {
            wb.clickOnElement(linkLocator);
            LoggerHandler.info("Clicked on footer link: " + linkLocator);

            String currentUrl = driver.getCurrentUrl();
            Screenshot.captureScreenshot(currentUrl);
            GenerateReport.addScreenshotToReport(expectedUrl, test, "Link verification screenshot");
            LoggerHandler.info("Current URL: " + currentUrl + " | Expected URL: " + expectedUrl);

            if (currentUrl.contains(expectedUrl)) {
                Assert.assertTrue(true);
                test.log(Status.PASS, "Footer link redirection verified successfully for: " + expectedUrl);
                LoggerHandler.info("Footer link redirection verified successfully for: " + expectedUrl);
            } else {
                Assert.fail();
                test.log(Status.FAIL, "Footer link redirection failed for: " + expectedUrl);
                LoggerHandler.error("Footer link redirection failed for: " + expectedUrl);
            }

            driver.navigate().back();
            LoggerHandler.info("Navigated back to the previous page.");
            scrollToFooter();
        } catch (Exception e) {
            String message = "Error processing link: " + linkLocator + ". Exception: " + e.getMessage();
            test.log(Status.FAIL, message);
            LoggerHandler.error(message);
        } catch (AssertionError e) {
            String message = "Assertion failed for link: " + expectedUrl + ". Error: " + e.getMessage();
            test.log(Status.FAIL, message);
            LoggerHandler.error(message);
        }
    }

    /**
     * @Created by Sivasankar M
     * @Description Searches for a keyword in the search bar, submits the search, and logs the action in Extent Reports and LoggerHandler.
     * @param key The keyword to search for.
     */
    public void searchBarAction(String key) {
        try {
            wb.clickOnElement(HomeLocators_Siva.searchBar);
            LoggerHandler.info("Clicked on the search bar.");

            wb.sendKeys(HomeLocators_Siva.searchBar, key);
            LoggerHandler.info("Entered keyword in search bar: " + key);

            wb.enterAction(HomeLocators_Siva.searchBar);
            LoggerHandler.info("Triggered search action for keyword: " + key);
            Hooks.extentTest.log(Status.INFO, "Search action triggered for keyword: " + key);
        } catch (Exception e) {
            String message = "Search action failed for keyword: " + key + ". Exception: " + e.getMessage();
            Hooks.extentTest.log(Status.FAIL, message);
            LoggerHandler.error(message);
        }
    }
}