FROM maven:3.9.5-openjdk-21 AS build
COPY . .
RUN mvm clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /target/hng-stage0-retrieve-credentials-0.0.1-SNAPSHOT.jar hng-stage0-retrieve-credentials.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","hng-stage0-retrieve-credentials.jar"]