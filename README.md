# 🎵 Gerenciador de Artistas e Músicas  

Este projeto é uma aplicação **Java com Spring Boot** para gerenciamento de **artistas e músicas**, conectada a um banco de dados **PostgreSQL**.  

A aplicação segue uma **arquitetura em camadas**, utilizando repositórios, modelos de dados e integração com uma API externa (**ChatGPT**) para enriquecer as informações sobre artistas.  


## ✨ Funcionalidades  

- 🎤 **Cadastro de Artistas**  
  - O usuário pode cadastrar artistas, informando nome e tipo (**solo, dupla ou banda**).  
  - Os dados são persistidos no banco via **JPA Repository**.  

- 🎶 **Cadastro de Músicas**  
  - Associadas a artistas já existentes.  
  - Cada música fica vinculada ao artista e é salva no banco.  

- 📜 **Listagem de Músicas**  
  - Exibe todas as músicas cadastradas, agrupadas por artista.  

- 🔍 **Busca de Músicas por Artista**  
  - Permite consultar músicas de um artista específico.  
  - Implementada com um método de consulta customizado no repositório.  

- 🤖 **Pesquisa de Dados via ChatGPT**  
  - Integração com a **API do ChatGPT** para trazer informações extras sobre os artistas.  
  - Exibe dados como **biografia, curiosidades e fatos relevantes**, enriquecendo a experiência do usuário.  


## 🏗️ Estrutura do Projeto  

- **Classe `Principal`** → Exibe o menu interativo para o usuário.  
- **Modelo `Artista`** → Representa os artistas cadastrados.  
- **Modelo `Musica`** → Representa músicas vinculadas a um artista.  
- **Enum `TipoArtista`** → Categoriza artistas em **Solo, Dupla ou Banda**.  
- **Repositório `ArtistaRepository`** → Camada de persistência de dados (Spring Data JPA).  
- **Serviço `ConsultaChatGPT`** → Responsável por chamar a API do ChatGPT e retornar informações adicionais sobre os artistas.  

## 🛠️ Tecnologias Utilizadas  

- ☕ **Java 21** – Linguagem base do projeto  
- 🌱 **Spring Boot** – Framework para desenvolvimento e integração com banco de dados  
- 🐘 **PostgreSQL** – Banco relacional para persistência dos dados  
- 📦 **Spring Data JPA (Hibernate)** – Mapeamento objeto-relacional  
- 🤖 **API ChatGPT** – Fornece dados adicionais e inteligência artificial  
