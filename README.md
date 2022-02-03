Quick Setup Guides

	•   Java 8
	•   Cucumber 3.0.2
	•   Selenium Webdriver 4.0.0
	•   Junit 4.13.2
	•   Firefox driver
	•   Eclipse

Overview:

	This test automation project is to verify and validate the borrowing calculator for ANZ. By using selenium and cucumber, test automation script is developed for below scenarios.
  
		1. Checking the borrow estimation based on given data in the form.
        ![image](https://user-images.githubusercontent.com/47217366/152317217-94d28c94-d38a-4899-b25f-569b0060441f.png)
		2. Clear the entered data in the form by clicking "Start over" button.
        ![image](https://user-images.githubusercontent.com/47217366/152317340-52aecb13-1280-4602-929c-bd881e27804e.png)
		3. If the user entered invalid data / insufficient data, the form should display appropriate message.
        ![image](https://user-images.githubusercontent.com/47217366/152317371-a5cecb0e-8f63-42e1-a81d-bb8dba58d359.png)
	
Steps to Run:

1.	Import the project to Eclipse.
2.	Build the Maven using POM.xml
3.	Execute the runner/RunnerClass.java using run as Junit option. If everything is ok, browser will be opened and ANZ borrowing calculator will be displayed, so you can play with the calculator.


  
