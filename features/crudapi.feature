Feature: CRUD API

  Scenario: Efetuando CRUD
    Given que for acessado o endpoint "https://reqres.in/api/users/1"
    When seja efetuado o CREATED
    And seja efetuado o UPDATE
    Then seja efetuado o DELETE