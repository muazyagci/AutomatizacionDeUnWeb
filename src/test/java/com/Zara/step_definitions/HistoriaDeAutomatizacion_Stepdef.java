package com.Zara.step_definitions;

import com.Zara.pages.basePage;
import com.Zara.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

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
    @Then("user verifies in the year of the first executed automation process")
    public void user_verifies_in_the_year_of_the_first_executed_automation_process() {
        
    }
    @Then("user takes screenshot of the page")
    public void user_takes_screenshot_of_the_page() {
        
    }
}
