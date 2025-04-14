Feature: Mayors Check
     
    @TestOne
     Scenario: BestSellersWatchCheck
     Given user lands on the homepage
     When user hover on watches and click on the BestSellers
     And user clicks on the ForHim, Cartier under brand and Black under dial color
     Then user click on the product that appears and click on add to bag

     @TestTwo
     Scenario: RolexDeepSeaCheck
     Given user navigates to the homepage
     When user hover on Rolex and click on DeepSea
     And user click on the Rolex Watches and again click on Discover Rolex
     Then user click on New Watches 2025 and click on Watchmaking
