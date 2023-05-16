Feature: Gear Test
 As user I want to Add Product Successfully On Women Page

 @sanity @regression
 Scenario:User Should Add Product SuccessFully To Shopping Cart
  Given I am on Home Page
  When  I Mouse Hover on Gear Menu
  And I Click on Bags
  And I click On Product Name "Overnight Duffle"
  And I should be able to Verify the Text "Overnight Duffle"
  And  I change the Qty to 3 on Product
  And I  Click On "Add To Cart" Button
  And I verify the text "You added Overnight Duffle to your shopping cart"
  And I click on "shopping cart" link into Message
  And Verify Product Name "Overnight Duffle"
  And Verify the Qty to"3"
  And Verify the Product Price "$135.00"
  And I change the Qty to"5"
  And I clicking on "Update Shopping Cart" button
  Then Verify the Updated Product Price "$225.00"

