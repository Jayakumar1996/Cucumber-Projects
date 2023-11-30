package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/mylisting.feature", 
dryRun = true
,glue= {"stepdefinitions","hooks"}
//,tags = "@smoke"
)
public class MyRunner {

}
