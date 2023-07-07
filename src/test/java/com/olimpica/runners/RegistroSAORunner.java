package com.olimpica.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com.olimpica/features/registroSAO.feature",
        glue = "com.olimpica.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class RegistroSAORunner {
}
