Feature: Google Search name
@test
  Scenario: Search Sardar name
    Given Open the Browser and come to google
    When Put my name into the search box
    Then click on the search button
    Then confirm my name in the heading
    Then close the browser
