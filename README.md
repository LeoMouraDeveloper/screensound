# 🎵 ScreenSound

ScreenSound é uma aplicação em Java que gerencia um catálogo de artistas e músicas. Utiliza Spring Boot e JPA para persistência de dados, e possui integração com a API do ChatGPT para gerar descrições musicais com base em inteligência artificial.

## 🚀 Funcionalidades

- Cadastro de artistas com nome e tipo (solo ou banda).
- Cadastro de músicas associadas a um artista.
- Geração de descrições automáticas para músicas utilizando ChatGPT.
- Acesso a um repositório de dados via Spring Data JPA.
- Interface de execução via terminal.

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- API do OpenAI (ChatGPT)
- H2 Database (padrão, mas adaptável para outros bancos)

## 📁 Estrutura do Projeto

```
screensound/
├── model/                # Entidades JPA (Artista, Musica, TipoArtista)
├── principal/            # Classe Principal (interface de execução via console)
├── repository/           # Repositórios Spring Data
├── service/              # Serviço de integração com a API do ChatGPT
├── resources/            # Arquivo de configuração (application.properties)
└── ScreensoundApplication.java  # Classe main (Spring Boot)
```


## ⚙️ Como Executar o Projeto

### Pré-requisitos

- Java 17+
- Maven

### Passos para execução

1. Clone o repositório.
   
2. Configure a chave da API do ChatGPT no arquivo application.properties: OPENAI_API_KEY=sua-chave-aqui

3. Execute a aplicação com Maven: ./mvnw spring-boot:run

4. Interaja com o menu apresentado no terminal.

## 🧠 Integração com ChatGPT

A classe ConsultaChatGPT usa a API da OpenAI para gerar uma descrição de uma música com base no seu título e estilo. Certifique-se de configurar a variável OPENAI_API_KEY corretamente no arquivo application.properties.

## 🤝 Contribuições

Sinta-se à vontade para abrir issues ou pull requests com melhorias, correções ou sugestões.

## 💻 Desenvolvido por:
Leonardo Moura baseado no curso da Alura.

