Feature: Validate the ANZ Borrow Calculator

  @test
  Scenario: Provide all required details 
    Given User is entering data in https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/
    When Click "Single" in Application type under Your Details
    And Select Number of dependants as "0"
    And Click "Home to live in" in Property you would like to buy
    And Enter 80000 under annual income
    And Enter 10000 under annual other income
    And Enter 500 under living expenses
    And Enter 0 under current home loan repayments
    And Enter 100 under other loan repayments
    And Enter 0 under other commitments
    And Enter 10000 under total credit card limits
    And Click Work out how much I could borrow
    Then Validate the borrowing estimate outcomes
   
    When Click Start over button
    Then Validate the borrowing estimate outcomes as "0"
    
    When Enter 1 under living expenses field
    And Click Work out how much I could borrow if living expenses is 1
    Then Validate the borrowing estimate outcome message

    