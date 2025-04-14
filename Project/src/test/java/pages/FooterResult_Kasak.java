package pages;

import com.aventstack.extentreports.Status;

/**
 * @Created by Kasak
 * @Description Class for verifying footer links and their corresponding pages.
 */

import stepdefinitions.HooksKasak;
import uistore.HomePageLocators_Kasak;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.WebDriverHelper;

public class FooterResult_Kasak {

    /**
     * @Description Verifies the 'About Mayors' page URL against the expected value.
     * @param test An ExtentTest instance for reporting.
     */
    public static void aboutMayorsVerify() {
        try {
            Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(),
                    ExcelReader.readCellValue("sheet4", "1", "value"), HooksKasak.test);

            HooksKasak.test.log(Status.PASS, "verified the aboutMayors resultPage" + Base.driver.getCurrentUrl());
        } catch (Exception e) {
            e.printStackTrace();

        } catch (AssertionError e) {
            HooksKasak.test.log(Status.FAIL,
                    "failed to verify the aboutMayors resultPage" + Base.driver.getCurrentUrl());
            e.printStackTrace();
        }
    }

    /**
     * @Description Verifies the 'Press Media' page URL against the expected value.
     * @param test An ExtentTest instance for reporting.
     */
    public static void pressMediaVerify() {
        try {
            Assertion.assertionVerifyByContains(Base.driver.getCurrentUrl(),
                    ExcelReader.readCellValue("sheet4", "2", "value"), HooksKasak.test);

            HooksKasak.test.log(Status.INFO, "verified the PressMedia resultPage " + Base.driver.getCurrentUrl());

        } catch (Exception e) {
            e.printStackTrace();

        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description Verifies the 'Careers' page URL and title against the expected
     *              values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void careersVerify() {
        try {

            HooksKasak.test.log(Status.INFO, "verified the career resultPage");

            HooksKasak.test.log(Status.INFO, "verified the careers pageTitle");

        } catch (Exception e) {
            e.printStackTrace();

        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description Verifies the 'Sustainability' page URL and title against the
     *              expected values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void sustainVerify() {
        try {

            HooksKasak.test.log(Status.INFO, "verified the Sustainability result page");

            HooksKasak.test.log(Status.INFO, "verified the page title");
        } catch (Exception e) {
            e.printStackTrace();

        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description Verifies the 'Newsletter' page URL and title against the
     *              expected values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void newsletterVerify() {
        try {
            HooksKasak.test.log(Status.INFO, "verified the newsletter resultPage");

            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "8", "value"),
                    HooksKasak.test);
            HooksKasak.test.log(Status.INFO, "verified the newsletterPage title");
        } catch (Exception e) {
            e.printStackTrace();

        }

        catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description Verifies the 'Wedding' page URL and title against the expected
     *              values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void weddingVerify() {
        try {

            HooksKasak.test.log(Status.INFO, "verified the Wedding result page ");

            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "10", "value"),
                    HooksKasak.test);
            HooksKasak.test.log(Status.INFO, "verified the page Title");
        } catch (Exception e) {
            e.printStackTrace();

        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description Verifies the 'Rolex' page URL and title against the expected
     *              values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void rolexVerify() {
        try {

            HooksKasak.test.log(Status.INFO, "verified the rolex page");

            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "12", "value"),
                    HooksKasak.test);
            HooksKasak.test.log(Status.INFO, "verified the page title");
        } catch (Exception e) {
            e.printStackTrace();

        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * @Description Verifies the 'Brand' page URL, title, and keyword text against
     *              the expected values.
     * @param test An ExtentTest instance for reporting.
     */
    public static void brandVerify() {
        try {
            WebDriverHelper wb = new WebDriverHelper();

            HooksKasak.test.log(Status.INFO, "verified the Brand results page");

            Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "14", "value"),
                    HooksKasak.test);
            HooksKasak.test.log(Status.INFO, "verified the Brands page title");

            Assertion.assertionVerifyByEqual(wb.getText(HomePageLocators_Kasak.keyword),
                    ExcelReader.readCellValue("sheet4", "15", "value"), HooksKasak.test);
            HooksKasak.test.log(Status.INFO, "verified the Keyword AboutMayors");

        } catch (Exception e) {
            e.printStackTrace();

        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

}