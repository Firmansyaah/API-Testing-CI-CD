package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.serenitybdd.annotations.Steps;
import starter.user.GetAllDataPost;

public class GetAllDataPostSteps {

    @Steps
    GetAllDataPost getAllDataPost;

    @Given("I set API endpoint for get all data post")
    public void setApiEndpoint() {
        getAllDataPost.setApiEndpoint();
    }

    @Given("I set invalid API endpoint for get all data post")
    public void setInvalidApiEndpoint() {
        getAllDataPost.setInvalidApiEndpoint();
    }

    @When("I send a request to get all data post")
    public void sendGetAllDataPostRequest() {
        getAllDataPost.sendGetAllPostRequest();
    }

    @When("I send a request to get all data post with invalid endpoint")
    public void sendGetAllPostRequestWithInvalidEndpoint() {
        getAllDataPost.sendGetAllPostRequestWithInvalidEndpoint();
    }

    @Then("I receive status code 200")
    public void receiveStatusCode200() {
        getAllDataPost.receiveStatusCode200();
    }

    @And("I receive valid data for all data post")
    public void receiveValidAllDataPost() {
        getAllDataPost.receiveValidAllDataPost();
    }

    @Then("I receive status code 404 data post")
    public void receiveStatusCode404() { getAllDataPost.receiveStatusCode404();}


}