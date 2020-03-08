Feature: Wikipedia features

  @wikipedia
  Scenario Outline: Wikipedia Search Functionality Title Verification first
    When User is onWikipedia home page
    Then User types "<searchValue>" in the wiki search box
    Then User clicks wiki search button
    Then User sees "<expectedValue>" is in thewikititle
    Examples: data
      | searchValue | expectedValue |
      | Steve Jobs  | Steve Jobs    |
      | vasyl       | vasyl         |
      | something   | anything      |


