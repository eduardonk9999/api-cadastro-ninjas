FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copia o arquivo pom.xml e baixa as dependências necessárias
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copia o código-fonte da aplicação e compila o projeto
COPY src ./src
RUN mvn clean package -DskipTests

# Usa uma imagem minimalista do OpenJDK para executar a aplicação
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copia o JAR da aplicação do estágio anterior
COPY --from=build /app/target/API-Ninjas-0.0.1-SNAPSHOT.jar app.jar

# Expõe a porta 8080 para o tráfego HTTP
EXPOSE 8080

# Define o comando para executar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]
