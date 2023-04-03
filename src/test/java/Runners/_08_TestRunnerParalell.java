package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


@CucumberOptions(
        tags = "@Regression or @SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue ={"StepDefinitions"}
)

public class _08_TestRunnerParalell extends AbstractTestNGCucumberTests {

    @BeforeClass(alwaysRun = true)
    @Parameters("browserTipi")

    public void beforeClass(String browser){
        // browser tip su an elimde
        GWD.threadBrowserSet(browser);

    }

}
