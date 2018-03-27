Feature: Google Search name

  Scenario: Search Sardar's name
    Given Open the Browser and come to google
    When Put my name into the search box
    Then click on the search button
    Then confirm my name in the heading
    Then close the browser
