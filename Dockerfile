FROM ubuntu:latest
FROM openjdk:8-jre-alpine
VOLUME /tmp
EXPOSE 8081
ADD SpringBootRestApiExample-1.0.0.jar
COPY SpringBootRestApiExample-1.0.0.jar /tmp/SpringBootRestApiExample-1.0.0.jar
ENTRYPOINT ["java","-jar","/tmp/SpringBootRestApiExample-1.0.0.jar"]