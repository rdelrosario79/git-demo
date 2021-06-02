package com.nba.sandBox;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class LoginAttempt {

    @Test
    public void loginAttempts() throws InterruptedException {

        int attempts = 7;

        for(int i=0; i<attempts; i++) {
            RestAssured.baseURI = "https://identity.nba.com/api/v1/";
            RequestSpecification request = RestAssured.given();

            JSONObject requestParams = new JSONObject();
            requestParams.put("email", "nbaqa23@gmail.com");
            requestParams.put("password", "123456"); //incorrect password
            requestParams.put("rememberMe", false);

            request.body(requestParams.toJSONString());
            Response response = request.post("/auth");


            int statusCode = response.getStatusCode();
            System.out.println("The status code recieved: " + statusCode);
            System.out.println("Response body: " + response.body().asString());

        }
    }

}
