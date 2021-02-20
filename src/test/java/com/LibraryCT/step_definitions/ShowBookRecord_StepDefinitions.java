package com.LibraryCT.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShowBookRecord_StepDefinitions {
    @Given("User logged in as librarian")
    public void user_logged_in_as_librarian() {

    }




    @When("User click on {string} link")
    public void user_click_on_link(String string) {

    }
    @Then("Show record default value should be {int}")
    public void show_record_default_value_should_be(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




    @Then("Show records for {string} option")
    public void show_records_for_option(String string, io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }



}
