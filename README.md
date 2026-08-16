# Produtos API

Esta é uma API RESTful para gerenciamento de produtos, desenvolvida como parte das atividades práticas do curso **"Java COMPLETO Programação Orientada a Objetos + Projetos"** do professor **Nelio Alves**.

## 🚀 Tecnologias Utilizadas

O projeto utiliza o ecossistema Spring Boot com as seguintes tecnologias:

*   **Java 21**
*   **Spring Boot 3.2.5**
*   **Spring Data JPA** (para persistência de dados)
*   **Spring Web** (para construção da API REST)
*   **H2 Database** (banco de dados em memória para desenvolvimento)
*   **Lombok** (para reduzir código boilerplate)
*   **Maven** (gerenciador de dependências)

## 🛠️ Como Executar o Projeto

Certifique-se de ter o **JDK 21** instalado em sua máquina.

1.  **Clone o repositório:**
    ```bash
    git clone git@github.com:Theyvison/api-produtos-spring.git
    cd produtosapi
    ```

2.  **Execute o projeto usando o Maven Wrapper:**
    ```bash
    ./mvnw spring-boot:run
    ```
    *(No Windows, utilize `mvnw.cmd spring-boot:run`)*

3.  **Acesse a API:**
    Após a inicialização, a API estará disponível em `http://localhost:8080`.

4.  **Console do H2:**
    Você pode acessar o console do H2 Database em `http://localhost:8080/h2-console` para visualizar o banco de dados.
    *   **JDBC URL:** `jdbc:h2:mem:produtos`
    *   **User Name:** `sa`
    *   **Password:** `123`

---
Desenvolvido por Theyvison Santos

Curso: *Java COMPLETO Programação Orientada a Objetos + Projetos* - Prof. Nelio Alves.
