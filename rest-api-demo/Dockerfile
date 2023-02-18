FROM --platform=linux/x86_64 eclipse-temurin:19-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]