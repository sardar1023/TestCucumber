package com.jekins.test.lib;

import cucumber.api.Scenario;

public class Logger {

    public static ThreadLocal<Scenario> scenario = new ThreadLocal<Scenario>();

    public static String getScenarioName(){
        String scenarioName = "";
        if(scenario.get() !=null){
            scenarioName = scenario.get().getName();
        }
        return scenarioName;
    }

    public static String getScenarioUniqueID(){
        String scenarioID = "";
        if(scenario.get() != null){
            scenarioID = scenario.get().getId();
            scenarioID = scenarioID.replaceAll("[^a-zA-Z0-9.-]]","_");
        }
        return scenarioID;
    }


}
