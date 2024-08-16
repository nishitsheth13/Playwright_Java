Feature: Verify that User can create Edit and Delete the Tree Structure Including Company, Group, Site and Meter

  Scenario: Verify User can modify the treeConfiguration
    Given User is redirected to the application's URL
    When User enter the valid credentials of admin
    When User try to modify the Tree Configuration
    Then Verify that User should be success in the Modification of Tree Configuration
