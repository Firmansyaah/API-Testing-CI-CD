package starter.user;

import net.serenitybdd.annotations.Step;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;



public class CreateDataPost {
    private static String url = "https://jsonplaceholder.typicode.com/";
    private static String urlInvalid = "https://jsonplaceholder.typicode.com/invalid";

    @Step("I set API endpoint for create data post")
    public String setApiEndpoint() {
        return url + "posts";
    }

    @Step("I send a POST request to create a new post")
    public Response sendCreatePostRequest() {
        return SerenityRest.given()
                .contentType("application/json")
                .body("{ \"id\": 101 }")
                .post(setApiEndpoint());
    }

    @Step("I receive a response with status code 201")
    public void receiveStatusCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("the new post is successfully created")
    public void verifyNewPostIsCreated(Response response) {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.CREATE_DATA_POST_SCHEMA);



        response.then().assertThat().body("id", equalTo(101));

        restAssuredThat(response1 -> response1.body(matchesJsonSchema(schema)));
    }

    @Step("I set invalid API endpoint for creating a new post")
    public String setInvalidApiEndpoint() {
        return urlInvalid + "posts";
    }
    @Step("I send a POST request to create a new post")
    public Response sendCreatePostRequestToInvalidEndpoint() {
        return SerenityRest.given()
                .contentType("application/json")
                .body("{ \"id\": 101 }")
                .post(setInvalidApiEndpoint());
    }
    @Step("I receive a response with status code 404")
    public void receiveStatusCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }







}
