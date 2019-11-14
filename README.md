# Springboot Component Scan Poc
[![Build Status](https://travis-ci.org/robsonbittencourt/springboot-component-scan-poc.svg?branch=master)](https://travis-ci.org/robsonbittencourt/springboot-component-scan-poc)

> By default, classes annotated with @Component, @Repository, @Service, @Controller are registered as Spring beans. The same goes for classes annotated with a custom annotation that is annotated with @Component. We can extend this behavior by using includeFilters and excludeFilters parameters of the @ComponentScan annotation.

This project is a POC (Proof of Concept) of Spring feature **Component Scan**, based on the content of [Baeldung blog post](https://www.baeldung.com/spring-componentscan-filter-type).

The goal is to start an API by choosing a specific set of classes that will be injected when requested. This way you can run the same application, changing the entire infrastructure layer for example.

The API is very simple and dummy since the only goal is show how change the dependencies. It consists of bringing some information about Cloud Providers. The magic happens basically on the [ComponentScanCustomFilter](src/main/java/com/rbittencourt/springbootcomponentscanpoc/config/ComponentScanCustomFilter.java) class where an environment variable is read and used to add a filter of the desired components. 

The filter indicates an annotation, and from then on Spring will create instances of the annotated classes with that annotation. For example when the AWS variable is entered, all classes that have the [AWS annotation](src/main/java/com/rbittencourt/springbootcomponentscanpoc/cloudproviders/annotation/Aws.java) will be available for use with *@Autowired*.

## Examples

```
docker run -d -p 8080:8080 -e CLOUD_PROVIDER=AWS robsonbittencourt/springboot-component-scan-poc

curl http://localhost:8080/name
Amazon Web Services

curl http://localhost:8080/company
Amazon
```

In this example we chose AWS as Cloud Provider, but we could use Google for example, and the corresponding classes would be used.

```
docker run -d -p 8080:8080 -e CLOUD_PROVIDER=GOOGLE robsonbittencourt/springboot-component-scan-poc

curl http://localhost:8080/name
Google Cloud Platform

curl http://localhost:8080/company
Google
```

Also with this strategy you could instantiate 3 containers each one with a different provider but with the same core business. Each container should be run in a different port.

```
docker run -d -p 8080:8080 -e CLOUD_PROVIDER=AWS robsonbittencourt/springboot-component-scan-poc
docker run -d -p 8081:8080 -e CLOUD_PROVIDER=GOOGLE robsonbittencourt/springboot-component-scan-poc
docker run -d -p 8082:8080 -e CLOUD_PROVIDER=AZURE robsonbittencourt/springboot-component-scan-poc

curl http://localhost:8080/name
Amazon Web Services

curl http://localhost:8081/name
Google Cloud Platform

curl http://localhost:8082/name
Azure
```