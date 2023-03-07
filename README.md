# blog-do-agi
Como profissional da área de qualidade, fui designada para automatizar os dois principais cenários de teste de uma funcionalidade no website blog do Agi:
https://blogdoagi.com.br/

A funcionalidade é a pesquisa de artigos do blog com a lupa no canto superior esquerdo e os dois principais cenários de teste foram:                                
- CT01: pesquisar preenchendo o campo de busca com palavra chave.
- CT02: pesquisar sem preencher o campo de busca.

Criei um projeto de automação Web em linguagem Java utilizando Selenium na IDE Eclipse e as boas práticas, como o Page Object para tornar o código limpo, de fácil navegação e reutilização, e a escrita em Gherkin através da integração com o Cucumber para facilitar o entendimento e otimizar o tempo.

Na pasta ***src/test/java*** o projeto foi separado em packges para: 
- métodos: contendo métodos necessários para realizar ações durante o teste;
- elementos: listando todos os elementos necessários para interagir com a funcionalidade nesses cenários de testes;
- drivers: contendo as conexões necessárias, neste caso, a classe WebDriver do Selenium;
- runner: com as configurações do RunWith e CucumberOptions e o método "abrirNavegador", para inicializar os testes e 
- testes: com os steps gerados e a implementação dos testes.

Já na pasta ***src/test/resources*** encontra-se o arquivo de feature com os cenários de testes.

Nas demais pastas você encontra arquivos como driver utilizado, pom.xml e cucumber report. Clonando o projeto em seu dispositivo conseguirá ver o teste funcionar e fazer as validações através de alguma IDE de sua preferência que seja compatível com as tecnologias utilizadas.
