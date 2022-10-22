package api;
import ModelP1.Root;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class UsersP1 {
    public Root getUser(Integer id) {
        return
                given().
                        contentType(ContentType.JSON)
                        .baseUri("https://reqres.in/")
                        .get("/api/unknown/" +id)
                        .then()
                        .statusCode(200)
                        .log().all()
                        .extract().response().as(Root.class);
    }
}
