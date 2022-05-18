package code;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GETStatusUpgraded {

    String baseURI = RestAssured.baseURI = "https://simple-books-api.glitch.me";

    @Test
    void happyPathTest() {

        Response response = get("/status");

        // if response code is not 200. It means people can not reach the API. they can't display main page.

        int expectedStatusCode = 200;
        int actualStatusCode = response.getStatusCode();
        Assert.assertEquals(actualStatusCode, expectedStatusCode, "Status code should be "+expectedStatusCode + " but it is " + actualStatusCode);

        // write a automated test case which is going to validate response body

        String responseBody = response.getBody().asString();

        Assert.assertEquals(responseBody,"{\"status\":\"OK\"}");

        System.out.println(response.jsonPath().getString("status"));

        String status = response.jsonPath().getString("status");

        Assert.assertEquals(status,"OK", "Status output is not matching");

        System.out.println(response.getBody().asString());
    }

    @Test
    void positiveTest(){
        given().get("/status").then().statusCode(200);
    }
}
