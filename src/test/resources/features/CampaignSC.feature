@campaignStoreSC
Feature: Create new campaign feature for Store Manager

  Background: For all scenario user should be in campaign page
    Given user is on the login page
    When user log in as the "Store Manager"
    When user clicks marketing and clicks campaign

  Scenario Outline: Store Manager create new campaign with valid credentials
    When user click Create Campaign button
    And user is on the Create Campaign page
    And user choose "<Owner>"
    And user enters name "<name>"
    And user enters code "<code>"
    And user enters start date "<start day>" and  "<start month>" and "<start year>"
    And user enters end date "<end day>" and  "<end month>" and "<end year>"
    And user enters description "<description>"
    And user enters budget "<budget>"
    And user choose report scale "<report scale>"
    And user clicks save button

    Examples:
      | Owner    | name      | code | start day | start month | start year | end day | end month | end year | description       | budget | report scale |
      | John Doe | Christmas | test | 01        | Feb         | 2023       | 24      | Feb       | 2024     | New year campaign | 1000   | Daily        |
      | John Doe | Christmas | test | 01        | Feb         | 2022       | 24      | Feb       | 2024     | New year campaign | 1000   | Daily        |







 