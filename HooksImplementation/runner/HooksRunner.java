package HooksImplementation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/HooksImplementation/feature/AccountOperations.feature"},	
				 glue = {"HooksImplementation.stepDefinition","HooksImplementation.hooks"}, //pkg where defn is available
				 publish = true, //will generate report
				 monochrome = true) //will remove junk character from report link
				 

public class HooksRunner extends AbstractTestNGCucumberTests {

}
