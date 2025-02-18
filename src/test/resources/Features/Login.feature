
@Sanity
Feature: Login page automation of saucedemo app
  Scenario: Login with valid credentials
    Given User is on the login page
    When User enters valid "<username>" and "<password>"
    And User clicks on login button
    Then User navigates to homepage
    And Close the browser

Examples:
| username | password |
| standard_user | secret_sauce |
# |  locked_out_user | secret_sauce |
# |  problem_user | secret_sauce |
#  performance_glitch_user | secret_sauce | 