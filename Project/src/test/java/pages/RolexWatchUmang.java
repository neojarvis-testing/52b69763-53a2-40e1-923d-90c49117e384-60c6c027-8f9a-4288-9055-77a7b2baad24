package pages;

import com.aventstack.extentreports.Status;

import stepdefinitions.HooksUmang;

/**
 * @Created by Umang Raj
 * @Description Class for handling actions and filters related to Rolex watches.
 */



import uistore.RolexWatchLocatorUmang;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class RolexWatchUmang {

    /**
     * @Description Handles the popup by waiting for its visibility and clicking on it.
     * @param test An ExtentTest instance for reporting.
     */
    public static void popup() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.popup, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.popup);
            LoggerHandler.info("Clicked on "+wb.getText(RolexWatchLocatorUmang.popup)+" At Homepage");
            HooksUmang.test.log(Status.INFO,"Clicked on "+ wb.getText(RolexWatchLocatorUmang.popup)+" At Homepage");
       

           
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Applies the "For Him" filter by waiting for its visibility and clicking on it.
     * @param test An ExtentTest instance for reporting.
     */
    public static void forhimfilter() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.ForHim, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.ForHim);
            LoggerHandler.info("Clicked on "+wb.getText(RolexWatchLocatorUmang.ForHim)+" At Fitler Section");
            HooksUmang.test.log(Status.INFO,"Clicked on "+ wb.getText(RolexWatchLocatorUmang.ForHim)+" At Fitler Section");
         
           
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Filters by brand (e.g., Cartier) by waiting for its visibility and clicking on it.
     * @param test An ExtentTest instance for reporting.
     */
    public static void brandfilter() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.Cartier, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.Cartier);
            LoggerHandler.info("Clicked on "+wb.getText(RolexWatchLocatorUmang.Cartier)+" At Fitler Section");
            HooksUmang.test.log(Status.INFO,"Clicked on "+ wb.getText(RolexWatchLocatorUmang.Cartier)+" At Fitler Section");
          
           
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Applies the dial color filter (e.g., Black) by waiting for elements and clicking on them.
     * @param test An ExtentTest instance for reporting.
     */
    public static void dialColorfilter() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.DialColor, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.DialColor);
            LoggerHandler.info("Clicked on "+wb.getText(RolexWatchLocatorUmang.DialColor)+" At Fitler Section");
            HooksUmang.test.log(Status.INFO,"Clicked on "+ wb.getText(RolexWatchLocatorUmang.DialColor)+" At Fitler Section");
           
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.Black, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.Black);
            LoggerHandler.info("Clicked on "+wb.getText(RolexWatchLocatorUmang.Black)+" At Fitler Section");
            HooksUmang.test.log(Status.INFO,"Clicked on "+ wb.getText(RolexWatchLocatorUmang.Black)+" At Fitler Section");

           
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Selects the first product from the Rolex watches and logs the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void firstproductfrolex() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.firstProduct, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.firstProduct);
            LoggerHandler.info("Clicked on "+wb.getText(RolexWatchLocatorUmang.firstProduct)+" At Product Page");
            HooksUmang.test.log(Status.INFO,"Clicked on "+ wb.getText(RolexWatchLocatorUmang.firstProduct)+" At Product Page");
           
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Adds the Rolex watch to the bag and logs the action.
     * @param test An ExtentTest instance for reporting.
     */
    public static void rolexwatchaddtobag() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(RolexWatchLocatorUmang.addtobag, 5);
            wb.clickOnElement(RolexWatchLocatorUmang.addtobag);
            LoggerHandler.info("Clicked on "+wb.getText(RolexWatchLocatorUmang.addtobag)+" At Product Page");
            HooksUmang.test.log(Status.INFO, "Clicked on "+wb.getText(RolexWatchLocatorUmang.addtobag)+" At Product Page");

        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Executes all Rolex-related actions sequentially, including handling popups, applying filters, and adding to the bag.
     * @param test An ExtentTest instance for reporting.
     */
    public static void allrolexfilter() {
        popup();
        forhimfilter();
        brandfilter();
        dialColorfilter();

    }
    public static void alladdtoCart() {
      firstproductfrolex();
        rolexwatchaddtobag();
    }
}