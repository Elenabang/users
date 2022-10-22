package api;

import Model.Root;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class User {
    public Root getUser(Integer id) {
        return
                given().
                        contentType(ContentType.JSON)
                        .baseUri("https://reqres.in/")
                        .get("api/users/"+id)
                        .then()
                        .statusCode(200)
                        .log().all()
                        .extract().response().as(Root.class);
    }


}
