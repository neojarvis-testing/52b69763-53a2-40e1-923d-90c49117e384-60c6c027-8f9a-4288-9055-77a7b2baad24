package pages;

/**
 * @Created by Yash
 * @Description Class for handling actions on the Brand Homepage, such as interacting with cookies,
 *              hovering on brands, and navigating to the Omega section.
 */

import com.aventstack.extentreports.Status;

import stepdefinitions.Hooks;
import uistore.BrandLocatorsYash;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class BrandHomepageYash {

    /**
     * @Description Executes the complete flow for interacting with the brand
     *              homepage,
     *              including handling cookies, hovering on brands, and clicking on
     *              Omega.
     * 
     */

    /**
     * @Description Handles cookies acceptance by waiting for the element to be
     *              clickable and interacting with it.
     * 
     */
    public static void cookiesclick() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocatorsYash.cookies, 5);
            wb.clickOnElement(BrandLocatorsYash.cookies);
            LoggerHandler.info("Accept all the cookies " + wb.getText(BrandLocatorsYash.cookies));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Hovers over the "Brands" element and logs the interaction.
     * 
     */
    public static void hoverBrand() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocatorsYash.brands, 5);
            wb.hoverOverElement(BrandLocatorsYash.brands);
            LoggerHandler.info("Clicked On " + wb.getText(BrandLocatorsYash.brands));
            Hooks.test.log(Status.INFO, "Clicked on " + wb.getText(BrandLocatorsYash.brands));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Navigates to the Omega section by hovering over and clicking on
     *              the Omega element.
     * 
     */
    public static void omegaClick() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocatorsYash.omega, 5);
            wb.hoverOverElement(BrandLocatorsYash.omega);
            wb.clickOnElement(BrandLocatorsYash.omega);
            LoggerHandler.info("Clicked on Omega" + wb.getText(BrandLocatorsYash.omega));
            Hooks.test.log(Status.INFO, "Clicked on Omega" + wb.getText(BrandLocatorsYash.omega));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}