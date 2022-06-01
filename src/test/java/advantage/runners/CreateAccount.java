package advantage.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\CreateAccount.feature",
glue = "advantage.stepdefinitions",
snippets = SnippetType.CAMELCASE)
public class CreateAccount {
}
