package pages;

import org.junit.Assert;
import com.aventstack.extentreports.Status;

import stepdefinition.HooksRam;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class FooterRedirectionActions_Ram {

    WebDriverHelper wb = new WebDriverHelper();

    /**
     * @Created by Ram Prasath
     * @Description Verifies the 'Your Security' page.
     */
    public void yoursecurity() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "7", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "8", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            LoggerHandler.error("Exception in yoursecurity: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in yoursecurity: " + e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.error("AssertionError in yoursecurity: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "AssertionError in yoursecurity: " + e.getMessage());
        }
    }

    public void termsAndConditions() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "9", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "10", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            LoggerHandler.error("Exception in termsAndConditions: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in termsAndConditions: " + e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.error("AssertionError in termsAndConditions: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "AssertionError in termsAndConditions: " + e.getMessage());
        }
    }

    public void privacyPolicy() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "11", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "12", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            LoggerHandler.error("Exception in privacyPolicy: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in privacyPolicy: " + e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.error("AssertionError in privacyPolicy: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "AssertionError in privacyPolicy: " + e.getMessage());
        }
    }

    public void cookiePolicy() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "13", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "14", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            LoggerHandler.error("Exception in cookiePolicy: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in cookiePolicy: " + e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.error("AssertionError in cookiePolicy: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "AssertionError in cookiePolicy: " + e.getMessage());
        }
    }

    public void accessibility() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "15", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "16", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            LoggerHandler.error("Exception in accessibility: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in accessibility: " + e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.error("AssertionError in accessibility: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "AssertionError in accessibility: " + e.getMessage());
        }
    }

    public void payByLink() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "17", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "18", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            LoggerHandler.error("Exception in payByLink: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in payByLink: " + e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.error("AssertionError in payByLink: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "AssertionError in payByLink: " + e.getMessage());
        }
    }

    public void watches() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "19", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "20", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            LoggerHandler.error("Exception in watches: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in watches: " + e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.error("AssertionError in watches: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "AssertionError in watches: " + e.getMessage());
        }
    }

    public void jewelry() {
        try {
            String current_url = Base.driver.getCurrentUrl();
            String expected_url = ExcelReader.readCellValue("Sheet1", "21", "value");
            Assert.assertEquals(current_url, expected_url);

            String current_title = Base.driver.getTitle();
            String expected_title = ExcelReader.readCellValue("Sheet1", "22", "value");
            Assert.assertEquals(current_title, expected_title);

        } catch (Exception e) {
            LoggerHandler.error("Exception in jewelry: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in jewelry: " + e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.error("AssertionError in jewelry: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "AssertionError in jewelry: " + e.getMessage());
        }
    }
}
