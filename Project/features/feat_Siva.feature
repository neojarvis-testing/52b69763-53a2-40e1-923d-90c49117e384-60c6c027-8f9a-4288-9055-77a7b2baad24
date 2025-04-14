Feature: Footer Links Verification

  # Feature Description:
  # This feature ensures that all footer links redirect to their expected URLs successfully.

  Background:
    Given the user is on the Home page
  @test1
  Scenario: Verify all footer links redirection
    When the user scrolls to the footer section
    Then the user verifies the footer links is redirected to its expected URL
    

  @test2
  Scenario: Search for earrings and select rose gold earrings
    When the user enters "Earrings" in the search bar
    Then the user scrolls to the metal type brand section
    And the user selects the brand tab
    And the user hovers over the metal type brand
    And the user selects the metal type brand
    Then the user clicks on the rose gold earrings
