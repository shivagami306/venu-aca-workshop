FROM openjdk:21-jdk
LABEL authors="Venu"
WORKDIR /app
COPY target/VenuApplication.jar /app/VenuApplication.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/VenuApplication.jar"]