Feature: Dzone header comparison
  @dzone
  Scenario: Dzone header comparison
    When user is on first page we get header
    When user is on secod page we get header
    Then we compare headers
    Then test again