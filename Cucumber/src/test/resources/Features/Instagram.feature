Feature: Test The facebook application

  Scenario Outline: Check login credentional
    Given browser open
    And user  in login page
    When user enter the <user>and <pass>
    And user click the loginbtn
    Then user navigate to the homepage

    Examples: 
      | user         | pass          |
      |   7036121546 | Atchutarao-12 |
      | atchuthvicky | atchuth125    |
