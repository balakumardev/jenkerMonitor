FROM openjdk:8-jre-alpine
COPY ./target/jenkerMonitor-0.0.1-SNAPSHOT.jar /usr/src/myapp/
WORKDIR /usr/src/myapp
EXPOSE 8080
CMD ["java", "-jar", "jenkerMonitor-0.0.1-SNAPSHOT.jar"]