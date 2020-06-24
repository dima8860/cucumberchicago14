Feature: Smartbear login feature verifications
  Agile Story: When user is on the login page of SmartBear app user should
  be able to login using correct test data
  A/C:
  1- Only authenticated user should be able to login
  Link: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
  Authenticated test data:
  Username: Test
  Password: tester
  2- User should see "Welcome, Tester!" displayed when logged in.

  @positiveLoginSB
  Scenario: Verifying login with using authenticated data
    When User is on home page
    And User should be able to enter correct username
    And User should be able to enter correct password
    And User should be able to click on login button
    Then User should see Welcome, Tester! displayed when logged in
  @negativeLoginSB
  Scenario: When user enters correct username and incorrect password user should see error message
    When User is on SmartBear login page
    And User enters correct username
    And User enters incorrect password
    And User clicks to login button
    Then User should see the error message displayed on the page