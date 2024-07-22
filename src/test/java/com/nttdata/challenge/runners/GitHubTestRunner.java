package com.nttdata.challenge.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/shop_product.feature",
        glue = {"com.nttdata.challenge.stepdefinitions"},
        tags = "@happyPath",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class GitHubTestRunner {

}
