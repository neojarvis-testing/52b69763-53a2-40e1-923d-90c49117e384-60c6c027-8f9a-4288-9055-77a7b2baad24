package stepdefinition;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.GenerateReport;

public class HooksRam extends Base {
    public static ExtentReports reports;
    public static ExtentTest test;

    @BeforeAll
    public static void config() {
        reports = GenerateReport.initializeExtentReport("Mayors_Report");

    }

    @Before
    public void open(Scenario sc) throws Exception {
        openBrowser();
        test = reports.createTest(sc.getName());
    }

    @After
    public void close() {
        driver.quit();
    }

    @AfterAll
    public static void flusing() {
        reports.flush();
    }
}