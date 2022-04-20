FROM openjdk:15-ea-jdk-slim
VOLUME /tmp
COPY build/libs/docker-demo-0.0.1-SNAPSHOT.jar docekr-demo.jar
ENTRYPOINT ["java","-jar","community-service.jar"]