FROM openjdk:17-jdk-slim-buster

WORKDIR /ppt-acc-tutorial

COPY target/ppt-acc-tutorial-0.0.1-SNAPSHOT.jar app/

WORKDIR /ppt-acc-tutorial/app

ENTRYPOINT java -jar ppt-acc-tutorial-0.0.1-SNAPSHOT.jar