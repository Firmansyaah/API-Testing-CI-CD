package starter.user;

import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.annotations.Step;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class GetDataPostById {
    private static String url = "https://jsonplaceholder.typicode.com/";
    private static String urlInvalid = "https://jsonplaceholder.typicode.com/invalid/";

    @Step("I set API endpoint for get data by ID")
    public String setApiEndpointByID() {
        return url + "posts" + "/1";
    }

    @Step("I set invalid API endpoint for get data by ID")
    public String setInvalidApiEndpointByID() {
        return urlInvalid + "posts" + "/1";
    }

    @Step("I send a GET request to get post data by ID 1")
    public Response sendGetPostRequest() {
        return SerenityRest.given()
                .get(setApiEndpointByID());
    }

    @Step("I send a GET request to get post data with invalid endpoint")
    public Response sendGetPostRequestWithInvalidEndpoint() {
        return SerenityRest.given()
                .get(setInvalidApiEndpointByID());
    }


    @Step("I receive a response with status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response1 -> response1.statusCode(200));
    }

    @Step("the post data is returned for ID 1")
    public void verifyPostData() {
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_DATA_POST_BY_ID_SCHEMA);
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }

    @Step("I send a GET request to get post data by invalid ID -1")
    public Response sendGetPostRequestInvalid() {
        return SerenityRest.given()
                .pathParam("postId", -1)
                .get("/posts/{postId}");
    }


}