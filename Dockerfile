FROM openjdk:11-jre
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} stktr-server.jar
ENTRYPOINT ["java","-jar","/stktr-server.jar" ]