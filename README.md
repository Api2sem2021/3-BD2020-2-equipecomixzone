# cadastro-mais
![Arquitetura Macro](https://github.com/pi-fatec-bd/cadastro-mais/blob/master/Arquitetura%20Macro.png)
## 1. Front-end

### 1.1. View
Camada única do front-end com nenhuma regra de negócio.
    
## 2. Back-end

### 2.1. REST Controller
Camada dos controllers seguindo o padrão REST
    
### 2.2. Model
Camada do Model concentrando as regras de negócio, DTOs, serviços e entidades.
    
### 2.2.1. DTO
Camada para transformação das entidades em modelos adaptados para o front-end.
    
### 2.2.2. Service
Camada de regra de negócio que envolve duas ou mais entidades.
    
### 2.2.3. Entity
Camada refletindo as entidades do banco de dados, concentrando as regras de negócios referente as entidades e conexões com o banco de dados
    
## 3. DB
Banco de dados

## 4. Backlog

### Requisitos Funcionais (Story Cards)

**R01.** Como PF (pessoa física), o usuário pode se cadastrar no Cadastro Mais através da tela de cadastro;

**R02.** Como PF (pessoa física), o usuário pode se descadastrar no Cadastro Mais;

**R03.** Como PF (pessoa física), o usuário pode consultar seu score;

**R04.** Como PF (pessoa física), o usuário deve ser capaz de entender  seu score;

**R05.** Como PF (pessoa física), o usuário pode consultar seus dados (endereço, informações de contato, dívidas e pagamentos realizados) no cadastro positivo;

**R06.** Como PF (pessoa física), o usuário deve ser capaz incluir pagamentos;

**R07.** Como PF (pessoa física), o usuário pode bloquear a visualização dos seus dados (com exceção do score) para uma empresa específica;

**R08.** Como PF (pessoa física), o usuário consegue bloquear a visualização dos seus dados (com exceção do score) para todas as empresas;

**R09.** Como PF (pessoa física), o usuário pode consultar o score de CPFs de terceiros;

**R10.** Como PF (pessoa física), o usuário pode consultar os dados (endereço, informações de contato, situação do CPF na receita, dívidas e pagamentos realizados) de CPFs de terceiros caso estes estejam disponíveis;

**R11.** Como PF (pessoa física), o usuário pode consultar um gráfico de evolução do seu score por mês;

**R12.** Como PF (pessoa física), o usuário pode consultar gráficos de pagamentos realizados ( valor /mês e quantidade de pagamentos/mês);

**R13.** Como PF (pessoa física), o usuário com score baixo receberá dicas para sair da situação de dívida e indicação de produtos de consultoria financeira;

**R14.** Como PF (pessoa física), o usuário com score médio/alto receberá dicas de empresas que podem oferecer produtos do interesse dele de acordo com o seu perfil de compras;

**R15.** Como PJ (pessoa jurídica), o usuário pode se cadastrar no cadastro positivo;

**R16.** Como PJ (pessoa jurídica), o usuário pode se descadastrar no cadastro positivo;

**R17.** Como PJ (pessoa jurídica), o usuário pode consultar o score de CPFs de terceiros;

**R18.** Como PJ (pessoa jurídica), o usuário pode consultar o dados (endereço, informações de contato, situação do CPF na receita, dívidas e pagamentos realizados) de CPFs de terceiros se eles estiverem desbloqueados;

**R19.** Como PJ (pessoa jurídica), o usuário deve entender o que significa o score e como ele é calculado;

**R20.** Como PF (pessoa física) ou PJ (pessoa jurídica), o usuário pode consultar uma base de dados de perguntas comuns ou base de conhecimento;

### Requisitos não funcionais

**R21.** Linguagem programação (Stack) Java - Requisito Fatec;

**R22.** Banco de dados relacional - Requisito Fatec;

**R23.** Plano de negócio (forma de venda e monetização da informação);

**R24.** Sistema estruturado para tratar grande volume de dados;

**R25.** Regras de negócio parametrizáveis para adequação rápida às novas normas;

**R26.** Camadas de integração explícitas no projeto;

**R27.** Atender à legislação do cadastro positivo;

**R28.** As informações devem ser apresentadas de forma organizada, amigável e intuitiva;

**R29.** Os relatórios não poderão apresentar informações pessoais, confidenciais ou sigilosas;

**R30.** O design consistente e padronizado;

**R31.** Prevenção de erros;

**R32.** Ajuda e documentação do produto;
