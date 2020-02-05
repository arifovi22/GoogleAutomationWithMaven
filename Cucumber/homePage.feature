Feature: Google

  
   Background: I am in Google
    Given I am in google home page and click search
  
    Scenario: I am searching
    When I write "fountain pen" click search and landing on specific search result
    And From the search result I select a result 
    
    Scenario: I am validate homepage
    Then I see "About" in the top
    
    
