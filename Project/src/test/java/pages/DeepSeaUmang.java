package pages;

import com.aventstack.extentreports.Status;

/**
 * @Created by Umang Raj
 * @Description Class to perform and verify various actions related to DeepSea watches.
 */


import stepdefinitions.Hooks;
import uistore.DeepSeaLocatorUmang;
import utils.Assertion;

import utils.ExcelReader;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class DeepSeaUmang {

    /**
     * @Description Clicks on the 'Rolex Watches' element after waiting for it to be visible.
     * @param  An Extent instance for logging and reporting.
     */
    public static void clickOnRolex() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(DeepSeaLocatorUmang.rolexwatches, 5);
            wb.clickOnElement(DeepSeaLocatorUmang.rolexwatches);
            LoggerHandler.info("Click On "+ wb.getText(DeepSeaLocatorUmang.rolexwatches)+" At Deepsea Page");
             Hooks.test.log(Status.INFO,"Click On "+ wb.getText(DeepSeaLocatorUmang.rolexwatches)+" At Deepsea Page");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the 'Discover Rolex' element after waiting for it to be visible.
     * @param  An Extent instance for logging and reporting.
     */
    public static void clickOnDiscoverRolex() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(DeepSeaLocatorUmang.discoverrolex, 5);
            wb.clickOnElement(DeepSeaLocatorUmang.rolexwatches);
            LoggerHandler.info("Click On "+ wb.getText(DeepSeaLocatorUmang.discoverrolex)+" At Rolex Watches Page");
            Hooks.test.log(Status.INFO,"Click On "+ wb.getText(DeepSeaLocatorUmang.discoverrolex)+" At Rolex Watches Page");

           
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the 'New Watches' element after waiting for it to be visible.
     * @param  An Extent instance for logging and reporting.
     */
    public static void clickOnNewWatches() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(DeepSeaLocatorUmang.newwatches, 5);
            wb.clickOnElement(DeepSeaLocatorUmang.newwatches);
            LoggerHandler.info("Click On "+ wb.getText(DeepSeaLocatorUmang.newwatches)+" At Discover Rolex Page");
            Hooks.test.log(Status.INFO,"Click On "+ wb.getText(DeepSeaLocatorUmang.newwatches)+" At Discover Rolex Page");
         
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the 'Watchmaking' element, captures a screenshot, and logs information.
     * @param  An Extent instance for logging and reporting.
     */
    public static void clickOnWatchmaking() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(DeepSeaLocatorUmang.watchmaking, 5);
            wb.clickOnElement(DeepSeaLocatorUmang.watchmaking);
            LoggerHandler.info("Click On "+wb.getText(DeepSeaLocatorUmang.watchmaking)+" At New Watches Page");
            Hooks.test.log(Status.INFO, "Click On "+wb.getText(DeepSeaLocatorUmang.watchmaking)+" At New Watches Page");

            Screenshot.captureScreenshot(wb.getText(DeepSeaLocatorUmang.watchmaking));
          
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the text of the 'Rolex' element against the expected value.
     * @param  An Extent instance for logging and reporting.
     */
    public static void verifyRolex() {
        WebDriverHelper wb = new WebDriverHelper();
        Assertion.assertionVerifyByEqual(wb.getText(DeepSeaLocatorUmang.verifyrolex),
                ExcelReader.readCellValue("Sheet1", "4", "value"), Hooks.test);
    }

    /**
     * @Description Executes all DeepSea-related actions sequentially: clicking on Rolex options,
     *              watch categories, and verifying Rolex details.
     * @param  An Extent instance for logging and reporting.
     */
    public static void allDeepseaActions() {
        clickOnRolex();
        clickOnDiscoverRolex();

    }
    public static void allNewWatchesActions() {
       
        clickOnNewWatches();
        clickOnWatchmaking();
        verifyRolex();
    }
}