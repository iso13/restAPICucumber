Feature: API
  As an Engr
  We need to test integration scenarios
  So we can ensure communication is set up

  Scenario: Base API
    Given I perform a GET request "people/1/"
    And I perform a POST request "" with the following json ""
    And I perform a PUT request ""
    And I perform a DELETE request ""
    Then the response code should be 200
    And the response should match the following schema "starwarsschema.json"


