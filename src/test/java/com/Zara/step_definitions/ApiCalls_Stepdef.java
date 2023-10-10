package com.Zara.step_definitions;

import com.Zara.POJO.SoldPets;
import com.Zara.POJO.User;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;

import java.util.List;

import static io.restassured.RestAssured.*;
public class ApiCalls_Stepdef {
    @BeforeAll
    public static void init(){
        baseURI="https://petstore.swagger.io/v2/swagger.json";
    }

    @When("user should be able to create a successfull account {string}")
    public void user_should_be_able_to_create_a_successfull_account(String userName) {
        User user=new User(5,userName,"Muhammet","Yagci","dummy@gmail.com","password","589654789",06);
        given()
                .accept(ContentType.JSON)
                .when()
                .body(user)
                .post("/user")
                .then()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON);
    }
    @When("user should get the data of the user {string}")
    public void user_should_get_the_data_of_the_user(String userName) {
        given()
                .accept(ContentType.JSON)
                .when()
                .get("/user/"+userName)
                .then()
                .statusCode(200)
                .and()
                .contentType(ContentType.JSON);
    }

    @And("user must get the list of sold pets")
    public void userMustGetTheListOfSoldPets() {

        given()
                .accept(ContentType.JSON)
                .when().request().param("status","sold")
                .get("/pet/findByStatus")
                .getBody()
                .as(List<SoldPets>.class);
        List<SoldPets> token = new List<SoldPets>();

    }
}
