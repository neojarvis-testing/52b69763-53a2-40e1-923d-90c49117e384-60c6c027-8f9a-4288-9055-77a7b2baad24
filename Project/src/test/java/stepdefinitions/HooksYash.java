package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.GenerateReport;

public class HooksYash extends Base {

    public static ExtentTest test;
    public static ExtentReports reports;

    @BeforeAll
    public static void makeRep() {
        reports = GenerateReport.initializeExtentReport("Mayors");

    }

    @Before
    public void OpenBr(Scenario sc) {
        test = reports.createTest(sc.getName());

        openBrowser();

    }

    @After
    public void quitdr() {

        driver.quit();

    }

    @AfterAll
    public static void flushRep() {
        reports.flush();

    }

}
