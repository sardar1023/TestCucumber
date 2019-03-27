package com.jekins.test.lib;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;


public class Logger {

    public static ThreadLocal<Scenario> senarioList = new ThreadLocal<Scenario>();


    @Before
    public static void begin(Scenario scenario){


    }

    public static byte[] getScreenShot(){
    byte[] screenshot= null;

    //WebDriver driver = WebDriverUtils

    return screenshot;
}
}
