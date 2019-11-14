FROM openjdk:12.0.2

WORKDIR /app

COPY ./build/libs .

CMD ["sh", "-c", "java -jar springboot-component-scan-poc.jar" ]
