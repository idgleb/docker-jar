FROM openjdk:22
WORKDIR /app
COPY desafio6.jar /app/des.jar
ENTRYPOINT ["java", "-jar", "des.jar"]