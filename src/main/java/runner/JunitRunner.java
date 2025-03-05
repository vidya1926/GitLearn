package runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/features", glue = {"pages","base"}, publish=true, monochrome = true, plugin = {"pretty", "html:target/cucumber-reports/cucumber.html", })
public class JunitRunner  {

}
