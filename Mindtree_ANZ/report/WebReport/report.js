$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFiles/ANZ_Calculator.feature");
formatter.feature({
  "name": "Validate the ANZ Borrow Calculator",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Provide all required details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "User is entering data in https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/",
  "keyword": "Given "
});
formatter.match({
  "location": "ANZSteps.user_is_entering_data_in_https_www_anz_com_au_personal_home_loans_calculators_tools_much_borrow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \"Single\" in Application type under Your Details",
  "keyword": "When "
});
formatter.match({
  "location": "ANZSteps.click_in_Application_type_under_Your_Details(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Number of dependants as \"0\"",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.select_Number_of_dependants_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \"Home to live in\" in Property you would like to buy",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.click_in_Property_you_would_like_to_buy(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter 80000 under annual income",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.enter_under_annual_income(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter 10000 under annual other income",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.enter_under_annual_other_income(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter 500 under living expenses",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.enter_under_living_expenses(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter 0 under current home loan repayments",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.enter_under_current_home_loan_repayments(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter 100 under other loan repayments",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.enter_under_other_loan_repayments(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter 0 under other commitments",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.enter_under_other_commitments(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter 10000 under total credit card limits",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.enter_under_total_credit_card_limits(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Work out how much I could borrow",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.click_Work_out_how_much_I_could_borrow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the borrowing estimate outcomes",
  "keyword": "Then "
});
formatter.match({
  "location": "ANZSteps.validate_the_borrowing_estimate_outcomes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Start over button",
  "keyword": "When "
});
formatter.match({
  "location": "ANZSteps.click_Start_over_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the borrowing estimate outcomes as \"0\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ANZSteps.validate_the_borrowing_estimate_outcomes_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter 1 under living expenses field",
  "keyword": "When "
});
formatter.match({
  "location": "ANZSteps.enter_under_living_expenses_field(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Work out how much I could borrow if living expenses is 1",
  "keyword": "And "
});
formatter.match({
  "location": "ANZSteps.click_Work_out_how_much_I_could_borrow_if_living_expenses_is(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the borrowing estimate outcome message",
  "keyword": "Then "
});
formatter.match({
  "location": "ANZSteps.validate_the_borrowing_estimate_outcome_message()"
});
formatter.result({
  "status": "passed"
});
});