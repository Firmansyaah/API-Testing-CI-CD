Feature: Update Post Data by ID
  As a user
  I want to update post data by ID
  So that I can modify specific posts

Scenario: Successfully update a post data by ID
    Given I set API endpoint for update data by ID
    When I send a PUT request to update post data by ID 1
    Then the request is successful
    And I receive a response with status code 200

Scenario: Unable to update post data due to invalid ID
    Given I set API endpoint for update data by ID
    When I send a PUT request to update post data by ID with invalid endpoint
    Then the request fails
    And I receive a response with status code 404
