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
Portanto, softwares tem o objetivo de abstrair a complexidade de problemas reais em partes menores para assim criar soluções para estes problemas. Para isso utilizamos diversos tipos de classes, sendo elas: entidades, repositórios, serviços, controladores, etc... Dividimos o código em pedaços justamente para dividir a responsabilidade e facilitar a manutenção do sistema.
Instrumentos clássicos de abstração: funções, classes, interfaces, pacotes e bibliotecas.

# Um grande inimigo: Complexidade
- Dificuldades no entendimento da solução desejada;
- Potenciais bugs pela quantidade de coisas que devem ser levadas em consideração na criação do software;
- Desorganização do código do projeto;
- Objetos;
- Para a resolução destes problemas, deve-se pensar em todas as partes deste sistema em objetos, seja seus dados(entidade), sua logica(service), o banco de dados(repository), a interface(controller) e as telas(interface).

# Conjunto de boas práticas

 - Padronizar nomenclatura de variáveis: Quando o sistema usa um padrão de nomes para variáveis (maiúsculas e minúsculas).

 - Identação: É importante aprender também como escrever seus códigos de forma legível, tanto para os outros, quanto para você mesmo, caso queira refatorar ou realizar a manutenção deles.

 - Frameworks (ex: Spring): É de suma importância escolher corretamente o Framework que você irá utilizar no seu software. Aprender ao menos um framework é importante para quem deseja trabalhar com desenvolvimento de softwares, pelas facilidades que estas ferramentas podem trazer futuramente, seja na criação de seus próprios projetos quanto na adaptabilidade de frameworks utilizados pelas empresas.

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
É basicamenta "amarrar" duas classes, em que uma depende da outra, se eu apagar algo da classe A por exemplo, ela afeta a classe B. Obs: é importânte tentar reduzir ao máximo os casos de acoplamento, porém nem sempre irá ser possível.

# Estrutura de dados
Assim como entender as partes das classes é importante, também é importante entender como estas variáveis objetos são guardadas e manuseadas. Como em filas, pilhas, árvores, grafos, métodos, laços, etc... 

# Flexibilidade de código
Cada código que um desenvolvedor escreve deve trazer consigo a possibilidade de ser modificado e adaptado facilmente sem que o código inteiro quebre. Por exemplo: Separar classes utilizando classes de interface que não carregam a lógica do sistema consigo, mas que podem ser substituídas futuramente.

# Aula 07/08/2025

SOLID é programar orientado a objetos do jeito correto.

- Single Responsbility Principle (Princípio da Responsabilidade Única): Esse princípio é uma aplicação direta da ideia de coesâo. Deve existir um único motivo para modificar qualquer classe em um sistema, ou seja, possuí um objetivo concreto inalterável.
  
- Open/Closed Principle (Padrão Aberto/Fechado): Uma classe deve estar aberta para extensões e fechada para modificações. Tem como objetivo a construção de classes flexíveis e extensíveis, capazes de se adaptarem a diversos cenários de uso, sem modificar seu código fonte.
  
- Liskov Substitutiom Principle (Princípio de Substituição de Liskov): Os filhos mantem a assinatura dos métodos que recebeu do pai. Isso permite realizar trocas (substituições) entre os filhos sem quebrar o código.
  
- Interface Segregation Principle (Princípio da Segregação de Interfaces): Toda comunicação do nosso sistema deve acontecer através de interfaces, e cada interface deveria ter uma Responsabilidade Única. Por exemplo, se eu quero registrar o click de um botão, é necessário uma interface para isso, se eu quero capturar o movimento do mouse, é necessário outra interface.

- Dependency Inversion Principle (Princípio da Inversão de Dependências): Uma classe cliente deve estabelecer dependências prioritariamente com abstrações e não com implementações concretas, pois abstrações (interfaces) são mais estáveis do que implementações concretas (classes). A ideia é então inverter as dependências: em vez de depender de classes concretas, clientes devem depender de interfaces. Fazer essa inversão reduz o acoplamento.

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

- DESIGN PATTERNS: São soluções que foram criadas e documentadas em linguagem orientada a objetos para resolver problemas comuns durante o desenvolvimento de sistemas.
- Singleton: É uma variável única e global dentro do sistema, nunca poderá ter dois dele. É considerado um anti-pattern. Obs: evitar usar pois pode gerar débito técnico no futuro.

# Aula 28/08/2025

