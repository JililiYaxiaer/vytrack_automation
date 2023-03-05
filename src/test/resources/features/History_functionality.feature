Feature: Verify user be able to see the recent history under hamburger icon

  @smoke
  Scenario: User should be able to access each menus inside the History icon.
    Given user log in as the "storemanager"
    When user clicks hamburger icon dropdown will be displayed
    And user could navigate to "Accounts - Customers" page
    Then user be able to see the title contains "Accounts - Customers" page

    @smoke
  Scenario: User should be able to see the previous searched page displayed as the first in the queue
#    Given user log in as the "storemanager"
    When user clicks hamburger icon dropdown will be displayed
    And user could navigate to "Contacts - Customers" page
    Then user be able to see the title contains "Contacts - Customers" page
    And user clicks hamburger icon dropdown will be displayed
    Then user could navigate to "Accounts - Customers" page
    Then user be able to see the title contains "Accounts - Customers" page
    And user clicks hamburger icon dropdown will be displayed
    Then user will see previous searched page "Contacts - Customers" been displayed as the first in the queue













#AC2: User should be able to see the recent search histories.