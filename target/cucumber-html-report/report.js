$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/saierdaer.yalikun/eclipse-workspace/test-jenkins/src/test/resources/feature/test.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search name",
  "description": "",
  "id": "google-search-name",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Search Sardar\u0027s name",
  "description": "",
  "id": "google-search-name;search-sardar\u0027s-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the Browser and come to google",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Put my name into the search box",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click on the search button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "confirm my name in the heading",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.open_the_Browser_and_come_to_google()"
});
formatter.result({
  "duration": 5624297085,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.put_my_name_into_the_search_box()"
});
formatter.result({
  "duration": 97559575,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_the_search_button()"
});
formatter.result({
  "duration": 1697927794,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.confirm_my_name_in_the_heading()"
});
formatter.result({
  "duration": 1666125969,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 4311636352,
  "status": "passed"
});
});