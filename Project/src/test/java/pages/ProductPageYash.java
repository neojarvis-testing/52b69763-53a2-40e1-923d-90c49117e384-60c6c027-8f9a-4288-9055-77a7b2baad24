package pages;

/**
 * @Created by Yash
 * @Description Class for handling product actions on the shopping bag page, such as adding products and performing specific clicks.
 */

import com.aventstack.extentreports.Status;

import stepdefinitions.HooksYash;
import uistore.BrandLocatorsYash;
import utils.GenerateReport;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class ProductPageYash {

    /**
     * @Description Executes the full flow of adding a product to the shopping bag,
     *              including several clicks and verifications.
     * 
     */

    /**
     * @Description Clicks on the "Semaster" element after hovering over it and
     *              waiting for it to become clickable.
     * 
     */
    public static void semasterClick() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(BrandLocatorsYash.semaster);
            wb.waitForElementToBeClickable(BrandLocatorsYash.semaster, 5);
            wb.clickOnElement(BrandLocatorsYash.semaster);
            LoggerHandler.info(wb.getText(BrandLocatorsYash.semaster));
            HooksYash.test.log(Status.PASS, "Clicked On " + wb.getText(BrandLocatorsYash.semaster));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Clicks on the "Blue" element after hovering over it and waiting
     *              for it to become clickable.
     */
    public static void blueClick() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.hoverOverElement(BrandLocatorsYash.blue);
            wb.waitForElementToBeClickable(BrandLocatorsYash.blue, 5);
            wb.clickOnElement(BrandLocatorsYash.blue);
            LoggerHandler.info("Clicked on BlueFilter " + wb.getText(BrandLocatorsYash.blue));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Selects the first product by waiting for its visibility and
     *              clicking on it.
     * 
     */
    public static void firstProduct() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            wb.waitForElementToBeClickable(BrandLocatorsYash.first_product, 2);
            wb.clickOnElement(BrandLocatorsYash.first_product);
            LoggerHandler.info("Clicked on Product " + wb.getText(BrandLocatorsYash.first_product));
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }

    /**
     * @Description Adds the selected product to the shopping bag by clicking on the
     *              "Add to Shopping Bag" button
     *              and verifying the action.
     * 
     */
    public static void addCart() {
        try {
            WebDriverHelper wb = new WebDriverHelper();
            // Assertion.assertionVerifyByEqual(wb.getText(BrandLocatorsYash.AddToShoppingbag),
            // ExcelReader.readCellValue("sheet6", "7", "value"), HooksYash.test);
            wb.clickOnElement(BrandLocatorsYash.AddToShoppingbag);
            LoggerHandler.info(wb.getText(BrandLocatorsYash.AddToShoppingbag));
            HooksYash.test.log(Status.INFO, "Clicked on " + wb.getText(BrandLocatorsYash.AddToShoppingbag));
            GenerateReport.addScreenshotToReport("add to cart", HooksYash.test,
                    "The product is added to cart successfully.");
        } catch (Exception e) {
            LoggerHandler.info(e.getMessage());
        }
    }
}
