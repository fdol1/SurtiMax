package com.surtimax.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/resources/features/RealizarPedido.feature"},
        tags = {"@RealizarPedido"},
        glue = {"com.surtimax.certificacion.stepsdefinitions"},
        snippets = SnippetType.CAMELCASE
)
@RunWith(CucumberWithSerenity.class)

public class RunnerRealizarPedido {}