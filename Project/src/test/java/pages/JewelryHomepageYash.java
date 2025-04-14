package pages;

/**
 * @Created by Yash
 * @Description Class for handling actions on the Jewelry Homepage, such as accepting cookies,
 *              interacting with jewelry elements, and navigating through popups.
 */

import com.aventstack.extentreports.Status;

import stepdefinitions.Hooks;
import uistore.JewelryLocatorYash;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class JewelryHomepageYash {

    /**
     * @Description Executes the complete flow of actions on the jewelry homepage,
     *              including cookies acceptance,
     *              hovering on jewelry, clicking on "Chanel", and handling popups.
     * 
     */
    // public static void HomepageJwelryClick() {
    // clickOnCookies(test);
    // hoverOnJewelry(test);
    // clickOnchanel(test);
    // clickOnPopUp(test);
    // }

    /**
     * @Description Handles the acceptance of cookies by hovering over and clicking
     *              the cookies element.
     * 
     */
    public static void clickOnCookies() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(JewelryLocatorYash.cookies);
            wb.clickOnElement(JewelryLocatorYash.cookies);
            LoggerHandler.info(wb.getText(JewelryLocatorYash.cookies));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Hovers over the jewelry element and logs the interaction.
     * 
     */
    public static void hoverOnJewelry() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocatorYash.jwelery, 5);
            wb.hoverOverElement(JewelryLocatorYash.jwelery);
            LoggerHandler.info(wb.getText(JewelryLocatorYash.jwelery));
            Hooks.test.log(Status.INFO, "CLicked on " + wb.getText(JewelryLocatorYash.jwelery));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the "Chanel" element on the jewelry homepage and logs
     *              the action.
     * 
     */
    public static void clickOnchanel() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.clickOnElement(JewelryLocatorYash.chanel);
            LoggerHandler.info(wb.getText(JewelryLocatorYash.chanel));
            Hooks.test.log(Status.PASS, "Clicked On Channel " + wb.getText(JewelryLocatorYash.chanel));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Handles the popup on the jewelry homepage by hovering and
     *              clicking on it.
     * 
     */
    public static void clickOnPopUp() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocatorYash.popup, 10);
            wb.hoverOverElement(JewelryLocatorYash.popup);
            wb.clickOnElement(JewelryLocatorYash.popup);
            LoggerHandler.info(wb.getText(JewelryLocatorYash.popup));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}