package code;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class POSTGenerateToken {

    String baseURI = RestAssured.baseURI = "https://simple-books-api.glitch.me";
    Faker faker = new Faker();

    @Test
    public void generateToken(){

        // POST => URL, payload(request body)

        // Request => response

        String clientName = faker.name().fullName();
        String clientEmail = faker.internet().emailAddress();

        System.out.println(clientEmail);
        System.out.println(clientName);

        JSONObject object = new JSONObject();

        object.put("clientName",clientName);
        object.put("clientEmail", clientEmail);

        String payload = object.toString();

        System.out.println(payload);

        RequestSpecification generateTokenRequest = given().header("Content-Type", "application/json").body(payload);
        Response response = generateTokenRequest.when().post("/api-clients");

        response.then().assertThat().statusCode(201);

        System.out.println(response.getBody().asString());

        System.out.println(response.jsonPath().getString("accessToken"));

        String token = "Bearer "+ response.jsonPath().getString("accessToken");

        System.out.println(token);
    }

    @Test
    public void token(){
        System.out.println(commonMethod.BearerToken());

        System.out.println(commonMethod.firstAvailableBook());
    }
}
