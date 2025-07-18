
FROM openjdk:17
WORKDIR /app
COPY . .
RUN ./mvnw clean install -DskipTests || mvn clean install -DskipTests
CMD ["java", "-jar", "target/backend-1.0.jar"]
