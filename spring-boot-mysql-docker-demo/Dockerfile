FROM eclipse-temurin:17-jre-alpine

EXPOSE 8080

ADD target/spring-boot-mysql-docker-demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
