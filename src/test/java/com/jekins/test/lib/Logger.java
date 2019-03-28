package com.jekins.test.lib;

import com.jenkins.test.pages.CGIpage;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Logger {

    public static ThreadLocal<Scenario> senarioList = new ThreadLocal<Scenario>();


    @Before
    public static void begin(Scenario scenario) {
        senarioList.set(scenario);
        WebDriver driver = CGIpage.driver;
    }

    @After
    public static void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            scenario.embed(getScreenShot(),"image/png");
        }
        WebDriver driver = CGIpage.driver;
        driver.quit();

    }

    public static byte[] getScreenShot() {
        byte[] screenshot = null;

        WebDriver driver = CGIpage.driver;

        try {
            screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return screenshot;
    }
}