- Características da Arquitetura: São os requisitos não funcionais da Engenharia de Software (Disponibilidade, Segurança, Desempenho, Escalabilidade,etc...). É impossível escrever um programa que tenha todas as características arquiteturais, 100% certo, porém é de extrema importância hoje em dia priorizar Segurança do que os outros.

- Decisões da Arquitetura: É o arquiteto que toma as decisões de qual modelo de arquitetura o software vai utilizar, qual linguagem de programação, qual framework, etc...

- Princípios do Design: São as regras básicas para manter a arquitetura funcionando, são os conjuntos de boas práticas. É o SOLID, encapsulamento, baixo acoplamento, coesão e etc...

Quando o arquiteto concluí esses 3 pilares, a estrutura base do software fica completa e pronta.

# Aula 01/09/2025

Expectativas de um Arquiteto de Software:
  
  - Tomar Decisões de Arquitetura: Orientação é a palavra de ordem em primeiro plano. Um arquiteto deve estabelecer as decisões da arquitetura e os princípios do design usados para orientar as decisões de tecnologia dentro da equipe.
  
  - Analisar Continuamente a Arquitetura: Deve analisar continuamente a arquitetura e o ambiente de tecnologia atual, para então recomendar soluções de melhorias, pensar nas evoluções e aplicá-las.
  
  - Manter-se atualizado com as últimas tendências: Um arquiteto deve ficar atualizado com as últimas tendências da tecnologia.
  
  - Assegurar a conformidade com as decisões: Um arquiteto deve assegurar a conformidade com as decisões de arquitetura e os princípios de design. Significa que o arquiteto deve verificar continuamente se as equipes de desenvolvimento seguem as decisões da arquitetura e os princípios do design definidos, documentados e comunicados por ele.
  
  - Exposição e experiência com as decisões: Um arquiteto deve se expor a tecnologias, estruturas, plataformas e ambientes múltiplos e diversificados. Não significa que um arquiteto deve ser especialista em toda estrutura, plataforma e linguagem, mas deve estar familiarizado pelo menos com várias tecnologias.

  - Ter conhecimento sobre o domínio do negócio: Um arquiteto deve ter certo nível de especialização no domínio do negócio. Os arquitetos de software eficientes entendem não apenas de tecnologia, mas do domínio do negócio no espaço do problema. Sem conhecimento do domínio do negócio, fica difícil entender o problema comercial, as metas e os requisitos, complicando planejar uma arquitetura eficiente para atender aos requisitos da empresa.
  
  - Ter Habilidades Interpessoais: Um arquiteto deve ter habilidades interpessoais excepcionais, inclusive trabalho em equipe, facilitação e liderança. Um arquiteto não deve apenas dar uma orientação técnica para a equipe, mas também liderar as equipes de desenvolvimento na implementação da arquitetura.
  
  - Entender e Lidar Bem com Questões Políticas: Um arquiteto deve entender o clima político da empresa e conseguir lidar bem com ele.
 
# DevOps 
Entregar valor mais rápido possível ao cliente. 
Ciclo do DevOps(também chamado de Continuous Integrations): Planejar -> Criar -> Integração Contínua -> Implantar -> Operar -> Comentários Contínuos (FeedBack do cliente final) -> Planejar (loop infinito).

Ao adotar práticas de DevOps:
- Reduz o tempo de ciclo trabalhando em lotes menores.
- Usa mais automação.
- Protege seu pipeline de lançamento.
- Melhora sua telemetria.
- Implanta com mais frequência.
  
# Aula 04/09/2025

Arquiteto vs Desenvolvedor: Um arquiteto é responsavel pela definição do sistema que será usado, padrões e estilos que serão utilizados, linguagem, etc. Já um desenvolvedor cuidará da parte interna depois da estruturação do projeto, os seus componentes que foram definidos. Nem sempre o que um arquiteto planejar vai funcionar da melhor forma na parte de desenvolvimento e nem sempre as aplicações que utilizarem no desenvolvimento vão estar dentro da definição inicial da arquitetura. Para que a arquitetura e desenvolvimento funcionem da melhor forma o ideal é fazer com que a relação entre eles seja bidirecional com comunicação constante para que as duas partes entrem em um consenso.

Arquitetura vs Design: Arquitetura é responsavel pelas caracteristicas do sistema, tanto como o estilo do sistema e as estruturas dos componentes. Design envolve a modelação das classes utilizadas no sistema, assim como interface do usuário e o contato direto com alterações no código-fonte.

