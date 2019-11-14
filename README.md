# Springboot Component Scan Poc

> By default, classes annotated with @Component, @Repository, @Service, @Controller are registered as Spring beans. The same goes for classes annotated with a custom annotation that is annotated with @Component. We can extend this behavior by using includeFilters and excludeFilters parameters of the @ComponentScan annotation.

This project is a POC (Proof of Concept) of Spring feature **Component Scan**, based on the content of [Baeldung blog post](https://www.baeldung.com/spring-componentscan-filter-type).

The goal is to start an API by choosing a specific set of classes that will be injected when requested. This way you can run the same application, changing the entire infrastructure layer for example. This choice is made through an environment variable.

## Examples

