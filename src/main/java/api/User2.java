package api;
import Model2.Root;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;

public class User2 {
    public Root getUser() {
        return
                given().
                        contentType(ContentType.JSON)
                        .baseUri("https://reqres.in/")
                        .get("/api/users/2")
                        .then()
                        .statusCode(200)
                        .log().all()
                        .extract().response().as(Root.class);
    }
}


