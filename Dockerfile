FROM openjdk:17
COPY mavenproject1/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
