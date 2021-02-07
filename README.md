# bitpandWeb

This is repository of basic Cucumber + Selenium WebDriver testing framework.

The Web application used for the example is - http://automationpractice.com/index.php.

This framework is developed using Cucumber + Junit + Selenium WebDriver.

The ChromeDriver version used is ChromeDriver 88.0.4324.96. Please in case your Chrome browser has different from Version 88, download the corresponding version here: https://chromedriver.chromium.org/downloads and replace it in src/test/resources/drivers/

Structure:

ChromeDriver: src/test/resources/drivers/chromedriver.exe

Page Factory: src/test/java/pageFactory

Step Definition: src/test/java/stepDefinition

Features: src/test/resources/features

Hooks: src/test/java/stepDefinition/Hooks.java

Runner: src/test/java/stepDefinition/TestRunner.java

Report: target/HtmlReports

How to run:

1 - Clone this project.

2 - Open the project and Download the POM dependencies.

3 - Go to src/test/java/stepDefinition/TestRunner.java.

4 - Run.




# Cucumber Scenarios

Feature: Login

  Scenario: Creating user account
    Given the user is on Authentication page
    When fills in the e-mail address
    And clicks on Create
    And fills all the mandatory fields
    And clicks on Register
    Then the system create new account

    
 Feature: Searching for Products

  Scenario: Search for products using different criteria
  
    Given the customer is in the main page and wants to search for new t shirt
    When the customer select T shirt category, size S, Cotton, In Stock and New
    Then the website shows the Faded Short Sleeve T-shirts
    
 Feature: Adding and Removing Products to/from the cart

  Scenario: Adding and removing products to from the cart
  
    Given the customer is logged on
    And added the product "Faded Short Sleeve T-shirts" to the cart
    And added the product "Blouse" to the cart
    And added the product "Printed Chiffon Dress" to the cart
    When the customer realized a mistake and remove the product Blouse
    Then The product was removed

 Feature: Finalizing the checkout proceed

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

