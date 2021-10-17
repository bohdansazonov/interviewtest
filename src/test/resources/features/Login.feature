Feature: User login to application

  Scenario: User can login and logout successfully
    Given user opens main page
    When user clicks login button
    And user enters login "bsinterviewtest@protonmail.com"
    And user enters password "testpassword"
    And user clicks Enter button
    Then assert user credentials are stored in local storage
    And assert user is redirected to profile page after successful login
    When user clicks profile button
    And user clicks logout button
    Then assert user is redirected to home page
    When unauthorized user opens secured link
    Then assert user is redirected to login page