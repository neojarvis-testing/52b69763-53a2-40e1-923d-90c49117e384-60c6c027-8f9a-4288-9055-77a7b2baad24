package pages;

/**
 * @Created by Yash
 * @Description Class for performing filter actions on the Rings page, including brand collection and metal type filters.
 */

import com.aventstack.extentreports.Status;

import stepdefinitions.HooksYash;
import uistore.JewelryLocatorYash;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class RingspageYash {

    /**
     * @Description Executes all ring filter actions, including selecting rings,
     *              applying brand filters,
     *              choosing a collection, and setting the metal type filter.
     */

    /**
     * @Description Clicks on the 'Rings' filter, including hovering and interaction
     *              logging.
     */
    public static void clickOnRings() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocatorYash.Rings, 0);
            wb.hoverOverElement(JewelryLocatorYash.Rings);
            wb.clickOnElement(JewelryLocatorYash.Rings);
            LoggerHandler.info("Clicked on  " + wb.getText(JewelryLocatorYash.Rings));
            HooksYash.test.log(Status.PASS, "Clicked on  " + wb.getText(JewelryLocatorYash.Rings));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the 'Brand Collection Filter' element to apply the
     *              desired brand filter.
     * 
     */
    public static void clickOnBrandCollectionFilter() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocatorYash.brandCollectionfilter, 5);
            wb.hoverOverElement(JewelryLocatorYash.brandCollectionfilter);
            wb.clickOnElement(JewelryLocatorYash.brandCollectionfilter);
            LoggerHandler.info("Clicked on brand filter " + wb.getText(JewelryLocatorYash.brandCollectionfilter));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Selects the 'Coco Crush' collection from the brand collection
     *              filter options.
     * 
     */
    public static void clickOnCocoCrush() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocatorYash.cococrush, 5);
            wb.hoverOverElement(JewelryLocatorYash.cococrush);
            wb.clickOnElement(JewelryLocatorYash.cococrush);
            LoggerHandler.info("Clicked on coco crush" + wb.getText(JewelryLocatorYash.cococrush));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the 'Metal Type Filter' to select a specific metal
     *              type.
     * 
     */
    public static void clickOnMetalTypeFilter() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocatorYash.metalTypefilter, 5);
            wb.hoverOverElement(JewelryLocatorYash.metalTypefilter);
            wb.clickOnElement(JewelryLocatorYash.metalTypefilter);
            LoggerHandler.info("Clicked on MetalTypeFilter" + wb.getText(JewelryLocatorYash.metalTypefilter));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Selects 'White Gold' from the metal type filter options.
     * 
     */
    public static void clickOnWhiteGold() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocatorYash.whitegold, 5);
            wb.hoverOverElement(JewelryLocatorYash.whitegold);
            wb.clickOnElement(JewelryLocatorYash.whitegold);
            LoggerHandler.info("Clicked on " + wb.getText(JewelryLocatorYash.whitegold));
            HooksYash.test.log(Status.PASS, "Clicked on " + wb.getText(JewelryLocatorYash.whitegold));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}