Feature: Get all data post
  As a admin
  I want to get all data post
  So that I can view list of post

  Scenario: As a user I can get all data post
    Given I set API endpoint for get all data post
    When I send a request to get all data post
    Then I receive status code 200
    And I receive valid data for all data post


  Scenario: As a user, I attempt to retrieve all data posts but encounter an unexpected error
    Given I set invalid API endpoint for get all data post
    When I send a request to get all data post with invalid endpoint
    Then I receive status code 404 data post
