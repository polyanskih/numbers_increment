package tests.requests;

import io.restassured.path.json.JsonPath;
import tests.model.NumbersIncrementRequest;

import static io.restassured.RestAssured.given;

public class Requests {

    public static JsonPath numbersIncrement(String body) {
        return given()
                .contentType("application/json")
                .body(body)
                .when()
                .post("/numbers/increment")
                .jsonPath();
    }

    public static JsonPath numbersIncrement(NumbersIncrementRequest request) {
        return given()
                .contentType("application/json")
                .body(request)
                .when()
                .post("/numbers/increment")
                .jsonPath();
    }
}
