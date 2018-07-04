package utils;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class WebDriverUtils {
    private static WebDriver driver;
    //private static Scenario scenario ;
    //private static String URL = "http://www.google.com";

    public static void initialiseWebDriver() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        //driver = new MarionetteDriver(capabilities);
        driver = new FirefoxDriver(capabilities);
    }

    public static void login() {
        //driver.navigate().to("http://www.google.com");
        driver.get("http://www.google.com");
    }

    public static void navigateToPage(String link) {
        driver.findElement(By.linkText(link)).click();
    }

    public static void addFormValueByID(String field, String value) {
        driver.findElement(By.id(field)).sendKeys(value);
    }

    public static void takeScreenshot(Scenario scenario) throws IOException {
        //if (scenario.isFailed()) {
            //TakesScreenshot ts = (TakesScreenshot) driver;
        final byte[] screenshot = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
        }


    public static void closeWebDriver() {
        driver.close();
    }
}
