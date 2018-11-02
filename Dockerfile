FROM ubuntu:latest
FROM openjdk:8-jre-alpine
VOLUME /tmp
EXPOSE 8081
ARG target/SpringBootRestApiExample-1.0.0.jar
COPY target/SpringBootRestApiExample-1.0.0.jar /tmp/SpringBootRestApiExample-1.0.0.jar
ENTRYPOINT ["java","-jar","SpringBootRestApiExample-1.0.0.jar"]