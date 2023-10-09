Feature: Buscar historia de automatizacion

  Scenario: Buscando historia de automatizacion
    When user is in the google page
    And user types "automatizacion" to search box and clicks to enter
    And user clicks to Wikipedia result
    Then user verifies in the year of the first executed automation process
    And user takes screenshot of the page
