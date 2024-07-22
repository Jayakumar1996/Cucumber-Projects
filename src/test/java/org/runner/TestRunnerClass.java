package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
dryRun = !true,
glue= {"org.steps","hooks"},
monochrome = true,
//,tags = "@smoke"	
snippets=SnippetType.CAMELCASE,
plugin={
		"html:target\\htmReport",
//		"junit:target\\xmlReport.xml",
//		"json:target\\jsonReport.json"		
})

public class TestRunnerClass extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void report() {
      ReportingClass.generateReport("target\\jsonReport.json");
	}
}
