Feature: Google Search name
@sardar
  Scenario: Search Sardar name
    Given Open the Browser and come to google
    When User enter "sardar" into search field
    Then click on the search button
    Then confirm my name in the heading
    Then close the browser
