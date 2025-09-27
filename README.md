# Livros:
- [Livro Eng Soft Moderna CAP 5](https://engsoftmoderna.info/cap5.html)
- [Livro Eng Soft Moderna CAP 7](https://engsoftmoderna.info/cap7.html)
- [Livro Fundamentos da Arquitetura de Software](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2[%3Bvnd.vst.idref%3Dcover]!/4/2/2%4051:77)
- [Livro Código Limpo](https://integrada.minhabiblioteca.com.br/reader/books/9788550816043/pageid/0)
- [Livro Padrões de Projeto](https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0)
- [Site DESIGN PATTERNS](https://refactoring.guru/pt-br/design-patterns)
- [Introdução a DevOps](https://learn.microsoft.com/pt-br/training/modules/introduction-to-devops/2-what-is-devops?ns-enrollment-type=learningpath&ns-enrollment-id=learn.wwl.az-400-work-git-for-enterprise-devops )




# Aula 31/07/2025

# Abstração
O que é abstração? Abstração em Computação é o ato de entender um problema real e representá-lo no código.
Portanto, softwares tem o objetivo de abstrair a complexidade de problemas reais em partes menores para assim criar soluções para estes mesmos problemas, para isso utilizamos diversos tipos de classes, sendo elas: entidades, repositórios, serviços, controladores, etc... Dividimos o código em pedaços justamente para dividir a responsabilidade e facilitar a manutenção do sistema.
Instrumentos clássicos de abstração: funções, classes, interfaces, pacotes e bibliotecas.

# Um grande inimigo: Complexidade
- Dificuldades no entendimento da solução desejada;
- Potenciais bugs pela quantidade de coisas que devem ser levadas em consideração na criação do software;
- Desorganização do código do projeto;
- Objetos
- Para a resolução destes problemas, deve-se pensar em todas as partes deste sistema em objetos, seja seus dados(entidade), sua logica(service), o banco de dados(repository), a interface(controller) e as telas(interface).

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

SOLID é programar orientado a objetos do jeito correto.

- Single Responsbility Principle (Principo da Responsabilidade Única): Esse principio é uma aplicação direta da ideia de coesâo. Deve existir um único motivo para modificar qualquer classe em um sistema, ou seja, possui um objetivo concreto inalteravel.
  
- Open/Closed Principle (Padrão Aberto/Fechado): Uma classe deve estar aberta para extensões e fechada para modificações. Tem como objetivo a construção de classes flexíveis e extensíveis, capazes de se adaptarem a diversos cenários de uso, sem modificar seu código fonte.
  
- Liskov Substitutiom Principle (Princípio de Substituição de Liskov): Os filhos mantem a assinatura dos métodos que recebeu do pai. Isso permite realizar trocas (substituições) entre os filhos sem quebrar o código.
  
- Interface Segregation Principle (Principio da Segregação de Interfaces): Toda comunicação do nosso sistema deveria acontecer através de interfaces, e cada interface deveria ter uma Responsabilidade Única. Por exemplo, se eu quero registrar o click de um botão, é necessário uma interface para isso, se eu quero capturar o movimento do mouse, é necessário outra inteface.

- Dependency Inversion Principle (Principio de Inversão de Dependências): Uma classe cliente deve estabelecer dependências prioritariamente com abstrações e não com implementações concretas, pois abstrações (interfaces) são mais estáveis do que implementações concretas (classes). A ideia é então inverter as dependências: em vez de depender de classes concretas, clientes devem depender de interfaces. Fazer essa inversão reduz o acoplamento.

# Aula 11/08/2025

# Prefira Composição do que Herança
Herança expõe para subclasses detalhes da implementação das classes pai. Logo diz-se que herança viola o encapsulamento das classes pai. Uma solução para isso é utilizar Associação (composição)

Quando usar herança: As subclasses nunca irão substituir uma com a outra. Caso contrário é recomendado utilizar Associação.

# Demeter 
Todo método deve chamar APENAS os seguintes outros métodos:
- da sua própria classe
- de objetos passados como parâmetros (o famoso "()")
- de objetos criados pelo próprio método
- de atributos (variáveis) da classe do método

# Aula 14/08/1025

SOLID - Liskov

# Aula 18/08/2025

- DESIGN PATTERNS: São soluções que foram criadas e documentadas em linguagem orientada a objetos para resolver problemas comuns durante o desenvolvimento de sistemas
- Singleton: É uma variável única e global dentro do sistema, nunca poderá ter dois dele. É considerado um anti-pattern. Obs: eviter usar pois pode gerar débito técnico no futuro.

# Aula 28/08/2025

- Características da Arquitetura: São os requisitos não funcionais da Engenharia de Software (Disponibilidade, Segurança, Desempenho, Escalabilidade,etc...). É impossível escrever um programa que tenha todas as características arquiteturais, 100% certo, porém é de extrema importância hoje em dia priorizar Segurança do que os outros.

- Decisões da Arquitetura: É o arquiteto que toma as decisões de qual modelo de arquitetura o software vai utilizar, qual linguagem de programação, qual framework, etc...

- Princípios do Design: São as regras básicas para manter a arquitetura funcionando, são os conjuntos de boas práticas. É o SOLID, encapsulamento, baixo acoplamento, coesão e etc...

Quando o arquiteto comcluí esses 3 pilares, a estrutura base do software fica completa e pronta.

# Aula 01/09/2025

Expectativas de um Arquiteto de Software:
  
  - Tomar Decisões de Arquitetura: Orientação é a palavra de ordem em primeiro plano. Um arquiteto deve estabelecer as decisões da arquitetura e os princípios do design usados para orientar as decisões de tecnologia dentro da equipe.
  
  - Analisar Continuamente a Arquitetura: deve analisar continuamente a arquitetura e o ambiente de tecnologia atual, para então recomendar soluções de melhorias, pensar nas evoluções e aplicá-las.
  
  - Manter-se atualizado com as últimas tendências: Um arquiteto deve ficar atualizado com as últimas tendências da tecnologia.
  
  - Assegurar a conformidade com as decisões: Um arquiteto deve assegurar a conformidade com as decisões de arquitetura e os princípios de design. Significa que o arquiteto deve verificar continuamente se as equipes de desenvolvimento seguem as decisões da arquitetura e os princípios do design definidos, documentados e comunicados por ele.
  
  - Exposição e experiência com as decisões: Um arquiteto deve se expor a tecnologias, estruturas, plataformas e ambientes múltiplos e diversificados. Não significa que um arquiteto deve ser especialista em toda estrutura, plataforma e linguagem, mas deve estar familiarizado pelo menos com várias tecnologias.

  - Ter conhecimento sobre o domínio do negócio: Um arquiteto deve ter certo nível de especialização no domínio do negócio. Os arquitetos de software eficientes entendem não apenas de tecnologia, mas do domínio do negócio no espaço do problema. Sem conhecimento do domínio do negócio, fica difícil entender o problema comercial, as metas e os requisitos, complicando planejar uma arquitetura eficiente para atender aos requisitos da empresa.
  
  - Ter Habilidades Interpessoais: Um arquiteto deve ter habilidades interpessoais excepcionais, inclusive trabalho em equipe, facilitação e liderança. Um arquiteto não deve apenas dar uma orientação técnica para a equipe, mas também liderar as equipes de desenvolvimento na implementação da arquitetura.
  
  - Entender e Lidar Bem com Questões Políticas: Um arquiteto deve entender o clima político da empresa e conseguir lidar bem com ele.
 
# DevOps 
Entregar valor mais rápido possível ao cliente. 
Ciclo do DevOps também chamado de Continuous Integrations: Planejar -> Criar -> Integração Contínua -> Implantar -> Operar -> Comentários Contínuos (FeedBack do cliente final) -> Planejar (loop infinito).

Ao adotar práticas de DevOps:
- Reduz o tempo de ciclo trabalhando em lotes menores.
- Usa mais automação.
- Protege seu pipeline de lançamento.
- Melhora sua telemetria.
- Implanta com mais frequência.
  
# Aula 04/09/2025

Arquiteto vs Desenvolvedor: Um arquiteto é responsavel pela definição do sistema que será usado, padrões e estilos que serão utilizados, linguagem, etc. Já um desenvolvedor cuidará da parte interna depois da estruturação do projeto, os seus componentes que foram definidos. Nem sempre o que um arquiteto planejar vai funcionar da melhor forma na parte de desenvolvimento e nem sempre as aplicações que utilizarem no desenvolvimento vão estar dentro da definição inicial da arquitetura. Para que a arquitetura e desenvolvimento funcionem da melhor forma o ideal é fazer com que a relação entre eles seja bidirecional com comunicação constante para que as duas partes entrem em um consenso.

Arquitetura vs Design: Arquitetura é responsavel pelas caracteristicas do sistema, tanto como o estilo do sistema e as estruturas dos componentes. Design envolve a modelação das classes utilizadas no sistema, assim como interface do usuário e o contato direto com alterações no código-fonte.

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
- SETA VAZIA E LINHA PONTILHADA VIRA INTERFACE
- Interface não tem código, é um contrato que diz o código que deve ter.
- Static - É carregado por primeiro, antes de todas as outras coisa na memória.
