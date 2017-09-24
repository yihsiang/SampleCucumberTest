package sample; 

import org.junit.runner.RunWith; 
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/java/sample",
	plugin = {"pretty", "html:target/cucumber"}) 

public class runTest { }