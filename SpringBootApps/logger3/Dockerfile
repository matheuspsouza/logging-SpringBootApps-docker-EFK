FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
EXPOSE 8093
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-XX:+UseG1GC","-jar","/app.jar"]

