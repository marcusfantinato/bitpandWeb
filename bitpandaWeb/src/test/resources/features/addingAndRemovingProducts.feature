Feature: Adding and Removing Products to/from the cart

  Scenario: Adding and removing products to from the cart
    Given the customer is logged on
    And added the product "Faded Short Sleeve T-shirts" to the cart
    And added the product "Blouse" to the cart
    And added the product "Printed Chiffon Dress" to the cart
    When the customer realized a mistake and remove the product Blouse
    Then The product was removed
