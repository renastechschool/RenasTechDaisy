package code;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class GETListOfTheBooks {

    String baseURI = RestAssured.baseURI = "https://simple-books-api.glitch.me";
    public static String bookId;

    @Test
    void UserRetrieveListOfTheBooksLimit1(){

        RequestSpecification requestBody = given().queryParam("limit",1);
        Response response = requestBody.when().get("/books");
        response.then().assertThat().statusCode(200);

        bookId = response.jsonPath().getString("[0].id");

        System.out.println("Body: " + response.getBody().asString());

        System.out.println(bookId);

    }

    @Test
    void UserRetrieveListOfTheBooksFiction(){

        RequestSpecification requestBody = given().queryParam("type","fiction");

        Response response = requestBody.when().get("/books");
        response.then().assertThat().statusCode(200);

        System.out.println("Body: " + response.getBody().asString());
    }

    @Test
    void UserRetrieveListOfTheBooksLimit21(){

        RequestSpecification requestBody = given().queryParam("limit",21);
        Response response = requestBody.when().get("/books");
        response.then().assertThat().statusCode(400);

        //System.out.println("Body: " + response.getBody().asString());

        String actualErrorMessage = response.jsonPath().getString("error");
        String expectedErrorMessage = "Invalid value for query parameter 'limit'. Cannot be greater than 20.";

        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message is incorrect");
    }

    @Test
    void UserRetrieveSingleBook(){

        System.out.println(commonMethod.firstBookId());

        bookId = commonMethod.firstBookId();

        System.out.println(bookId);

        RequestSpecification requestBody = given().pathParam("bookId",bookId);
        Response response = requestBody.when().get("/books/{bookId}");

        response.prettyPrint();

        response.then().assertThat().statusCode(200);

        System.out.println("Body: " + response.getBody().asString());
    }

}
