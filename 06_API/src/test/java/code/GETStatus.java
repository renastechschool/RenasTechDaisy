package code;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GETStatus {

    @Test
    void happyPathTest() {

        Response response = RestAssured.get("https://simple-books-api.glitch.me/status");

        System.out.println("Response: " + response.asString());

        System.out.println("Status Code: " +response.getStatusCode());

        System.out.println("Time taken: " + response.getTime());

        System.out.println("Body:" + response.getBody().asString());

        System.out.println("Header - Type: " +response.getHeader("content-type"));

        System.out.println("Header - Length: " +response.getHeader("Content-Length"));

        System.out.println("Header - Date: " +response.getHeader("Date"));

        // if response code is not 200. It means people can not reach the API. they can't display main page.

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

        Assert.assertEquals(statusCode, 200, "Status code should be 200 but it is " + statusCode);
    }
}
