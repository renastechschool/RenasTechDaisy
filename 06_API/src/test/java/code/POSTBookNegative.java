package code;

import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class POSTBookNegative {

    String baseURI = RestAssured.baseURI = "https://simple-books-api.glitch.me";

    @Test
    void POSTBookCRUD(){
        //CRUD
        // Create
        // Retrieve
        // Update
        // Delete
        Faker faker = new Faker();

        String token = commonMethod.BearerToken();

        String bookId = commonMethod.firstAvailableBook();
        String customerName = faker.name().fullName();

        JSONObject myObject = new JSONObject();

        myObject.put("bookId",bookId);
        myObject.put("customerName",customerName);

        String payload = myObject.toString();

        System.out.println(myObject);

        RequestSpecification requestOrder = given()
                .header("Authorization",token)
                .header("Content-Type","application/json")
                .body(payload);

        Response responseOrder = requestOrder.when().post("/orders");

        responseOrder.then().assertThat().statusCode(201);

        System.out.println(responseOrder.getBody().asString());

        String orderId = responseOrder.jsonPath().getString("orderId");

        System.out.println(orderId);

        // List the Ordered Book(s)

        RequestSpecification requestList = given()
                .header("Authorization",token);

        Response responseList = requestList.when().get("/orders");

        responseList.then().assertThat().statusCode(200);

        System.out.println(responseList.getBody().asString());

        // Get Single Order

        RequestSpecification requestSingle = given()
                .pathParam("orderId",orderId)
                .header("Authorization",token)
                .header("Content-Type","application/json");

        Response responseSingle = requestSingle.when().get("/orders/{orderId}");

        responseSingle.then().assertThat().statusCode(200);

        System.out.println(responseSingle.getBody().asString());

        // UPDATE Order

        String newCustomerName = faker.name().fullName();

        System.out.println(newCustomerName);

        JSONObject newObject = new JSONObject();

        newObject.put("customerName", newCustomerName);

        String payloadUpdate = newObject.toString();

        System.out.println(payloadUpdate);

        RequestSpecification requestUpdate = given()
                .pathParam("orderId",orderId)
                .header("Authorization",token)
                .header("Content-Type","application/json")
                .body(payloadUpdate);

        Response responseUpdate = requestUpdate.when().patch("/orders/{orderId}");

        responseUpdate.then().assertThat().statusCode(204);

        System.out.println(responseUpdate.getBody().asString());

        // GET List

        RequestSpecification requestList2 = given()
                .header("Authorization",token)
                .header("Content-Type","application/json");

        Response responseList2 = requestList2.when().get("/orders");

        responseList2.then().assertThat().statusCode(200);

        System.out.println(responseList2.getBody().asString());

        // DELETE order

        RequestSpecification requestDelete = given()
                .pathParam("orderId",orderId)
                .header("Authorization",token)
                .header("Content-Type","application/json");

        Response responseDelete = requestDelete.when().delete("/orders/{orderId}");

        responseDelete.then().assertThat().statusCode(204);

        // GET List

        RequestSpecification requestList3 = given()
                .header("Authorization",token)
                .header("Content-Type","application/json");

        Response responseList3 = requestList3.when().get("/orders");

        responseList3.then().assertThat().statusCode(200);

        System.out.println(responseList3.getBody().asString());

    }
}
