@wip
Feature: Create new contact

  Scenario: Driver should be able get a link "Create Contact" on main page
    Given User go to login page and put valid credentials
    When User get link "Create Contact" on main page and click it
    Then Verify user sees "Create Contact - Contacts - Customers"  in the title

  Scenario: Driver should be able create new contact with valid credentials
    Given User go to login page and put valid credentials
    When User get link "Create Contact" on main page and click it
    Then User enters all credentials
      | namePrefix | Mr             |
      | firstName  | Alex           |
      | middleName | Charles        |
      | lastName   | Smith          |
      | nameSuffix | Jr             |
      | emails     | user@gmail.com |
      | phones     | 9999999999     |
      | fax        | 8888888888     |
      | skype      | AlexD          |
      | method     | Email          |
      | twitter    | AlexD          |
      | facebook   | AlexS          |
      | googlePlus | alexSmith      |
      | linkedIn   | SmithAlex      |
      | jobTitle   | Driver         |
      | birthday   | 03/19/1987     |
      | gender     | Male           |
      | source     | Website        |
    Then User click "Save and Close" button
    Then User should be able see confirmation message:"Contact saved"