Formação do conhecimento de um arquiteto modelo T: Um arquiteto de software deve ter uma boa amplitude técnica, ou seja, conhecer diversas áreas da programação. Porém ao mesmo tempo ele deve ter uma boa profundidade técnica, ou seja, conhecer bem cada área da programação de forma individual. Então, um bom arquiteto de software deve equilibrar seu conhecimento, saber muito e saber bem de cada coisa.

# Aula 08/09/2025

# Trade-offs

- Pensar como arquiteto é ver os trade-offs em toda solução, técnica ou outra, e analisá-las para determinar qual é a melhor solução.

# Tópico

- Um publisher envia uma mensagem para o Tópico (Broker) e todos os subscribers recebem a mesma mensagem. Ou seja, toda vez que alguém publica uma mensagem no tópico, todo mundo que está inscrito, todos os computadores ou sistemas recebem a mesma mensagem.

# Fila
- Um publisher (sender) envia uma mensagem para a Fila (caixinha de correio) e cada subscriber (receivers) deve ir até a Fila para receber a mensagem. A Fila armazena a mensagem e fica disponível para regaste o tempo todo.

# Diferença entre Tópio e Fila

- No Tópico temos menor acoplamento, porém o publisher precisa atender as necessidades de todos os subscribers. Já na Fila, o acoplamento é maior, porém o publisher (sender) consegue dividir a mensagem para atender apenas a necessidade específicas dos subscribers (receivers).



#  Outros conceitos importantes:
- Arquitetura MVC - Model, View, Control.
- API - Application Programming Interface.
- POO (básico) - Objetos contem informações (variáveis/atributos). Contém as ações = funções (métodos). Um objeto pode conter outros objetos (ManyToOne/OneToMany e etc). Em POO é possível representar qualquer coisa do mundo real.
- Desacoplamento - Quando o código é mais fácil de trocar/substituir.
- Classe - guardam o estado (variáveis que guardam informações (nome,email,telefone,etc)), e o comportamento (métodos e funções).
- Getter e Setter - serve para encapsular uma informação e consequentemente protegê-la.
- entity < dados
- repository < JPA spring data
- services < lógica(user cases)
- controller < api rest
- SETA FECHADA E LINHA CHEIA VIRA VARIÁVEL
- SETA VAZIA E LINHA CHEIA VIRA HERANÇA
- SETA VAZIA E LINHA PONTILHADA VIRA INTERFACE
- Interface não tem código, é um contrato que diz o código que deve ter.
- Static - É carregado por primeiro, antes de todas as outras coisas na memória.




# 2 BIMESTRE

# Aula 06/10/2025

# Definição das Características da Arquitetura de Software

A arquitetura de software vai além da definição dos requisitos funcionais, abrangendo também aspectos estruturais e operacionais que influenciam diretamente o sucesso do sistema. Esses aspectos são denominados características da arquitetura, e representam critérios de design essenciais que definem como o software deve operar e se comportar, independentemente das funções do domínio.

Uma característica da arquitetura deve:

- Especificar uma consideração de design fora do domínio do problema;
- Influenciar algum aspecto estrutural do design;
- Ser essencial ou importante para o sucesso da aplicação.
Essas características podem ser explícitas (descritas nos requisitos) ou implícitas (necessárias, mas não documentadas). Os arquitetos precisam identificá-las e equilibrá-las, pois cada decisão pode afetar outras áreas do sistema (trade-off).

As características se dividem em três grandes grupos:

- Operacionais: Relacionadas ao funcionamento e desempenho do sistema, como disponibilidade, continuidade, desempenho, recuperabilidade, confiabilidade, robustez e escalabilidade.
- Estruturais: Voltadas à qualidade interna do código, incluindo modularidade, manutenção, portabilidade, reutilização e capacidade de atualização.
- Transversais: Englobam requisitos de segurança, acessibilidade, legalidade, privacidade, usabilidade, autenticação e autorização, entre outros.

Não há uma lista universal dessas características, pois cada organização define as suas conforme o contexto e as necessidades do projeto. Entretanto, normas como as da ISO classificam-nas em categorias como desempenho, compatibilidade, usabilidade, confiabilidade, segurança, manutenibilidade e portabilidade.
Por fim, o arquiteto deve evitar buscar a “melhor” arquitetura, mas sim a arquitetura menos pior, ou seja, aquela que equilibra as necessidades do sistema com a complexidade do design. A arquitetura ideal é iterativa e adaptável, permitindo ajustes constantes conforme o software evolui.

