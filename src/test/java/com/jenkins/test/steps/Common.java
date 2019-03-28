package com.jenkins.test.steps;

import cucumber.api.Scenario;

public class Common {

    public static ThreadLocal<Scenario> scenarioList = new ThreadLocal<Scenario>();


    public static String getScenarioName(){
        String scenarioName="";
        if(scenarioList.get()!=null){
            scenarioName=scenarioList.get().getName();
        }
        return scenarioName;
    }

    public static String getScenarioUniqueId(){
        String scenarioId = "";
        if(scenarioList.get()!=null) {
            scenarioId= scenarioList.get().getId();
        }
        return scenarioId;
    }
}
