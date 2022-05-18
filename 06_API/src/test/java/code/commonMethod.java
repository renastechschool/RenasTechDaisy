package code;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.*;

public class commonMethod {

    public static String firstBookId(){

        Response response = get("/books");
        response.then().assertThat().statusCode(200);
        String bookId = response.jsonPath().getString("[0].id");

        return bookId;

    }

    public static String BearerToken(){

        Faker faker = new Faker();

        String clientName = faker.name().fullName();
        String clientEmail = faker.internet().emailAddress();

        JSONObject object = new JSONObject();

        object.put("clientName",clientName);
        object.put("clientEmail", clientEmail);

        String payload = object.toString();

        RequestSpecification generateTokenRequest = given().header("Content-Type", "application/json").body(payload);
        Response response = generateTokenRequest.when().post("/api-clients");

        response.then().assertThat().statusCode(201);

        String token = "Bearer "+ response.jsonPath().getString("accessToken");

        return token;
    }

    public static String firstAvailableBook(){
        Response response = get("/books");

        int length = response.jsonPath().getList("$").size();

        String availableBookId = null;

        for(int i=0; i<=length; i++){
            String availablePath = String.format("[%s].available",i);
            String pathId = String.format("[%s].id",i);
            String available = response.jsonPath().getString(availablePath);
            if(available == "true"){
                availableBookId = response.jsonPath().getString(pathId);
                break;
            }
        }

        return availableBookId;
    }

//    public static String getRequest(){
//
//    }
}

