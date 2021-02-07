Feature: Searching for Products

  Scenario: Search for products using different criteria
    Given the customer is in the main page and wants to search for new t shirt
    When the customer select T shirt category, size S, Cotton, In Stock and New
    Then the website shows the Faded Short Sleeve T-shirts
