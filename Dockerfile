FROM openjdk: 17
COPY targett/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]