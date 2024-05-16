Feature: Create a new post
  As an admin
  I want to create a new post
  So that I can add it to the list of posts

  Scenario: Successfully create a new post
    Given I set API endpoint for create data pos
    When I send a POST request to create a new post
    Then I receive a response with status code 201
    And the new post is successfully created

  Scenario: Failed to create a new post due to invalid endpoint
    Given I set invalid API endpoint for creating a new post
    When I send a POST request to create a new post invalid
    Then I receive a response with status code 404
