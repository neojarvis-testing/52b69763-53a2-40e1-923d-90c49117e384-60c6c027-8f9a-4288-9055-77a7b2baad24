Feature: Verify footer links on Mayors website

Scenario: Verify all footer links

Given user launches the browser and navigates to the homepage
When user maximizes the browser window

When user scrolls down to the footer 
And user clicks on the About Mayors link in the footer and navigates back to homepage
Then user clicks on the Press Room link in the footer and navigates back to homepage

When user clicks on the Careers link in the footer and navigates back to homepage
And user clicks on the Sustainability link in the footer and navigates back to homepage

When user clicks on the Newsletter signup link in the footer and navigates back to homepage
And user clicks on the Wedding link in the footer and navigates back to homepage
Then user clicks on the Rolex link in the footer and navigates back to homepage
And user clicks on the Brands link in the footer and navigates back to homepage

    