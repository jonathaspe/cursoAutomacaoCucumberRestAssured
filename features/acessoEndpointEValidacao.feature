Feature: Validação API JSON

  Scenario: validacao do sistema API
    Given que seja acessada a API "https://reqres.in/api/users/1"
    When for validado o valor do campo name que seja igual a "George"
    Then efetuado o teste de contrato ou schema