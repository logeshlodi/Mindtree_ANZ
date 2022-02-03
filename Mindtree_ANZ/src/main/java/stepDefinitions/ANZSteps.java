package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ANZSteps {
	
	WebDriver driver;
	
	
	@Given("^User is entering data in https:\\/\\/www.anz.com.au\\/personal\\/home-loans\\/calculators-tools\\/much-borrow\\/$")
	public void user_is_entering_data_in_https_www_anz_com_au_personal_home_loans_calculators_tools_much_borrow() {
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");		
	}

	@When("Click {string} in Application type under Your Details")
	public void click_in_Application_type_under_Your_Details(String string) {
	    WebElement applicationType = driver.findElement(By.xpath("//label[contains(.,\""+string+"\")]"));
	    applicationType.click();
	}

	@When("Select Number of dependants as {string}")
	public void select_Number_of_dependants_as(String string) {
		Select dependants = new Select(driver.findElement(By.xpath("//select[@title='Number of dependants']")));
		dependants.selectByIndex(0);
	    
	}

	@When("Click {string} in Property you would like to buy")
	public void click_in_Property_you_would_like_to_buy(String string) {
		WebElement propertyBuy = driver.findElement(By.xpath("//label[contains(.,\""+string+"\")]"));
		propertyBuy.click();
	}

	@When("Enter {int} under annual income")
	public void enter_under_annual_income(Integer int1) {
		WebElement annualIncome = driver.findElement(By.xpath("//label[contains(.,'Your annual income (before tax)')]/following::input[1]"));
		annualIncome.sendKeys("/"+int1+"/");
	}

	@When("Enter {int} under annual other income")
	public void enter_under_annual_other_income(Integer int1) {
		WebElement otherIncome = driver.findElement(By.xpath("//label[contains(.,'Your annual income (before tax)')]/following::input[2]"));
		otherIncome.sendKeys("/"+int1+"/");	   
	}

	@When("Enter {int} under living expenses")
	public void enter_under_living_expenses(Integer int1) {
		WebElement livingExpenses = driver.findElement(By.xpath("//label[contains(.,'Monthly living expenses')]/following::input[1]"));
		livingExpenses.sendKeys("/"+int1+"/");	   	   
	}

	@When("Enter {int} under current home loan repayments")
	public void enter_under_current_home_loan_repayments(Integer int1) {
		WebElement loanRepayment = driver.findElement(By.xpath("//label[contains(.,'Monthly living expenses')]/following::input[2]"));
		loanRepayment.sendKeys("/"+int1+"/");	   	   	    
	}

	@When("Enter {int} under other loan repayments")
	public void enter_under_other_loan_repayments(Integer int1) {
		WebElement otherRepayment = driver.findElement(By.xpath("//label[contains(.,'Monthly living expenses')]/following::input[3]"));
		otherRepayment.sendKeys("/"+int1+"/");	   
	}

	@When("Enter {int} under other commitments")
	public void enter_under_other_commitments(Integer int1) {
		WebElement otherCommitments = driver.findElement(By.xpath("//label[contains(.,'Monthly living expenses')]/following::input[4]"));
		otherCommitments.sendKeys("/"+int1+"/");	   
	}

	@When("Enter {int} under total credit card limits")
	public void enter_under_total_credit_card_limits(Integer int1) {
		WebElement creditLimits = driver.findElement(By.xpath("//label[contains(.,'Monthly living expenses')]/following::input[5]"));
		creditLimits.sendKeys("/"+int1+"/");	
	}

	@When("Click Work out how much I could borrow")
	public void click_Work_out_how_much_I_could_borrow() throws InterruptedException {
		WebElement creditLimits = driver.findElement(By.id("btnBorrowCalculater"));
		creditLimits.click();	
		Thread.sleep(3000);
	}

	@Then("Validate the borrowing estimate outcomes")
	public void validate_the_borrowing_estimate_outcomes() {
		WebElement borrowResultTextAmount = driver.findElement(By.id("borrowResultTextAmount"));
		String result= borrowResultTextAmount.getText();
		System.out.println("We estimate you could borrow : "+result);
	}

	@When("Click Start over button")
	public void click_Start_over_button() {
		WebElement clickStartOver = driver.findElement(By.xpath("(//button[contains(.,'Start over')])[1]"));
		clickStartOver.click();
	}

	@Then("Validate the borrowing estimate outcomes as {string}")
	public void validate_the_borrowing_estimate_outcomes_as(String string) {
		WebElement borrowResultTextAmount = driver.findElement(By.id("borrowResultTextAmount"));
		String result= borrowResultTextAmount.getText();
		System.out.println("We estimate you could borrow : "+result);
	}
	
	@When("Enter {int} under living expenses field")
	public void enter_under_living_expenses_field(Integer int1) {
		WebElement livingExpenses = driver.findElement(By.xpath("//label[contains(.,'Monthly living expenses')]/following::input[1]"));
		livingExpenses.sendKeys("/"+int1+"/");	   
	}
	
	@When("Click Work out how much I could borrow if living expenses is {int}")
	public void click_Work_out_how_much_I_could_borrow_if_living_expenses_is(Integer int1) throws InterruptedException {
		WebElement creditLimits = driver.findElement(By.id("btnBorrowCalculater"));
		creditLimits.click();	
		Thread.sleep(3000);
	}

	@Then("Validate the borrowing estimate outcome message")
	public void validate_the_borrowing_estimate_outcome_message() {
		WebElement borrowResultAssertion = driver.findElement(By.xpath("//div[contains(@aria-live,'assertive')]"));
		String result= borrowResultAssertion.getText();
		System.out.println("Displaying Message is : "+result);
		driver.quit();
	}


}
