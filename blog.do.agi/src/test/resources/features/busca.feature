@tag
Feature: Realizar pesquisa através da lupa
  Como usuario desejo fazer uma pesquisa no blog da agi

 
  Background: acessar o site do blog da agi
    Given que eu esteja no "https://blogdoagi.com.br/"
  
  Scenario: pesquisar preenchendo o campo de busca com palavra chave
    And clico na lupa
    When preencher o campo de busca
    And realizar a busca
    Then valido o resultado da busca
   
 
  Scenario: pesquisar sem preencher o campo de busca
    And clicar na lupa
    When realizo a busca com o campo vazio
    Then verifico o resultado da busca
   