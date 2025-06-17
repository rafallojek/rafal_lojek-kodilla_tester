package com.kodilla.rest.controller;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class ExternalApiRestAssuredTest {

    @Test
    void testGetPostShouldReturnStatus200AndValidateResponse() {
        given()
                .header("Content-Type", "application/json")
                .when()
                .get("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .assertThat()
                .statusCode(200)
                .body("userId", equalTo(1))
                .body("id", equalTo(1))
                .body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
                .body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"))
                .log().all();
    }

    @Test
    void testUpdatePostShouldReturnStatus200AndUpdatedContent() {
        String updatedPostJson = """
            {
              "id": 1,
              "title": "updated title",
              "body": "updated body content",
              "userId": 1
            }
            """;

        given()
                .contentType("application/json")
                .body(updatedPostJson)
                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", equalTo("updated title"))
                .body("body", equalTo("updated body content"))
                .body("userId", equalTo(1))
                .log().all();
    }
}
