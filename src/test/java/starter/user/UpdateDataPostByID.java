package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.annotations.Step;

public class UpdateDataPostByID {
    private static final String url = "https://jsonplaceholder.typicode.com/";
    private static final String urlInvalid = "https://jsonplaceholder.typicode.com/invalid/";

    @Step("I set API endpoint for update data by ID")
    public String setApiEndpointUpdate() {
        return url + "posts" + "/1";
    }
    @Step("I set invalid API endpoint for update data by ID")
    public String setInvalidApiEndpointUpdate() {

        return urlInvalid + "posts" + "/1";
    }

    @Step("I send a PUT request to update post data by ID 1")
    public void sendPutRequest() {
         SerenityRest.given()
                .put(setApiEndpointUpdate()); }


    @Step("I send a PUT request to update post data by ID with invalid endpoint")
    public void sendPutRequestInvalid() {
         SerenityRest.given()
                 .put(setInvalidApiEndpointUpdate()); }


    @Step("the request is successful")
    public void requestIsSuccessful() {
    }


    @Step("the request fails")
    public void requestFails() {
    }


}
