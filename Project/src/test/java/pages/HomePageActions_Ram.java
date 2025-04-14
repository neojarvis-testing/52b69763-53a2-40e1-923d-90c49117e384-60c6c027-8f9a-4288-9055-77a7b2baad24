package pages;

import org.junit.Assert;
import com.aventstack.extentreports.Status;
import stepdefinition.HooksRam;
import uistore.HomePage_Locator_Ram;
import utils.Base;
import utils.ExcelReader;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class HomePageActions_Ram {

    WebDriverHelper wb = new WebDriverHelper();
    FooterRedirectionActions_Ram redirect = new FooterRedirectionActions_Ram();

    /**
     * @Created by Ram Prasath
     * @Description Scrolls to the footer section of the page.
     * @return None
     */
    public void scrolltofooter() {
        try {
            wb.javascriptScroll(HomePage_Locator_Ram.footer);
            wb.waitForElementToBeVisible(HomePage_Locator_Ram.popup, 2);
            wb.jsClick(HomePage_Locator_Ram.popup);
        } catch (Exception e) {
            LoggerHandler.error("Exception in scrolltofooter: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in scrolltofooter: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Clicks on the 'Your Security' link in the footer.
     * @return None
     */
    public void clickYourSecurity() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.yoursecurity);
        } catch (Exception e) {
            LoggerHandler.error("Exception in clickYourSecurity: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in clickYourSecurity: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Clicks on the 'Terms and Conditions' link in the footer.
     * @return None
     */
    public void clickTermsAndConditions() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.terms);
        } catch (Exception e) {
            LoggerHandler.error("Exception in clickTermsAndConditions: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in clickTermsAndConditions: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Clicks on the 'Privacy Policy' link in the footer.
     * @return None
     */
    public void clickprivacyPolicy() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.PrivacyPolicy);
        } catch (Exception e) {
            LoggerHandler.error("Exception in clickprivacyPolicy: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in clickprivacyPolicy: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Clicks on the 'Cookie Policy' link in the footer.
     * @return None
     */
    public void clickCookiePolicy() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.CookiePolicy);
        } catch (Exception e) {
            LoggerHandler.error("Exception in clickCookiePolicy: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in clickCookiePolicy: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Clicks on the 'Accessibility' link in the footer.
     * @return None
     */
    public void accessibility() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.Accessibility);
        } catch (Exception e) {
            LoggerHandler.error("Exception in accessibility: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in accessibility: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Clicks on the 'Pay By Link' option in the footer.
     * @return None
     */
    public void clickPayByLink() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.PayByLink);
        } catch (Exception e) {
            LoggerHandler.error("Exception in clickPayByLink: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in clickPayByLink: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Clicks on the 'Watches' category link in the footer.
     * @return None
     */
    public void clickWatches() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.watches);
        } catch (Exception e) {
            LoggerHandler.error("Exception in clickWatches: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in clickWatches: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Clicks on the 'Jewelry' category link in the footer.
     * @return None
     */
    public void clickJwelery() {
        try {
            wb.clickOnElement(HomePage_Locator_Ram.jwelery);
        } catch (Exception e) {
            LoggerHandler.error("Exception in clickJwelery: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in clickJwelery: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Navigates back to the previous page.
     * @return None
     */
    public void navigateBack() {
        try {
            Base.driver.navigate().back();
        } catch (Exception e) {
            LoggerHandler.error("Exception in navigateBack: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in navigateBack: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Verifies the 'Pay By Link' functionality.
     * @return None
     */
    public void payByLinkVerification() {
        try {
            scrolltofooter();
            clickPayByLink();
            redirect.payByLink();
            navigateBack();
            LoggerHandler.info("Clicked on " + wb.getText(HomePage_Locator_Ram.PayByLink) + " At Homepage");
            HooksRam.test.log(Status.INFO, "Clicked on " + wb.getText(HomePage_Locator_Ram.PayByLink) + " At Homepage");
        } catch (Exception e) {
            LoggerHandler.error("Exception in payByLinkVerification: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in payByLinkVerification: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Verifies the 'Your Security' page.
     * @return None
     */
    public void yourSecurityVerification() {
        try {
            clickYourSecurity();
            redirect.yoursecurity();
            navigateBack();
            LoggerHandler.info("Clicked on " + wb.getText(HomePage_Locator_Ram.yoursecurity) + " At Homepage");
            HooksRam.test.log(Status.INFO,"Clicked on " + wb.getText(HomePage_Locator_Ram.yoursecurity) + " At Homepage");
        } catch (Exception e) {
            LoggerHandler.error("Exception in yourSecurityVerification: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in yourSecurityVerification: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Verifies the 'Terms and Conditions' page.
     * @return None
     */
    public void termsVerification() {
        try {
            scrolltofooter();
            clickTermsAndConditions();
            redirect.termsAndConditions();
            navigateBack();
            LoggerHandler.info("Clicked on " + wb.getText(HomePage_Locator_Ram.terms) + " At Homepage");
            HooksRam.test.log(Status.INFO, "Clicked on " + wb.getText(HomePage_Locator_Ram.terms) + " At Homepage");
        } catch (Exception e) {
            LoggerHandler.error("Exception in termsVerification: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in termsVerification: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Verifies the 'Privacy Policy' page.
     * @return None
     */
    public void privacyPolicyVerification() {
        try {
            scrolltofooter();
            clickprivacyPolicy();
            redirect.privacyPolicy();
            navigateBack();
            LoggerHandler.info("Clicked on " + wb.getText(HomePage_Locator_Ram.PrivacyPolicy) + " At Homepage");
            HooksRam.test.log(Status.INFO,"Clicked on " + wb.getText(HomePage_Locator_Ram.PrivacyPolicy) + " At Homepage");
        } catch (Exception e) {
            LoggerHandler.error("Exception in privacyPolicyVerification: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in privacyPolicyVerification: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Verifies the 'Cookie Policy' page.
     * @return None
     */
    public void cookiePolicyVerification() {
        try {
            scrolltofooter();
            clickCookiePolicy();
            redirect.cookiePolicy();
            navigateBack();
            LoggerHandler.info("Clicked on " + wb.getText(HomePage_Locator_Ram.CookiePolicy) + " At Homepage");
            HooksRam.test.log(Status.INFO,"Clicked on " + wb.getText(HomePage_Locator_Ram.CookiePolicy) + " At Homepage");
        } catch (Exception e) {
            LoggerHandler.error("Exception in cookiePolicyVerification: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in cookiePolicyVerification: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Verifies the 'Accessibility' page.
     * @return None
     */
    public void accessibilityVerification() {
        try {
            scrolltofooter();
            accessibility();
            redirect.accessibility();
            navigateBack();
            LoggerHandler.info("Clicked on " + wb.getText(HomePage_Locator_Ram.Accessibility) + " At Homepage");
            HooksRam.test.log(Status.INFO,"Clicked on " + wb.getText(HomePage_Locator_Ram.Accessibility) + " At Homepage");
        } catch (Exception e) {
            LoggerHandler.error("Exception in accessibilityVerification: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in accessibilityVerification: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Verifies the 'Watches' category redirection.
     * @return None
     */
    public void watchesVerification() {
        try {
            scrolltofooter();
            clickWatches();
            redirect.watches();
            navigateBack();
            LoggerHandler.info("Clicked on " + wb.getText(HomePage_Locator_Ram.watches) + " At Homepage");
            HooksRam.test.log(Status.INFO, "Clicked on " + wb.getText(HomePage_Locator_Ram.watches) + " At Homepage");
        } catch (Exception e) {
            LoggerHandler.error("Exception in watchesVerification: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in watchesVerification: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Verifies the 'Jewelry' category redirection.
     * @return None
     */
    public void jweleryVerification() {
        try {
            scrolltofooter();
            clickJwelery();
            redirect.jewelry();
            navigateBack();
            LoggerHandler.info("Clicked on " + wb.getText(HomePage_Locator_Ram.jwelery) + " At Homepage");
            HooksRam.test.log(Status.INFO, "Clicked on " + wb.getText(HomePage_Locator_Ram.jwelery) + " At Homepage");
        } catch (Exception e) {
            LoggerHandler.error("Exception in jweleryVerification: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in jweleryVerification: " + e.getMessage());
        }
    }

    /**
     * @Created by Ram Prasath
     * @Description Verifies the text content of the categories section.
     * @return None
     */
    public void categoryVerification() {
        try {
            String text = wb.getText(HomePage_Locator_Ram.categories);
            String actualText = ExcelReader.readCellValue("Sheet1", "32", "value");
            Assert.assertEquals(text, actualText);
            LoggerHandler.info("Verified " + wb.getText(HomePage_Locator_Ram.categories) + " At Homepage");
            HooksRam.test.log(Status.INFO, "Verified " + wb.getText(HomePage_Locator_Ram.categories) + " At Homepage");
        } catch (Exception e) {
            LoggerHandler.error("Exception in categoryVerification: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "Exception in categoryVerification: " + e.getMessage());
        } catch (AssertionError e) {
            LoggerHandler.error("AssertionError in categoryVerification: " + e.getMessage());
            HooksRam.test.log(Status.FAIL, "AssertionError in categoryVerification: " + e.getMessage());
        }
    }
}
