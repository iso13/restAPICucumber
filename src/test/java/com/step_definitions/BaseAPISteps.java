package com.step_definitions;

import com.utils.CucumberLog;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class BaseAPISteps {

	@Before
	public void setup() {

		RestAssured.baseURI = "https://swapi.co/api/";
		//ResourceBundle env = ResourceBundle.getBundle("qa-env");
		//RestAssured.baseURI = env.getString("baseURI");
	}

	private Response response;
	//public String bearerToken;
	//public RequestSpecification request;


	@Given("^I perform a GET request \"([^\"]*)\"$")
	public void i_perform_a_GET_request(String basePath) {
		//response = given().auth().oauth2(bearerToken).when().get(baseURI + basePath);
		response = RestAssured.when().get(baseURI + basePath);
		CucumberLog.info("THE URL IS: " + baseURI + basePath);
		response.then().log().all();
		//System.out.println("RESPONSE: " + response.prettyPrint());
	}

	@Given("^I perform a POST request \"([^\"]*)\" with the following json \"([^\"]*)\"$")
	public void i_perform_a_POST_request_with_the_following_json(String arg1, String arg2) throws Exception {

	}


	@Given("^I perform a POST request \"([^\"]*)\"$")
	public void i_perform_a_POST_request(String jsonBody) throws Exception {
		//String jsonBodyFiilePath = "json/" + jsonBody;
		//response.given().contentType("application/json").body(jsonBodyFiilePath).when().post
	}

	@Given("^I perform a PUT request \"([^\"]*)\"$")
	public void i_perform_a_PUT_request(String arg1) throws Exception {

	}

	@Given("^I perform a DELETE request \"([^\"]*)\"$")
	public void i_perform_a_DELETE_request(String arg1) throws Exception {

	}

	@Then("^the response code should be (\\d+)$")
	public void the_response_code_should_be(String statusCode) throws Exception {
		CucumberLog.info("RESPONSE STATUS CODE IS: " + response.getStatusCode());
		response.then().statusCode(Integer.parseInt(statusCode));
	}

	@Then("^the response should match the following schema \"([^\"]*)\"$")
	public void the_response_should_match_the_following_schema(String jsonSchema) throws Exception {
		String schemaFilePath = "schemas/" + jsonSchema;
		CucumberLog.info("Comparing the response to json schema: " + schemaFilePath);
		response.then().assertThat().body(matchesJsonSchemaInClasspath(schemaFilePath));
	}

}
