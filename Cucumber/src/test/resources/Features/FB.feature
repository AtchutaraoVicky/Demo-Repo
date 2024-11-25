Feature: test the facebook application

  Scenario Outline: validate the user login credentional
    Given open the browser
    And user in login page
    When user enter the login <user> and <pass>credentional
    And user click the login btn
    Then successfully test completed

    Examples: 
      | user       | pass          |
      | 7036121546 | Atchutarao-12 |
