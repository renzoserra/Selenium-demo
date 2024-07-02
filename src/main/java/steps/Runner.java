package steps;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src\\main\\java\\feature",
    glue = "steps",
    publish = true,
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    snippets = CAMELCASE,
    monochrome = true,
    tags = "@orangehrm or @swagLab"
)


public class Runner {
    
}
