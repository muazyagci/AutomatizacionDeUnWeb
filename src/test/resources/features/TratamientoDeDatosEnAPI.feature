@Api
Feature:

  Scenario: Crear usuario y verificacion de datos
    When user should be able to create a successfull account "m.muaz"
    And user should get the data of the user "m.muaz"
    And user must get the list of sold pets