Feature: Alugar Filme
  Como um usuario
  Eu quero cadastrar alugueis de filmes
  Para controlar precos e datas de entrega

  Scenario:Deve alugar um filme com sucesso
    Given um filme com estoque de 2 unidades
    And que o preco do aluguel seja R$ 3
    When alugar "filme"
    Then o preco do aluguel sera R$ 3
    And a data de entrega sera no dia seguinte
    And estoque do filme sera 1 unidade

    Scenario: Nao deve alugar filme sem estoque
      Given um filme com estoque de 0 unidades
      When alugar "filme"
      Then nao sera possivel por falta de estoque
      And estoque do filme sera 0 unidade

      Scenario: Deve dar condicoes especiais para categoria extendida
        Given um filme com estoque de 2 unidades
        And que o preco do aluguel seja R$ 4
        And que o tipo de aluguel seja extendido
        When alugar "filme"
        Then o preco do aluguel sera R$ 8
        And a data da entrega sera em 3 dias
        And a pontuacao sera de 2 pontos
