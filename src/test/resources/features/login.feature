
#User Story: When user on login page
  #          Then user be able to sign in as driver, sales manager, and store manager

Feature: Test login functionality as different users
  Scenario: Test login as driver, sales manager, and store manager
    Given user is on the login page
    When user log in as the "Store Manager"
    Then user should see the title "Dashboard"

