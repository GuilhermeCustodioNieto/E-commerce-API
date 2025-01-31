### **API de E-Commerce**

---

# **API de E-Commerce**

Este projeto é uma API de E-Commerce que permite ao usuário tenha pedidos de produtos e pagamentos de forma simulada. 

---

## **Arquitetura do Projeto**

A arquitetura é baseada na **arquitetura em camadas** para o backend. 

### **Estrutura Geral**
```
E-Commerce-API/
  ├── src/
  │   ├── main/
  │       ├── java/com/guilhermecustodionieto/demo/
  │         ├── config/
  │         ├── entities/
  │           ├── enums/
  │           ├── pk/
  │         ├── repositories/
  │         ├── resources/
  │           ├── repositories/
  │         ├── services/
  │           ├── exceptions/
  │         ├── DemoApplication.java
  │     ├── resources/
  │       ├── arquivos .properties
  │   ├── test/
  └── README.md
```

### **Backend: Detalhes**
- **`DemoApplication.java`**: Arquivo principal do projeto.
- **`Arquivos .properties`**: Propriedades de conexão com banco de dados e do estado do projeto.
- **Configurações (`config/`)**: Define as configurações para teste da aplicação.
- **Entidades (`entities/`)**: Define as entidades da aplicação como o usuário, o pedido, os produtos e etc.
- **Repositórios (`repositories/`)**: Representam as tabelas no banco de dados e gerenciam as operações CRUD.
- **Controladores (`resources/`)**: Define os endpoints da aplicação.
- **Serviços (`services/`)**: Controla as regras de negócio da aplicação.


#### Imagens dos Diagramas
- Diagrama de Classes

<img src="Diagrama de Classes.png" alt="Diagrama de Classes">

- Arquitetura

<img src="extra\arquitetura.png" alt="Arquitetura">

---

## **Funcionalidades**
### **Backend**
- Gerenciamento de usuários: Criar, listar, editar e excluir usuários.
- Cadastro de produtos: Listar os produtos do sistema.
- Gestão de pedidos: Listar os pedidos do sistema.
- Gestão de categorias de pedidos: Listar as categorias dos pedidos.
- 
---

## **Instalação**

### **Clonar o Repositório**
```bash
git clone https://github.com/GuilhermeCustodioNieto/E-commerce-API.git
cd E-commerce-API
```

### **Configuração do Backend**
1. Edite o arquivo `application-dev.properties` com os dados do seu banco de dados.
2. Execute o arquivo `DemoApplicaion.java`

---

## **Rotas da API**
**Usuário**
- `GET /users/`: Lista todos os usuários.
- `GET /users/:id`: Procura um usuário através do id.
- `POST /users/`: Registra um novo usuário.
- `PUT /users/:id`: Atualiza um usuário.
- `DELETE /users/:id`: Deleta um usuário.

**Produto**
- `GET /products`: Lista todos os produtos.
- `GET /products/:id`: Procura um produto por id.

**Pedido**
- `GET /order`: Lista todos os pedidos do sistema.
- `GET /order/:id`: Procura um pedido por id.

**Categoria de Produto**
- `GET /category`: Lista todas as categorias cadastradas no sistema.
- `GET /category/:id`: Procura uma categoria por id.

---

## **Tecnologias Utilizadas**
### **Backend**
- Java
- Spring Boot
- Spring JPA
- H2 Database
- PostgreSQL
- Postman

---

## **Contribuição**
Contribuições são bem-vindas! Para contribuir:
1. Faça um fork do projeto.
2. Crie uma branch para a feature:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça suas alterações e envie um pull request.

---

## **Autor**
Desenvolvido por [Guilherme Custódio Nieto](https://www.linkedin.com/in/guilherme-cust%C3%B3dio-nieto/). 🚀
