Feature: Amazon Search

  Scenario: User searches for a product
    Given I launch the Amazon website
    When I enter "laptop" in the search box
    And I click the search button
    Then I should see search results
    #Then select the product
