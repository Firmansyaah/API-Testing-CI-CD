Feature: Deleting Post Data by ID
  As a user,
  I want to delete post data by ID,
  So that I can remove unnecessary posts.

Scenario: Successfully delete post data by ID
    Given I set API endpoint for deleting data by ID
    When I send a DELETE request to delete post data by ID 1
    Then the request is successful
    And I receive a response with status code 200

Scenario: Unable to delete post data due to invalid ID
  Given I set API endpoint for deleting data by ID
  When I send a DELETE request to delete product with ID
  Then I receive a response with status code 404 delete post