# Aula 09/10/2025

# Padrão do Disjuntor 

O padrão Circuit Breaker ajuda a lidar com falhas que podem levar períodos variados para serem recuperadas quando um aplicativo se conecta a um serviço ou recurso remoto. Um disjuntor bloqueia temporariamente o acesso a um serviço com defeito após detectar falhas. Essa ação evita tentativas repetidas sem sucesso, permitindo que o sistema se recupere com eficácia. Esse padrão pode melhorar a estabilidade e a resiliência de um aplicativo.
Existem 3 estados do Circuit Breaker:

- Fechado: A solicitação do aplicativo é roteada para a operação. O proxy mantém uma contagem do número de falhas recentes. Se a chamada para a operação não for bem-sucedida, o proxy incrementa essa contagem. Se o número de falhas recentes exceder um limite especificado dentro de um determinado período, o proxy é colocado no estado Aberto e inicia um temporizador de tempo limite. Quando o temporizador expira, o proxy é colocado no estado Meio Aberto .

- Aberto: A solicitação do aplicativo falha imediatamente e uma exceção é retornada ao aplicativo.

- Meio-Aberto: Um número limitado de solicitações da aplicação pode passar e invocar a operação. Se essas solicitações forem bem-sucedidas, o disjuntor assume que a falha que causou a falha foi corrigida e o disjuntor comuta para o estado Fechado . O contador de falhas é zerado. Se alguma solicitação falhar, o disjuntor assume que a falha ainda está presente e, portanto, retorna ao estado Aberto . Ele reinicia o temporizador de tempo limite para que o sistema possa se recuperar da falha.

![Circuit-Breaker](imagens/circuit-breaker-diagram.png)

# Aula 13/10/2025

# Command Query Responsibility Segregation (CQRS)

É um padrão de design que segrega operações de leitura e gravação de um armazenamento de dados em modelos de dados separados. Essa abordagem permite que cada modelo seja otimizado de forma independente e pode melhorar o desempenho, a escalabilidade e a segurança de um aplicativo. Ou seja, divide as operações de escrita e leitura em dois bancos de dados, dividindo a carga para os dois bancos.

Benefícios do CQRS:

- Dimensionamento independente: O CQRS permite que os modelos de leitura e os modelos de gravação sejam dimensionados de forma independente. Essa abordagem pode ajudar a minimizar a contenção de bloqueio e melhorar o desempenho do sistema sob carga.
- Esquemas de dados otimizados: As operações de leitura podem usar um esquema otimizado para consultas. As operações de gravação usam um esquema otimizado para atualizações.
- Segurança: Ao separar leituras e gravações, você pode garantir que somente as entidades ou operações de domínio apropriadas tenham permissão para executar ações de gravação nos dados.
- Separação de preocupações: Separar as responsabilidades de leitura e gravação resulta em modelos mais limpos e mantenedíveis. O lado de gravação normalmente lida com a lógica de negócios complexa. O lado de leitura pode permanecer simples e focado na eficiência das consultas.
- Consultas mais simples: Quando você armazena uma exibição materializada no banco de dados de leitura, o aplicativo pode evitar junções complexas quando consulta.

Problemas do CQRS:

- Maior complexidade: O conceito principal do CQRS é simples, mas pode introduzir uma complexidade significativa no design do aplicativo, especificamente quando combinado com o padrão de Fornecimento de Eventos.
- Desafios de mensagens: O sistema de mensagens não é um requisito para o CQRS, mas geralmente você o usa para processar comandos e publicar eventos de atualização. Quando as mensagens são incluídas, o sistema deve considerar possíveis problemas, como falhas de mensagem, duplicatas e novas tentativas. Para obter mais informações sobre estratégias para lidar com comandos que têm prioridades variadas, consulte As filas de prioridade.
- Consistência eventual: Quando os bancos de dados de leitura e os bancos de dados de gravação são separados, os dados de leitura podem não mostrar as alterações mais recentes imediatamente. Esse atraso resulta em dados obsoletos. Garantir que o repositório de modelos de leitura permaneça atualizado com as alterações no repositório de modelos de gravação pode ser desafiador. Além disso, detectar e manipular cenários em que um usuário age em dados obsoletos requer uma consideração cuidadosa.
