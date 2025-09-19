package project;

import java.util.HashMap;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class GitHubProjectTest {
	
	//SSH key to test with
	String sshKey="ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAII/9uLHUVdyQoZdayG4eR6u6ssuARw8FOat3ttw1exyv";
	
	//Temp variable to share id
	int keyId;
	
	//Declare the request and response specs
	RequestSpecification requestSpec;
	ResponseSpecification responseSpec;
	
	@BeforeClass
	public void setUp() {
		//Initialize the request specification
		requestSpec= new RequestSpecBuilder().
				setBaseUri("https://api.github.com/user/keys").
				addHeader("Content-Type", "application/json").
				addHeader("Authorization", "token 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").
				addHeader("X-GitHub-Api-Version", "2022-11-28").
				build();
		
		//Initialize the response specification
		responseSpec= new ResponseSpecBuilder().
				expectBody("title", Matchers.equalTo("TestKey")).
				expectBody("key",Matchers.equalTo(sshKey)).
				expectResponseTime(Matchers.lessThanOrEqualTo(3000L)).
				build();
				}	
	@Test(priority = 1)
	public void postRequestTest() {
		//Request Body as Hashmap
		HashMap<String, String> reqBody= new HashMap<>();
		reqBody.put("title","TestKey");
		reqBody.put("key", sshKey);
		
		//Send request, save response
		
		Response response= RestAssured.given().
				spec(requestSpec).
				body(reqBody).
				when().post();
		
		//Extract the id from the response
		keyId= response.then().extract().path("id");
				response.then().statusCode(201).spec(responseSpec);
		
	}
	@Test(priority = 2)
    public void getRequestTest() {
    	// Send request, receive response, and assert
    	RestAssured.given().
    	spec(requestSpec).
    	pathParam("keyId", keyId).
    	when().get("/{keyId}").
    	then().statusCode(200).spec(responseSpec);
    }
	
	@Test(priority = 3)
	public void deleteRequestTest() {
		RestAssured.given().
    	spec(requestSpec).
    	pathParam("keyId", keyId).
    	when().delete("/{keyId}").
    	then().statusCode(204);
	}

}
