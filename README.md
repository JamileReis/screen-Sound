Este projeto é uma aplicação Java que gerencia informações sobre artistas e músicas, utilizando o framework Spring Boot e conectada a um banco de dados PostgreSQL. A classe principal, Principal, exibe um menu interativo para o usuário, oferecendo várias opções relacionadas ao gerenciamento de artistas e músicas. O projeto segue uma arquitetura em camadas com um repositório, modelos de dados e uma integração com uma API externa (ChatGPT) para trazer informações adicionais sobre os artistas.

Funcionalidades principais:
Cadastro de artistas: O usuário pode cadastrar artistas, especificando o nome e o tipo (solo, dupla ou banda). Os dados são persistidos no banco de dados usando um repositório JPA.
Cadastro de músicas: Associado a um artista existente, o usuário pode cadastrar músicas. As músicas são armazenadas na lista de músicas do artista e salvas no banco de dados.
Listagem de músicas: Exibe todas as músicas cadastradas no sistema, percorrendo os artistas e suas respectivas músicas.
Busca de músicas por artista: Permite buscar músicas associadas a um artista específico, utilizando um método de consulta personalizado no repositório.
Pesquisa de dados sobre artistas via API do ChatGPT: Uma funcionalidade única da aplicação é a possibilidade de pesquisar dados sobre artistas utilizando a integração com a API do ChatGPT. Através do método ConsultaChatGPT.obterInformacao, o sistema faz uma consulta externa, trazendo informações adicionais, como biografia, curiosidades ou dados relevantes sobre o artista buscado. O retorno é processado e exibido diretamente ao usuário, enriquecendo a experiência de uso e fornecendo dados atualizados.
A aplicação utiliza a classe Artista para modelar os artistas, a classe Musica para as músicas, e a enumeração TipoArtista para categorizar o tipo de artista. O repositório ArtistaRepository é responsável por interagir com o banco de dados, enquanto a classe de serviço ConsultaChatGPT faz chamadas à API do ChatGPT para trazer informações adicionais sobre os artistas.

Tecnologias usadas:
Java 21: A linguagem base do projeto.
Spring Boot: Framework para desenvolvimento web e integração com o banco de dados.
PostgreSQL: Banco de dados relacional utilizado para armazenar informações de artistas e músicas.
JPA (Java Persistence API): Usado para mapeamento objeto-relacional e interações com o banco de dados.
API do ChatGPT: Integração externa para obtenção de informações sobre artistas, oferecendo ao sistema uma camada de inteligência artificial para consultas dinâmicas.
Este sistema foi projetado para ser expansível e modular, permitindo que novos recursos sejam adicionados facilmente, enquanto mantém uma separação clara de responsabilidades entre camadas.
