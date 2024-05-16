package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import starter.user.DeleteDataPostById;

public class DeleteDataPostByIdSteps {
    private DeleteDataPostById deleteDataPostById = new DeleteDataPostById();

    @Given("I set API endpoint for deleting data by ID")
    public void setApiEndpointDelete() {
        deleteDataPostById.setApiEndpointDelete();
    }
    @Given("I set invalid API endpoint for deleting data by ID")
    public void setApiInvalidEndpointDelete() {
        deleteDataPostById.setApiEndpointDeleteInvalid();
    }

    @When("I send a DELETE request to delete post data by ID 1")
    public void sendDeleteRequest() {
        deleteDataPostById.sendDeleteRequest1();
    }

    @When("I send a DELETE request to delete product with ID")
    public void sendDeleteRequestInvalid() {
        deleteDataPostById.sendDeleteRequestinvalid1();
    }

    @Then("I receive a response with status code 404 delete post")
    public void receiveStatusCodeForDeleteNotFound404() {deleteDataPostById.receiveStatusCodeForDeleteNotFound404();
    }
}
