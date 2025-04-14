package pages;

/**
 * @Created by Yash
 * @Description Class for performing actions related to the ring product page, such as selecting the first product.
 */

import com.aventstack.extentreports.Status;

import stepdefinitions.HooksYash;
import uistore.JewelryLocatorYash;
import utils.GenerateReport;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class Ringproductpage {

    /**
     * @Description Selects the first product by hovering over it, clicking on it,
     *              and logging the interaction.
     * 
     */
    public static void firstProduct() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(JewelryLocatorYash.firstProduct, 5);
            wb.hoverOverElement(JewelryLocatorYash.firstProduct);
            wb.clickOnElement(JewelryLocatorYash.firstProduct);
            LoggerHandler.info("Clicked on product in rings product " + wb.getText(JewelryLocatorYash.firstProduct));
            HooksYash.test.log(Status.PASS,
                    "Clicked on product in rings product " + wb.getText(JewelryLocatorYash.firstProduct));
            GenerateReport.addScreenshotToReport("First Product ", HooksYash.test,
                    "The product is clicked successfully.");

        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}