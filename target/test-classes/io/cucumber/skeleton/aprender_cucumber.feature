Feature: AprenderCucumber

  Scenario: Aprender Cucumber
    Given criei o arquivo corretamente
    When executá-lo
    Then especificação deve executar com sucesso

    Scenario: Deve incrementar contador
      Given que o valor do contador é 15
      When eu incrementar 3
      Then o valor será 18

  Scenario: Deve incrementar contador
    Given que o valor do contador é 20
    When eu incrementar 5
    Then o valor será 25

#  Scenario: Deve calcular atraso na entrega
#    Given que a entrega e 05/04/2022
#    When atrasar 2 dias
#    Then a entrega sera 07/04/2022
#
#  Scenario: Deve calcular atraso na entrega
#    Given que a entrega e 05/04/2022
#    When atrasar 2 meses
#    Then a entrega sera 03/04/2022

  Scenario: : Deve criar steps genéricos para estes passos
  Given que o ticket é "AF345"
  Given que o valor da passagem é R$ 230,45
  Given que o nome do passageiro é "Fulano da Silva"
  Given que o telefone do passageiro é 9999-9999
  When criar os steps
  Then o teste vai funcionar

  Scenario: : Deve reaproveitar os steps "Dado" do cenário anterior
  Given que o ticket é "AB167"
  Given que o ticket especial é "AB167"
  Given que o valor da passagem é R$ 1120,23
  Given que o nome do passageiro é "Cicrano de Oliveira"
  Given que o telefone do passageiro é 9888-8888

  Scenario: : Deve negar todos os steps "Dado" dos cenários anteriores
  Given que o ticket é "CD123"
  Given que o ticket é "AG1234"
  Given que o valor da passagem é R$ 11345,56
  Given que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
  Given que o telefone do passageiro é 1234-5678
  Given que o telefone do passageiro é 999-2223