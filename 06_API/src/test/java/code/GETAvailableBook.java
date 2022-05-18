package code;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.get;

public class GETAvailableBook {

    String baseURI = RestAssured.baseURI = "https://simple-books-api.glitch.me";

    @Test
    public void availableBook(){

        Response response = get("/books");

        response.prettyPrint();
        //System.out.println(response.getBody().asString());

        int length = response.jsonPath().getList("$").size();

        System.out.println(length);
        String availableBookId = null;

        for(int i=0; i<=length; i++){
            String availablePath = String.format("[%s].available",i);
            String pathId = String.format("[%s].id",i);
            String available = response.jsonPath().getString(availablePath);

            if(available == "true"){

                availableBookId = response.jsonPath().getString(pathId);

                System.out.println("availableBookIdd: " + availableBookId);
                break;

            }
        }

        System.out.println("availableBookId: " + availableBookId);

    }
}
