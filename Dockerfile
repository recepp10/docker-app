FROM openjdk:17
WORKDIR /app
ADD target/DockerApp-0.0.1-SNAPSHOT.jar DockerApp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker","DockerApp-0.0.1-SNAPSHOT.jar"]
