package com.jekins.test.lib;

import com.jenkins.test.pages.BasePage;
import com.jenkins.test.pages.CGIpage;
import com.jenkins.test.steps.Common;
import org.apache.log4j.Logger;

public class CucumberLogger {
    private static Logger logger = Logger.getLogger(CucumberLogger.class);

    public static void logPass(String message){
        if(Common.scenarioList.get()!=null){
            return;
        }
        Common.scenarioList.get().write("PASS" + message);
    }

    public static void logFail(String message){
        if(Common.scenarioList.get()!=null){
            return;
        }
        Common.scenarioList.get().write("Fail" + message);
    }
}
