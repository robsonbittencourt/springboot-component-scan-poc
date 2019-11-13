FROM openjdk:11.0.5-jre-slim

WORKDIR /app

COPY ./build/libs .

CMD ["sh", "-c", "java -jar springboot-component-scan-poc.jar" ]
