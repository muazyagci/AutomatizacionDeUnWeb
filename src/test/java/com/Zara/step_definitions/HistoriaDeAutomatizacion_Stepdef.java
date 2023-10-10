package com.Zara.step_definitions;

import com.Zara.pages.basePage;
import com.Zara.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;

public class HistoriaDeAutomatizacion_Stepdef {
    basePage basePage=new basePage();
    @When("user is in the google page")
    public void user_is_in_the_google_page() {
        Driver.getDriver().get("https://www.google.com/");
    }
    @When("user types {string} to search box and clicks to enter")
    public void user_types_to_search_box_and_clicks_to_enter(String string) {
        basePage.AccptBtn.click();
        basePage.googleSearchBox.sendKeys(string+ Keys.ENTER);
    }
    @When("user clicks to Wikipedia result")
    public void user_clicks_to_wikipedia_result() {
        basePage.WikiLoc.click();


    }
    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();

    @Then("user verifies  the year of the first executed automation process")
    public void user_verifies_in_the_year_of_the_first_executed_automation_process() {
       js.executeScript("window.scrollBy(0,2700)");
       Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String History=basePage.Historia.getText();
        String PrimerProcesoAutomatico =History.substring(100,104);
        System.out.println(PrimerProcesoAutomatico);
    }
    @After
    public void tearDown(Scenario scenario) {
        if (true) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot");
        }
        Driver.getDriver().quit();
    }

}
