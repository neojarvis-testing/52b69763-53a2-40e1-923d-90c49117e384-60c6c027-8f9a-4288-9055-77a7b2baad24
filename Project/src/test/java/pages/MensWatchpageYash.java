package pages;

/**
 * @Created by Yash
 * @Description Class for handling actions related to Men's Watches, including interacting with popups and selecting watches.
 */

import com.aventstack.extentreports.Status;

import stepdefinitions.HooksYash;
import uistore.BrandLocatorsYash;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class MensWatchpageYash {

    /**
     * @Description Executes the flow for Men's Watches by handling popups and
     *              navigating to the watches section.
     * 
     */
    // public static void mensWatchClick() {
    // popUp();
    // mensWatch();
    // }

    /**
     * @Description Handles the popup by clicking on the popup element if it is
     *              present.
     * 
     */
    public static void popUp() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.clickOnElement(BrandLocatorsYash.popup);
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Navigates to the Men's Watches section by hovering and clicking
     *              on the respective element.
     * 
     */
    public static void mensWatch() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocatorsYash.mens_watches, 5);
            wb.hoverOverElement(BrandLocatorsYash.mens_watches);
            wb.clickOnElement(BrandLocatorsYash.mens_watches);
            LoggerHandler.info(wb.getText(BrandLocatorsYash.mens_watches));
            HooksYash.test.log(Status.PASS, "Clicked on Mens Watches" + wb.getText(BrandLocatorsYash.mens_watches));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}