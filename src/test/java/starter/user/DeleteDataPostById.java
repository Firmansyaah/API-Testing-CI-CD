package starter.user;


import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.annotations.Step;

public class DeleteDataPostById {
    private static final String url = "https://jsonplaceholder.typicode.com/posts/";
    private static final String urlInvalid = "https://jsonplaceholder.typicode.com/posts/invalid/";

    @Step("I set API endpoint for deleting data by ID")
    public void setApiEndpointDelete() {

    }

    @Step("I set invalid API endpoint for deleting data by ID")
    public void setApiEndpointDeleteInvalid() {

    }

    @Step("I send a DELETE request to delete post data by ID 1")
    public void sendDeleteRequest1() {
        SerenityRest.given()
                .delete(url + 1); }

    @Step("I send a DELETE request to delete product with ID")
    public void sendDeleteRequestinvalid1() {
        SerenityRest.given()
                .delete(urlInvalid + -1);
    }
    @Step("I receive a response with status code 404 delete post")
    public void receiveStatusCodeForDeleteNotFound404() {
        SerenityRest.then().statusCode(404);
    }


}
