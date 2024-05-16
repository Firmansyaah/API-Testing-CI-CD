package starter.stepdefinitions;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.annotations.Step;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import starter.user.UpdateDataPostByID; // Import the UpdateDataPostById class

public class UpdateDataPostByIDSteps {

    private UpdateDataPostByID updateDataPostByID = new UpdateDataPostByID();

    @Given("I set API endpoint for update data by ID")
    public void setApiEndpointUpdate() {
        updateDataPostByID.setApiEndpointUpdate();
    }

    @Given("I set invalid API endpoint for update data by ID")
    public void setApiInvalidEndpointUpdate() {
        updateDataPostByID.setInvalidApiEndpointUpdate();
    }

    @When("I send a PUT request to update post data by ID 1")
    public void sendPutRequest() { updateDataPostByID.sendPutRequest();}

    @When("I send a PUT request to update post data by ID with invalid endpoint")
    public void sendPutRequestInvalid() { updateDataPostByID.sendPutRequestInvalid();}

    @Then("the request is successful")
    public void requestIsSuccessful() { updateDataPostByID.requestIsSuccessful(); }

    @Then("the request fails")
    public void requestFails() { updateDataPostByID.requestFails(); }

}
