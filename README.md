# Consulta CEP 

Consulta CEP basico utilizando o rest template para estudo

## Referência

 - [Via Cep WebService](https://viacep.com.br/)
 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)


## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/Giovani-Wahl/Rest-Template.git
```

Entre no diretório do projeto

```bash
  cd Rest-Template
```
Abra o pŕojeto em seu IDE e execute

## Documentação da API

#### Retorna o Endereço

```http
  GET http://localhost:8080/consulta-cep/00000000
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `api_key` | `string` |informar o numero do cep a ser consultado |


## Stack utilizada

**Back-end:** <br>
![Logo](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Blog](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)
![Blog](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white)
