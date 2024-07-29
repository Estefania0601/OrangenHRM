package com.orangehrmlive.opensource_demo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ProcesoContratacion.feature",
        glue = "com.orangehrmlive.opensource_demo.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@ProcesoContratacion"

)

public class ProcesoContratacionRunner {
}

