# Resumo: O que todo Dev Júnior/Estagiário BACKEND deve saber

Este é um resumo estruturado baseado na transcrição do vídeo, destacando os conhecimentos essenciais, diferenciais e novas habilidades esperadas pelo mercado, com breves explicações sobre cada conceito citado.

---

## 🚀 Os Fundamentos Essenciais
O mínimo necessário para você conseguir as primeiras vagas (estágio ou júnior).

### 1. Dominar bem uma linguagem
* **O que deve-se saber:** Focar e se aprofundar em apenas uma linguagem no início (ex: Java, C#, Python) em vez de tentar aprender várias ao mesmo tempo.
* **O que saber dentro deste tópico:**
  - **Estrutura de dados básica:** Manipulação e organização de dados (listas, árvores etc.) usando a linguagem.
  - **Programação Orientada a Objetos (POO):** *Um paradigma de programação baseado na criação de "objetos" que contêm propriedades e métodos. Facilita o reuso de código.* Focar nos quatro pilares: Herança, Polimorfismo, Encapsulamento, Abstração.
  - **Princípios SOLID:** *Um acrônimo de 5 princípios de design de software que ajudam a escrever códigos mais limpos e menos dependentes entre si.* Focar principalmente em Single Responsibility (Responsabilidade Única) e Injeção de Dependências.

### 2. Aplicações Web
* **O que deve-se saber:** Como construir o back-end para a internet e entender comunicação web.
* **O que saber dentro deste tópico:**
  - **Frameworks Web:** Domínio prático do framework da linguagem (Ex: Spring, no caso do Java - *uma ferramenta que abstrai rotinas complexas e agiliza a criação da aplicação*).
  - **Autenticação JWT (JSON Web Token):** *Um padrão que cria um token digital assinado para garantir de forma segura a identidade de um usuário ao longo da sua navegação na aplicação web.*
  - **Requisições HTTP(s) e APIs:** HTTP é o *protocolo base da comunicação web (métodos GET, POST, etc).* Entender como o back-end se comunica com serviços de terceiros (ex: chamadas a APIs de cálculo de frete, pagamentos).

### 3. Testes Unitários
* **O que deve-se saber:** Testar de forma automatizada pedaços de código é vital, as empresas cobram isso desde o início.
* **O que saber dentro deste tópico:**
  - **Escrita de testes:** Como fazer e rodar na sua IDE, garantindo que o seu código faz o que promete.
  - **Mocks:** *São objetos "falsos" ou simulados elaborados para o teste. Servem para você testar a lógica do seu código isoladamente, simulando conexões com serviços externos ou banco de dados.*
  - **Integração com o Framework:** Entender as ferramentas (ex: anotações do Spring) usadas no seu ecossistema.

### 4. Soft Skills & Empregabilidade
* **O que deve-se saber:** Habilidades comportamentais e apresentação profissional são decisivos na seleção.
* **O que saber dentro deste tópico:**
  - **Habilidade de entrevista e currículo:** *Saber falar tecnicamente, demonstrar valor e saber treinar para as rodadas dos processos seletivos.*
  - **LinkedIn:** Manter uma vitrine profissional coerente.
  - *(O vídeo sugere buscar materiais/cursos focados no roadmap de carreira, pois só saber tecnologia não garante a vaga).*

---

## 🌟 Diferenciais Técnicos
Ter de dois a três pontos listados abaixo fará você se destacar além dos outros candidatos de entrada.

### 5. Docker e Containerização
* **O que deve-se saber:** Como empacotar sua aplicação e não depender das instalações locais ("na minha máquina funciona").
* **O que saber dentro deste tópico:** 
  - **Docker (Containers):** *Ferramenta que empacota, de forma isolada, seu código e as configurações que ele precisa para existir. Para rodar em qualquer lugar sem dor de cabeça.*
  - Conectar seu código num banco de dados que esteja rodando via Docker.
  - **Docker Hub:** *Um ambiente em nuvem público, semelhante a um catálogo, para você fazer o upload da sua imagem Docker pronta.*

### 6. Sistema de Mensageria (Filas)
* **O que deve-se saber:** Lidar com requisições intensas sem derrubar o sistema.
* **O que saber dentro deste tópico:** 
  - **Apache Kafka / RabbitMQ:** *Softwares de mensageria que enfileiram processos. Em vez da aplicação ter que realizar todas as tarefas na mesma hora correndo o risco de travar (ou perder requisição), as tarefas são salvas em filas seguras.*
  - **Producer & Consumer:** A arquitetura em que uma parte do sistema *Gera/Produz* os eventos para a fila, e outra *Consome* para executá-los em segurança no seu ritmo.

### 7. Cloud Computing (Nuvem / AWS)
* **O que deve-se saber:** Como hospedar recursos num grande provedor online.
* **O que saber dentro deste tópico:**
  - **AWS (Amazon Web Services):** *O maior provedor de computação em nuvem.*
  - **EC2:** *Serviço de servidores/máquinas virtuais.*
  - **S3:** *Serviço de discos de armazenamento (para imagens, arquivos).*
  - **RDS e DynamoDB:** *Bancos de dados instalados dentro da nuvem (relacionais e não-relacionais, respectivamente).*
  - **SNS/SQS:** Serviços de notificação e fila próprios deles.
  - *Certificação Practitioner:* Uma das certificações da AWS que atesta que o candidato compreende a base do provedor.

### 8. Bancos Não Relacionais e Cache
* **O que deve-se saber:** Tecnologias para dar muito mais velocidade ao sistema.
* **O que saber dentro deste tópico:**
  - **Cache (Redis / Memcached):** *Bancos rápidos em memória RAM, em formato "chave e valor". Salvam resultados temporários de pesquisas muito usadas, evitando que sua aplicação precise ir até o banco de dados lento e pesado o tempo todo.*

### 9. DevOps e Pipeline CI/CD
* **O que deve-se saber:** A união entre o mundo de Desenvolvedores e o time de Operações/Infraestrutura.
* **O que saber dentro deste tópico:**
  - **CI / CD:** *Continuous Integration e Continuous Delivery. É uma automação de tarefas. Assim que você envia seu código ao Github, robôs na pipeline vão testar seu código sozinho, conferir se a qualidade está boa e, se estiver, implantar a alteração do produto na nuvem para o cliente final.*

### 10. Microsserviços e System Design
* **O que deve-se saber:** Projetar como as gigantes processam milhões de acessos.
* **O que saber dentro deste tópico:**
  - **System Design:** *Prática e estudo para arquitetar softwares modernos (Onde boto a Nuvem? Qual o tipo do Banco de Dados? Como os dados fluem).*
  - **Microsserviços:** *Estratégia de picotar um sistema que antes era "um mega blocão de código" num monte de pequenos sistemas que trabalham sozinhos. Ajuda pois, se um pedaço quebrar, o sistema inteiro não sai fora do ar.*

### 11. Concorrência e Paralelismo
* **O que deve-se saber:** Processamento múltiplo para as rotinas do programa.
* **O que saber dentro deste tópico:**
  - Entender as regras e travas (como a **Atomicidade de Transação**) para evitar que duas requisições conflitem ou sobrescrevam dados no banco ao mesmo tempo.
  - **I/O e Rotinas concorrentes:** Usar recursos das linguagens (ex: *Coroutines*) para rodar pequenas tarefas paralelas para maximizar consumo de CPU ou poupar tempo esperando resposta numa requisição externa.

### 12. Expandir Horizontes (Full-Stack)
* **O que deve-se saber:** Um backend de elite entende a paisagem a sua volta.
* **O que saber dentro deste tópico:**
  - Um backend saber o básico de como o front-end consome informações, e até ter noções de ferramentas focadas em Ciência de Dados (ex: Databricks) fortalece muito o ponto de vista durante decisões de um novo cargo.

---

## 🤖 Conceitos Extras: A Era da IA
Dominar as tecnologias de inteligência artificial eleva sua base a outro patamar e será cada vez mais exigência de empresas inovadoras.

### 13. IAs na Rotina DEV
* **O que deve-se saber:** Passar do uso superficial para o técnico aprofundado, que produz resultados precisos em massa.
* **O que saber dentro deste tópico:**
  - **LLM (Large Language Model):** *Modelos fundacionais geradores de texto e lógica em que as IAs operam.*
  - **MCP (Model Context Protocol):** *Um protocolo criado para integrar IAs aos dados e às ferramentas de suas aplicações atuais, permitindo que as IAs recebam os detalhes internos da sua infraestrutura como contexto para ajudar outras pessoas ou gerarem automações corretas.*
  - **RAG (Retrieval-Augmented Generation):** *Processo de fornecer à IA um material base (documentos, bases, guias do seu código) que ela precisa ler e interpretar antes de gerar uma resposta, assim a resposta gerada será útil diretamente para a sua realidade.*
  - **Rule Sets (Em IDEs como Cursor, Copilot, etc):** *Configurações pré estabelecidas ou regras permanentes aplicadas aos robôs na IDE para dizer como ele deve formatar ou criar novas partes do seu software com base nas suas boas práticas particulares.*
  - **Engenharia de Prompt:** *A técnica de moldar pedidos com altíssima minúcia para treinar e obter respostas estruturadas da máquina em vez da frustração.*