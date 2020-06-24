Feature: Etsy search functionality
  Agile story : can be placed here
  CBT - 25  -->>> Jira ticket

  Background: User is already on Etsy home page
    Given User is on Etsy home page
    # we can pass more than one step under background

  Scenario: Etsy search title verification
    When User searches for wooden spoon
    Then User should see wooden spoon in Etsy title

  @etsy
  Scenario: Etsy search title verification
    When User searches for "wooden spoon"
    Then User should see "wooden spoon" in Etsy title

  @etsy2
  Scenario Outline: Etsy search title verification
    When User searches for "<searchValue>"
    Then User should see "<expectedTitle>" in Etsy title

    Examples: different data sets
    |searchValue        | expectedTitle|
    |custom wooden spoon| Custom wooden spoon|
    |wooden spoon       | Wooden spoon       |
    |wooden spoon       | wooden spoon       |



