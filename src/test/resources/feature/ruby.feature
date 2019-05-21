Feature: Check Ruby from the WIKI Page

  @ruby
  Scenario: Open the wiki to check ruby programming language
    Given Open the Browser and come to google
    When User enter "ruby wiki" into search field
    Then click on the search button
    And click on the link "Ruby - Wikipedia"
    Then User confirm the Ruby Header
    Then close the browser
