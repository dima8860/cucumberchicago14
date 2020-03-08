package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogs {
    public static void main(String[] args) {

        Logger logger = LogManager.getLogger(TestLogs.class); // log4j.logger, passing TestLogs same as class name where u writing it
        // can be written in .properties or .xml files

        System.out.println("test started");
        Log.start("Header comparison");
        Log.info("start of the test");
        System.out.println("go to amazon");
        Log.info("user is on amazon");
        System.out.println("user login in amazon");
        Log.warn("login in amazon");

        ExtentHtmlReporter configs = new ExtentHtmlReporter("./extentReport/report.html");
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(configs);
        System.out.println("Start test");
        ExtentTest extentTest = reports.createTest("Google search");
        extentTest.pass("It is passing");
        extentTest.fail("didn't match. FAIL!");
        reports.flush();
        System.out.println("completed");
    }
}
