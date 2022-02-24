# Spring Boot with Neo4j Repository test

This example projects tests Neo4j with a Spring Boot Repository.

## How to start

Start a Neo4j database and initialize it with the data of [db/gene-variants.cypher](db/gene-variants.cypher).
Make sure to change the [src/main/resources/application.properties](src/main/resources/application.properties) accordingly.

Then start the application by running `./mvnw sprint-boot:run`

## Access the data

Open the browser at: http://localhost:8080/gene-variant

Or open a single data set via its name: http://localhost:8080/gene-variant/CYP26A1