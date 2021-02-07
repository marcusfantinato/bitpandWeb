Feature: Finalizing the

  Scenario: finishing the checkout proceed
    Given the customer is logged on
    And added the product "Faded Short Sleeve T-shirts" to the cart
    When the customer clicks on cart
    And clicks on Proceed to checkout summary
    And Clicks on Proceed to checkout address
    And agrees to the terms and click on Proceed to Checkout
    And selects the Method of Payment Pay by bank wire
    And clicks on Confirm My Order
    Then The Order is complete
