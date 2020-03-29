package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    private Driver() {

    }
    public static WebDriver getReference(){
        return driver;
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (Config.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "html":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new HtmlUnitDriver();
                    break;
                case "safari":
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
                case "remotechrome":
                    DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
                    capabilities.setPlatform(Platform.ANY); // setting any available platform, or we can specify like
                    // windows, mac , android...
                    try {
                        // setting to connect our driver to local or remote server node/client
                        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub") , capabilities);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    break;


            }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        System.out.println("quiting driver");
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


}
