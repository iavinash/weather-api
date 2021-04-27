FROM openjdk:11.0.7-jre-slim-buster
EXPOSE 8080
ARG JAR_FILE=build/libs/mausam-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]