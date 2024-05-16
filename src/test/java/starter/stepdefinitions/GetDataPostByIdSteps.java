package starter.stepdefinitions;



import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.annotations.Steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import starter.user.GetDataPostById;
import static org.hamcrest.Matchers.equalTo;



public class GetDataPostByIdSteps {
    private GetDataPostById getDataPostById = new GetDataPostById();

    @Given("I set API endpoint for get data by ID")
    public void setApiEndpointByID() { getDataPostById.setApiEndpointByID(); }

    @Given("I set invalid API endpoint for get data by ID")
    public void setInvalidApiEndpointByID() { getDataPostById.setInvalidApiEndpointByID(); }

    @When("I send a GET request to get post data by ID 1")
    public void sendGetPostRequest() { getDataPostById.sendGetPostRequest(); }

    @When("I send a GET request to get post data with invalid endpoint")
    public void sendGetPostRequestWithInvalidEndpoint() { getDataPostById.sendGetPostRequestWithInvalidEndpoint(); }

    @Then("I receive a response with status code 200")
    public void receiveStatusCode200() { getDataPostById.receiveStatusCode200();
    }



}

