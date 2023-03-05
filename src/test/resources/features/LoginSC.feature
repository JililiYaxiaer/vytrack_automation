@regression
Feature: Vytrack page login functionality

  Scenario: Login as a different users
    Given user is on the login page
    When user login as "Store Manager"
    Then user sould see the title is "Dashboard"

  Scenario: Login as a different users
    Given user is on the login page
    When user login as "Driver"
    Then user sould see the title is "Dashboard"


  Scenario: Login as a different users
    Given user is on the login page
    When user login as "Sales Manager"
    Then user sould see the title is "Dashboard"
















