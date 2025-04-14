Feature: Home Page Footer Functionality Verification

  @ram
  Scenario: Verify all footer links and their redirections

    Given User is on the Mayors homepage and User scrolls to the footer section
    When User clicks on Your Security and verifies redirection
    And User clicks on Terms and Conditions and verifies redirection
    And User clicks on Privacy Policy and verifies redirection
    And User clicks on Cookie Policy and verifies redirection
    And User clicks on Accessibility and verifies redirection
    And User clicks on Pay By Link and verifies redirection
    And User clicks on Watches and verifies redirection
    Then User clicks on Jewelry and verifies redirection