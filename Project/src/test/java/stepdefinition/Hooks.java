package stepdefinition;
 
import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
 
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import utils.Base;
import utils.GenerateReport;

 
public class Hooks extends Base {
    public static ExtentReports extentreports;
    public static ExtentTest extentTest;
   
 
    @Before
    public void preConditions(Scenario sc) {
        if (driver == null || driver.toString().contains("null")) {
            openBrowser();
            driver.findElement(By.id("onetrust-accept-btn-handler")).click();

            extentTest = extentreports.createTest(sc.getName());
        }
       
    }
 
    @BeforeAll
    public static void generateReport() {
        extentreports = GenerateReport.initializeExtentReport("Mayors");
      
 
    }
 
    @After
    public void postConditions() {
        if (driver != null) {
            driver.quit();
        }
    }
 
    @AfterAll
    public static void deleteReport(){
        extentreports.flush();
    }
 
}
 
 
 