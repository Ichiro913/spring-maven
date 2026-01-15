# Image de base avec Java 17
FROM eclipse-temurin:17-jdk

# Dossier de travail dans le conteneur
WORKDIR /app

# Copie du fichier jar (généré par Maven)
COPY target/*.jar app.jar

# Port utilisé par Spring Boot
EXPOSE 8080

# Commande de lancement
ENTRYPOINT ["java", "-jar", "app.jar"]