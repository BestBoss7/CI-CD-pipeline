FROM openjdk:17
COPY mavenproject1/target/mavenproject1-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]

