FROM openjdk:11-jdk-slim
ARG JAR_FILE=target/*-exec.jar
COPY ${JAR_FILE} CalculatorService.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","app.jar"]