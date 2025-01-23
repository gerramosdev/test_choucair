package german.ramos.perez.orange.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/recruitment_orange_hrm.feature",
        tags = "@Regresion",
        glue = "german.ramos.perez.orange.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnersTags {
}
