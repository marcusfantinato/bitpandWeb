package stepDefinition;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/resources/features/createNewAccount.feature",
        "src/test/resources/features/searchingForProducts.feature",
        "src/test/resources/features/addingAndRemovingProducts.feature",
        "src/test/resources/features/checkOutProcess.feature"},
        glue={"stepDefinition"},
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReports"})
        //plugin = {"json:target/cucumber.json"})
public class TestRunner {
}
