package org.runn;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ELCOT\\eclipse-workspace\\SampleCucumber\\src\\test\\java\\featureFile",
		glue= {"com.app.stepdefinition"},
		dryRun=false,
		monochrome=true,
		publish=true,
		tags="@tag1")

public class Rclass {
	

}
