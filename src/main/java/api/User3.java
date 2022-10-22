package api;

import Model3.Root;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class User3 {

    public Root getUser() {
        return
                given().
                        contentType(ContentType.JSON)
                        .baseUri("https://reqres.in/")
                        .get("/api/unknown/2")
                        .then()
                        .statusCode(200)
                        .log().all()
                        .extract().response().as(Root.class);
    }
}
