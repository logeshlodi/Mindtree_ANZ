package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= "featureFiles/ANZ_Calculator.feature", 
glue="stepDefinitions",
dryRun=false,
monochrome=true,
plugin={"html:report/WebReport", "json:report/jsonreport.json","junit:report/xmlreport.xml"},
tags ={"@test"})

public class RunnerClass {
 
}