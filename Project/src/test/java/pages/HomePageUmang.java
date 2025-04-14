package pages;

import com.aventstack.extentreports.Status;

/**
 * @Created by Umang Raj
 * @Description Class for performing various homepage actions and verifications.
 */


import stepdefinitions.Hooks;
import uistore.HomePageLocatorUmang;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageUmang {

    /**
     * 
     * @Description Verifies the page title against the expected value.
     * @param  An Extent instance for reporting.
     */
    public static void verifyTitle() {
        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("Sheet1", "1", "value"), Hooks.test);
    }

    /**
     * @Description Accepts cookies by clicking on the cookies element and logs the action.
     * @param  An Extent instance for reporting.
     */
    public static void acceptcookies() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.clickOnElement(HomePageLocatorUmang.cookies);
            LoggerHandler.info( "Clicked on "+ wb.getText(HomePageLocatorUmang.cookies)+ " At Homepage");
            Hooks.test.log(Status.INFO, "Clicked on "+ wb.getText(HomePageLocatorUmang.cookies)+ "  At Homepage");
       
            
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Hovers over the 'Watches' element and logs the action.
     * @param  An Extent instance for reporting.
     */
    public static void hoverOnwatches() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(HomePageLocatorUmang.watches, 5);
            wb.hoverOverElement(HomePageLocatorUmang.watches);
            LoggerHandler.info("Hover on "+wb.getText(HomePageLocatorUmang.watches)+" At Homepage");
            Hooks.test.log(Status.INFO, "Hover on "+wb.getText(HomePageLocatorUmang.watches)+" At Homepage");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the title of the 'Best Sellers' page against the expected value.
     * @param  An Extent instance for reporting.
     */
    public static void verifyBestSellers() {
        WebDriverHelper wb = new WebDriverHelper();

        Hooks.test.log(Status.INFO, wb.getText(HomePageLocatorUmang.Bestsellers));
        

        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("Sheet1", "2", "value"), Hooks.test);
        
    }

    /**
     * @Description Clicks on the 'Best Sellers' element and logs the action.
     * @param  An Extent instance for reporting.
     */
    public static void clickOnBestSeller() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(HomePageLocatorUmang.Bestsellers, 5);
            wb.clickOnElement(HomePageLocatorUmang.Bestsellers);
            LoggerHandler.info("Click On "+wb.getText(HomePageLocatorUmang.rolex)+ " At Navigation bar");
            Hooks.test.log(Status.INFO, "Click On "+wb.getText(HomePageLocatorUmang.rolex)+" At Navigation bar");

            
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Executes all homepage actions sequentially, including verifying the title, accepting cookies, 
     *              hovering over watches, verifying best sellers, and clicking on the best seller.
     * @param  An Extent instance for reporting.
     */
    public static void allHomePageActions() {
        verifyTitle();
        acceptcookies();
        hoverOnwatches();
        verifyBestSellers();
        clickOnBestSeller();
    }

    /**
     * @Description Hovers over the 'Rolex' element and logs the action.
     * @param  An Extent instance for reporting.
     */
    public static void hoveronRolex() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(HomePageLocatorUmang.rolex);
            LoggerHandler.info("Hover On "+wb.getText(HomePageLocatorUmang.rolex)+" At Navigation bar");
            Hooks.test.log(Status.INFO, "Hover On "+wb.getText(HomePageLocatorUmang.rolex)+" At Navigation bar");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the 'DeepSea' element and logs the action.
     * @param  An Extent instance for reporting.
     */
    public static void clickOnDeepSea() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeVisible(HomePageLocatorUmang.deepsea, 5);
            wb.clickOnElement(HomePageLocatorUmang.deepsea);
            LoggerHandler.info("Clicked On "+ wb.getText(HomePageLocatorUmang.deepsea)+" At Navigation bar");
            Hooks.test.log(Status.INFO,"Clicked On "+ wb.getText(HomePageLocatorUmang.deepsea)+" At Navigation bar");

        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Verifies the title of the 'DeepSea' page against the expected value.
     * @param  An Extent instance for reporting.
     */
    public static void verifyDeepSea() {
        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("Sheet1", "3", "value"), Hooks.test);
    }

    /**
     * @Description Executes all actions related to DeepSea, including accepting cookies, hovering on Rolex, 
     *              clicking on DeepSea, and verifying the DeepSea page.
     * @param   Extent instance for reporting.
     */
    public static void allhomedeepseaAction() {
        acceptcookies();
        hoveronRolex();
        clickOnDeepSea();
        verifyDeepSea();
    }
}