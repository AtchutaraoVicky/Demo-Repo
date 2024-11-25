Feature: postive and negitive testing

  Scenario Outline: check login with credentials
    Given browser open
    And user in login page
    When user enters <username> and <password>
    And user clicks on login
    Then user is navigated to the home page

    Examples: 
      | username   | password      |
      | 7036121546 | Atchutarao-12 |
