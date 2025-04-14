
Feature: Omega Brand Shopping

  Scenario: Add Omega Product to Shopping Bag
   
    Given the user navigates to the Mayors homepage and maximizes the browser window
    When the user hovers over Brands on the navigation bar and clicks on Omega
    And the user clicks on Mens Watches under Recipient
    And the user clicks on Seamaster under Brand Collections
    And the user clicks on Blue under Dial Color
    Then the user adds the first product to the shopping bag


  Scenario: Add Chanel Product to Shopping Bag
  
    Given the user navigates to the Mayors homepage
    When the user hovers over Jewelry on the navigation bar and clicks on Chanel
    And the user clicks on Rings
    And the user clicks on Coco crush under Brand
    And the user clicks on White Gold under Dial Color
    Then the user adds the first product 

