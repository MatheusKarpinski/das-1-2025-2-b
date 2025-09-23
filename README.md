# Livros:
- [Livro Eng Soft Moderna CAP 5](https://engsoftmoderna.info/cap5.html)
- [Livro Eng Soft Moderna CAP 7](https://engsoftmoderna.info/cap7.html)
- [Livro Fundamentos da Arquitetura de Software](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2[%3Bvnd.vst.idref%3Dcover]!/4/2/2%4051:77)



# Aula 31/07/2025

# Abstração
O que é abstração? Abstração em Computação é o ato de entender um problema real e representá-lo no código.
Portanto, softwares tem o objetivo de abstrair a complexidade de problemas reais em partes menores para assim criar soluções para estes mesmos problemas, para isso utilizamos diversos tipos de classes, sendo elas: entidades, repositórios, serviços, controladores, etc... Dividimos o código em pedaços justamente para dividir a responsabilidade e facilitar a manutenção do sistema.
Instrumentos clássicos de abstração: funções, classes, interfaces, pacotes e bibliotecas.

# Um grande inimigo: Complexidade
Dificuldades no entendimento da solução desejada;
Potenciais bugs pela quantidade de coisas que devem ser levadas em consideração na criação do software;
Desorganização do código do projeto;
Objetos
Para a resolução destes problemas, deve-se pensar em todas as partes deste sistema em objetos, seja seus dados(entidade), sua logica(service), o banco de dados(repository), a interface(controller) e as telas(interface).

# Conjunto de boas práticas

 - Padronizar nomenclatura de variáveis: Quando o sistema usa padrão de nomes para variáveis (maiusculas e minusculas).

 - Identação: É importante aprender também como escrever seus códigos de forma que fique legível tanto para os outros quanto para você mesmo caso queira refatorar ou realizar a manutenção de seus códigos.

 - Frameworks (ex: Spring): É de suma importância escolher corretamente o Framework que você irar utilizar no seu software. Aprender ao menos um framework é importante para quem deseja trabalhar com desenvolvimento de softwares, pelas facilidades que estas  ferramentas podem trazer futuramente, seja na criação de seus próprios projetos quanto na adaptabilidade de frameworks utilizados pelas empresas.

# Ocultamento de Informações
Projetamos o sistema, fizemos as abstrações, escondemos as informações (complexidade) através da API e expomos apenas a Interface para o consumidor final. Na POO esse ocultamento ocorre nas Classes (ex: quando colocamos Private nela). 
Vantagens do Ocultamento de Informações:
 - Desenvolvimento em paralelo
 - Flexibilidade a mudanças
 - Facilidade de entendimento

# Aula 04/08/2025

# Coesão
Coesão é uma característica essencial na programação: cada classe ou método deve ser responsável por apenas uma funcionalidade ou serviço, contendo apenas o código necessário para executar bem uma tarefa.
Vantagens da coesão:
- Facilita a implementação de uma classe, bem como o seu entendimento e manutenção
- Facilita a alocação de um único responsável por manter uma classe
- Facilita o reúso e teste de uma classe, pois é mais simples reusar e testar uma classe coesa do que uma classe com várias responsabilidades

# Acoplamento
É basicamenta "amarrar" duas classes, em que uma depende da outra, se eu apagar algo da classe A por exemplo, ela afeta a classe B. Obs: é importânte tentar reduzir ao máxima os casos de acoplamento, porém nem sempre irá ser possível.

# Estrutura de dados
Assim como entender as partes das classes é importante, também é importante entender como estas variáveis objetos são guardadas e manuseadas Como em filas, pilhas, arvores, grafos, métodos, laços, etc... 

# Flexibilidade de código
Cada código que um desenvolvedor escreve deve trazer consigo a possibilidade de ser modificado e adaptado facilmente sem que o código inteiro quebre. Por exemplo: Separar classes utilizando classes de interface que não carregam a lógica do sistema consigo mas que podem ser substituídas futuramente.

# Aula 07/08/2025

SOLID = programar orientado a objetos do jeito certo.

Single Responsbility Principle (Principo da Responsabilidade Única): Esse principio é uma aplicação direta da ideia de coesâo. Deve existir um único motivo para modificar qualquer classe em um sistema, ou seja, possui um objetivo concreto inalteravel.
Open/Closed Principle
Liskov Substitutiom Principle
Interface Segregation Principle (Principio da Segregação de Interfaces): Toda comunicação do nosso sistema deveria acontecer através de interfaces, e cada interface deveria ter uma Responsabilidade Única. Por exemplo, se eu quero registrar o click de um botão, é necessário uma interface para isso, se eu quero capturar o movimento do mouse, é necessário outra inteface.
Dependency Inversion Principle

DESIGN PATTERNS são soluções fáceis

# Aula 11/08/2025

Principio de inversão de dependencias ao inves de depender de uma classe concreta você depende da interface - uma interface é uma dependecia com abstração - classe cliente é um controlador - serviceimpl implementações concretas  
Controlador > ClienteServ < ClientServiceIMPL
              save(c)
              delete(c)
              
Herança não é solução para todos os problemas

Demeter -> um método pode chamar APENAS os seguintes outros métodos:
          - da sua própria classe
          - de objetos passados como parâmetros (o famoso "()")
          - de objetos criados pelo próprio método
          - de atributos (variáveis) da classe do método

Padrão Aberto/Fechado -> a classe deve estar aberta para extensões e fechada para modificações. Tem como objetivo a construção de classes flexíveis e extensíveis, capazes de se adaptarem a diversos cenários de uso, sem modificar seu código fonte.
Interface não tem código, é um contrato que diz o código que deve ter

# Aula 18/08/2025

SOLID - Princípio de Liskov substituir um filho por outro sem ter percas

static - é carregado primeiro na memória


# Aula 01/09/2025

Características da arquitetura são requisitos não funcionais

Expectativas de um Arquiteto de Software:

  -Tomar Decisões de Arquitetura: Orientação é a palavra de ordem em primeiro plano. Ele(arquiteto) é o cabeça da equipe e por isso orienta o que eles devem fazer.
  
  -Analisar Continuamente a Arquitetura (software é vivo): deve analisar continuamente a arquitetura e o ambiente de tecnologia atual, para então recomendar soluções de melhorias. Pensar nas evoluções e aplicá-las
  -Manter-se atualizado com as últimas tendências
  
  -Assegurar a conformidade com as decisões
  
  -Exposição e experiência com as decisões

  -Ter conhecimento sobre o domínio do negócio
  
  -Ter Habilidades Interpessoais: trabalho em equipe, facilitação e liderança. Um arquiteto não deve apenas dar uma orientação técnica para a equipe, mas também liderar as equipes de desenvolvimento na implementação da arquitetura.
  
  -Entender e Lidar Bem com Questões Políticas: Um arquiteto deve entender o clima político da empresa e conseguir lidar bem com ele.
  
Manter-se Atualizado com as Últimas Tendências: Um arquiteto deve ficar atualizado com as últimas tendências da tecnologia.

Assegurar a Conformidade com as Decisões: Análise Estática de Código é uma das ferramentas para assegurar suas decisões.

Ter Conhecimento sobre o Domínio do Negócio: conhecimento técnico amplo e prático, além de um bom conhecimento

DevOps: entregar valor mais rápido possível ao cliente. 
Continuous Integrations: Planejar -> Criar -> Integração Contínua -> Implantar -> Operar -> Comentários Contínuos (FeedBack do cliente final) -> Planejar (DevOps é um loop infinito).
Ao adotar práticas de DevOps:
  -Você reduz o tempo de ciclo trabalhando em lotes menores.
  
  -Usando mais automação.
  
  -Protegendo seu pipeline de lançamento.
  
  -Melhorando sua telemetria.
  
  -Implantação com mais frequência.
  
https://learn.microsoft.com/pt-br/training/modules/introduction-to-devops/2-what-is-devops?ns-enrollment-type=learningpath&ns-enrollment-id=learn.wwl.az-400-work-git-for-enterprise-devops 


# Aula 04/09/2025

Arquiteto vs Desenvolvedor: Um arquiteto é responsavel pela definição do sistema que será usado, padrões e estilos que serão utilizados, linguagem, etc. Ja um desenvolvedor cuidará da parte interna depois da estruturação do projeto, os seus componentes que foram definidos. Nem sempre o que um arquiteto planejar vai funcionar da melhor forma na parte de desenvolvimento e nem sempre as aplicações que utilizarem no desenvolvimento vão estar dentro da definição inicial da arquitetura, para que a arquitetura e desenvolvimento funcionem da melhor forma o ideal é fazer com que a relação entre eles seja bidirecional com comunicação constante para as duas partes se adequem em um consenso.

Arquitetura vs Design: Arquitetura é responsavel pelas caracteristicas do sistema, tanto como o estilo do sistema e as estruturas dos componentes. Design envolve a modeluação das classes utilizadas no sistema, assim como interface do usuario e contato direto com alterações no código-fonte.

Como é a formação do conhecimento de um arquiteto modelo T: Um arquiteto de software deve ter uma boa amplitude técnica, ou seja, conhecer diversas áreas da programação. Porém ao mesmo tempo ele deve ter uma boa profundidade técnica, ou seja, conhecer bem cada área da programação de forma individual. Então, um bom arquiteto de software deve equilibrar seu conhecimento, saber muito e saber bem de cada coisa.




#  Outros conceitos importantes:
- Arquitetura MVC - Model, View, Control
- API - Application Programming Interface
- POO (básico) - Objetos contem informações (variáveis/atributos). Contem as ações = funções (métodos). Um objeto pode conter outros objetos (ManyToOne/OneToMany e etc). Em POO é possível representar qualquer coisa do mundo real
- Desacoplamento - Quando o código é mais fácil de trocar/substituir.
- Classe - guardam o estado (variáveis que guardam informações (nome,email,telefone,etc)), e o comportamento (métodos e funções)
- Getter e Setter - serve para encapsular uma informação e consequentemente protegê-la
- entity < dados
- repository < JPA spring data
- services < lógica(user cases)
- controller < api rest
- SETA FECHADA E LINHA CHEIA VIRA VARIAVEL
- SETA VAZIA E LINHA CHEIA VIRA HERANÇA
- SETA VAZIA LINHA PONTILHADA VIRA INTERFACE
