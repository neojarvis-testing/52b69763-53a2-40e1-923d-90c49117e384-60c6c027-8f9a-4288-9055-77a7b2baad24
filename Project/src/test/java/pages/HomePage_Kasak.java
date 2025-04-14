package pages;

import com.aventstack.extentreports.Status;

import stepdefinitions.Hooks;
import uistore.HomePageLocators_Kasak;
import utils.Assertion;
import utils.Base;
import utils.ExcelReader;
import utils.GenerateReport;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePage_Kasak extends Base {

    /**
     * @Created by Kasak
     * @Description Performs the 'About Mayors' action, including scrolling to
     *              footer, clicking on the link,
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */

    public static void AboutMayors() {
        LoggerHandler.info("--------------------------------------------------------------");
        WebDriverHelper wb = new WebDriverHelper();

        Base.driver.manage().window().maximize();
        wb.waitForElementToBeClickable(HomePageLocators_Kasak.cookies, 10);
        wb.clickOnElement(HomePageLocators_Kasak.cookies);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.cookies));
        Hooks.test.log(Status.INFO, wb.getText(HomePageLocators_Kasak.cookies));

        wb.javascriptScroll(HomePageLocators_Kasak.aboutMayors);

        LoggerHandler.info("scroll down to footer");
        Hooks.test.log(Status.INFO, "scroll down to footer" + wb.getText(HomePageLocators_Kasak.aboutMayors));
        LoggerHandler.info("navigate back to home page");

        wb.waitForElementToBeClickable(HomePageLocators_Kasak.aboutMayors, 10);
        wb.clickOnElement(HomePageLocators_Kasak.aboutMayors);
        Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "1", "value"),
                Hooks.test);
        System.out.println(Base.driver.getCurrentUrl() + "--------------------------------------------------");
        System.out.println(
                ExcelReader.readCellValue("sheet4", "1", "value") + "--------------------------------------------");

        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.aboutMayors));
        Hooks.test.log(Status.INFO, wb.getText(HomePageLocators_Kasak.aboutMayors));

        Base.driver.navigate().back();
        LoggerHandler.info("navigate back to home page");
        Hooks.test.log(Status.PASS, "navigate back to home page");
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Press Room' action, including scrolling, clicking
     *              on the link,
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void pressRoomFunc() {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.pressRoom);
        wb.waitForElementToBeClickable(HomePageLocators_Kasak.pressRoom, 20);
        wb.clickOnElement(HomePageLocators_Kasak.pressRoom);
        Assertion.assertionVerifyByEqual(Base.driver.getCurrentUrl(), ExcelReader.readCellValue("sheet4", "2", "value"),
                Hooks.test);

        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.pressRoom));
        Hooks.test.log(Status.INFO, "clicked on pressRoom " + wb.getText(HomePageLocators_Kasak.pressRoom));

        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Careers' action, including scrolling, clicking on
     *              the link,
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void careersFunc() {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.careers);
        wb.clickOnElement(HomePageLocators_Kasak.careers);
        Assertion.assertionVerifyByContains(Base.driver.getCurrentUrl(),
                ExcelReader.readCellValue("sheet4", "3", "value"), Hooks.test);
        Assertion.assertionVerifyByContains(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "4", "value"),
                Hooks.test);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.careers));
        Hooks.test.log(Status.INFO, "clicked on Careers " + Base.driver.getCurrentUrl());
        Hooks.test.log(Status.INFO, "verify page title " + Base.driver.getTitle());
        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Sustainability' action, including scrolling,
     *              clicking on the link,
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void sustainFunc() {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.sustainability);
        wb.clickOnElement(HomePageLocators_Kasak.sustainability);
        Assertion.assertionVerifyByContains(Base.driver.getCurrentUrl(),
                ExcelReader.readCellValue("sheet4", "5", "value"), Hooks.test);
        Assertion.assertionVerifyByContains(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "6", "value"),
                Hooks.test);
        // LoggerHandler.info(wb.getText(HomePageLocators_Kasak.sustainability));
        Hooks.test.log(Status.INFO, "clicked on sustainability " + Base.driver.getCurrentUrl());
        Hooks.test.log(Status.INFO, "verify sustainability page title " + Base.driver.getTitle());
        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Newsletter' action, including scrolling, clicking
     *              on the link,
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void newsletterFunc() {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.newsletter);
        wb.clickOnElement(HomePageLocators_Kasak.newsletter);
        Assertion.assertionVerifyByContains(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "8", "value"),
                Hooks.test);

        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.newsletter));
        Hooks.test.log(Status.INFO, "clicked on news letter " + Base.driver.getCurrentUrl());
        Hooks.test.log(Status.INFO, "verified news letter link " + Base.driver.getTitle());
        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Wedding' action, including scrolling, clicking on
     *              the link,
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void weddingFunc() {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.wedding);
        wb.clickOnElement(HomePageLocators_Kasak.wedding);
        Assertion.assertionVerifyByContains(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "10", "value"),
                Hooks.test);

        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.wedding));
        Hooks.test.log(Status.INFO, "clicked on wedding function " + Base.driver.getCurrentUrl());
        Hooks.test.log(Status.INFO, "verify wedding function title " + Base.driver.getTitle());
        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Rolex' action, including scrolling, clicking on
     *              the link,
     *              logging information, and navigating back to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void rolexFunc() {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.rolex);
        wb.clickOnElement(HomePageLocators_Kasak.rolex);
        Assertion.assertionVerifyByContains(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "12", "value"),
                Hooks.test);

        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.rolex));
        Hooks.test.log(Status.INFO, "clicked on rolex link " + Base.driver.getCurrentUrl());
        Hooks.test.log(Status.INFO, "verify the rolex link  " + Base.driver.getTitle());
        Base.driver.navigate().back();
    }

    /**
     * @Created by Kasak
     * @Description Performs the 'Brands' action, including scrolling, clicking on
     *              the link,
     *              logging information, capturing a screenshot, and navigating back
     *              to the home page.
     * @param test An ExtentTest instance for reporting.
     * @return None
     */
    public static void BrandsFunc() {
        WebDriverHelper wb = new WebDriverHelper();

        wb.javascriptScroll(HomePageLocators_Kasak.brands);
        wb.clickOnElement(HomePageLocators_Kasak.brands);

        Assertion.assertionVerifyByEqual(Base.driver.getTitle(), ExcelReader.readCellValue("sheet4", "14", "value"),
                Hooks.test);
        LoggerHandler.info(wb.getText(HomePageLocators_Kasak.brands));
        Hooks.test.log(Status.INFO, "clicked on brands function link  " + Base.driver.getCurrentUrl());
        Hooks.test.log(Status.INFO, "verify brands function title " + Base.driver.getTitle());
        Base.driver.navigate().back();

        wb.javascriptHighlight(HomePageLocators_Kasak.keyword);
        Screenshot.captureScreenshot("mayors");
        GenerateReport.addScreenshotToReport("mayors", Hooks.test, "mayors");
    }

}
