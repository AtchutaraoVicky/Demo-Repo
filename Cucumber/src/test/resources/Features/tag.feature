Feature: application test with tags

  @smoketest
  Scenario: hello world
    Given print hello
    And print world

  @sanitytest
  Scenario: javaprogram
    Given print java
    And print program
