@regression
Feature: Google feature verification
  Agile Story: User Stories, acceptance criteria
  Basically we can pass here any additional information related to this feature file
  #comments are done using hash tag sign in feature file
  @googleTitleVerification
  Scenario: Google title verification
    When User is on google page
    Then User should see title contains Google

  @miniRegression
  Scenario: Google title verification after searching a term
    When User is on google page
    And User types wooden spoon into th search box
    And User clicks to search button
    Then User should see wooden spoon in the title

  @t2
  Scenario: Creating teacher
    Given teacher value
      | first_name | John |
      | last_name   | Wick |