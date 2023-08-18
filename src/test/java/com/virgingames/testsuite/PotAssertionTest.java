package com.virgingames.testsuite;

import com.virgingames.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;


public class PotAssertionTest extends TestBase {

    static ValidatableResponse response;
public PotAssertionTest(){
    response = (ValidatableResponse) given()
                .queryParam("currency","GBP")

                .when()
                .get("/roxor")
                .then().statusCode(200);}



    // Verify the if the title of id = 2730 is equal to ”Ad ipsa coruscus ipsam eos demitto centum.”
    @Test
    public void Test001(){response.body("data.pots[1].name",equalTo("play-bouncy-bubbles"));

    }

}
