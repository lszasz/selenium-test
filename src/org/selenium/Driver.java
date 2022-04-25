package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.IOException;
import java.net.URL;


public class Driver {

    public static WebDriver driver;

    public static void initialize(boolean newDriver, String url) throws IOException {
        if (newDriver && driver != null) {
            driver.quit();
            driver = null;
        }

        if (driver == null) {
            System.setProperty("remoteDriver", "true");
            System.setProperty("remoteHubUrl", url);

            driver = createDriver(new URL(url));
            driver.manage().window().maximize();

        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver createDriver(URL remoteUrl) throws IOException {
        ChromeOptions capabilities = new ChromeOptions();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
        driver = new RemoteWebDriver(remoteUrl, capabilities);
        return driver;
    }


}