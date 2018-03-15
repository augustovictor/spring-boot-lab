# spring-boot-lab

## Definitions
- Tomcat: Servlet container;
- Bill of materials: List o spring boot dependencies in a certain version that work with the used spring boot version;

## Annotations
- @Service: Spring creates a singleton from the class;
- @Autowired: Spring knows it should inject a dependency;
- @Entity: Tells Spring JPA that the class should be mapped to database

## Initializing a new application
- Spring Initializr: Web UI where we set some options and download the application;
- Spring Boot CLI
- STS IDE

### Configuration

In order to change some of the defaults of spring configuration we have to change an `application.properties` file.

[Spring properties](https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html)

#### Steps
- First create a new `application.properties` file in the resources folder;
- Add @Entity annotation to classes;
- Add @Id to an attribute;
- Create a Repository class extending from CrudRepository<Topic, String>;


Configs we may want to change:
- Server port (default is 8080)

### Data persistence

#### Java Persistence API (JPA)

A specification on how to do configure Object Relational Mapping (ORM);

#### Spring Data JPA

