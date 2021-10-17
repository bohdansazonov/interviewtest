Feature: User login to application

  Background:
    Given user opens main page

  Scenario: User can login and logout successfully
    When user clicks login button
    And user enters login "bsinterviewtest@protonmail.com"
    And user enters password "testpassword"
    And user clicks Enter button
    And assert user credentials are stored in local storage
    And assert user is redirected to profile page after successful login
    And user clicks profile button
    And user clicks logout button
    Then assert user is redirected to home page
    And unauthorized user opens secured link
    Then assert user is redirected to login page
