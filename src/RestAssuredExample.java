import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;


public class RestAssuredExample {
    public static void main(String[] args) {
        // Base URI for REST Assured
        RestAssured.baseURI = "https://api.example.com";

        // JSON body for the new post
        String requestBody = "{\n" +
                             "  \"title\": \"foo\",\n" +
                             "  \"body\": \"bar\",\n" +
                             "  \"userId\": 1\n" +
                             "}";

        // POST request to create a new post
        given()
            .header("Content-type", "application/json")
            .body(requestBody)
        .when()
            .post("/posts") // This is the endpoint we are testing
        .then()
            .statusCode(201)
            .body("title", equalTo("foo"))
            .body("body", equalTo("bar"))
            .body("userId", equalTo(1));
    }
}