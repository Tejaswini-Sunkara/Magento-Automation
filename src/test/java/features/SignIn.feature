Feature: Signin to an Account

  Scenario: User is able to Sign in with created Account
    Given User Navigates to Magento homepage
    When User Navigates to Sign In page
    Then User Logs in with valid credentials
    And User should logged in successfully
    Then Sign out from application