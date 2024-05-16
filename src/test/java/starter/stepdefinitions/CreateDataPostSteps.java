package starter.stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import net.serenitybdd.rest.SerenityRest;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.nullValue;



import net.serenitybdd.annotations.Steps;
import starter.user.CreateDataPost;

public class CreateDataPostSteps {
        @Steps
        CreateDataPost createDataPost;

        @Given("I set API endpoint for create data pos")
        public void setApiEndpoint() { createDataPost.setApiEndpoint(); }

        @When("I send a POST request to create a new post")
        public void sendCreatePostRequest() { createDataPost.sendCreatePostRequest(); }

        @Then("I receive a response with status code 201")
        public void receiveStatusCode201() {createDataPost.receiveStatusCode201();
        }

        @And("the new post is successfully created")
        public void verifyNewPostIsSuccessfullyCreated() {
                Response response = SerenityRest.lastResponse();
                createDataPost.verifyNewPostIsCreated(response);
        }

        @Given("I set invalid API endpoint for creating a new post")
        public void setInvalidApiEndpoint() { createDataPost.setInvalidApiEndpoint(); }

        @When("I send a POST request to create a new post invalid")
        public void sendCreatePostRequestInvalid() { createDataPost.sendCreatePostRequestToInvalidEndpoint(); }

        @Then("I receive a response with status code 404")
        public void receiveStatusCode404() { createDataPost.receiveStatusCode404(); }




}
