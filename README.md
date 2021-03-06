# spring-boot-lab

## Definitions
- Tomcat: Servlet container;
- Bill of materials: List o spring boot dependencies in a certain version that work with the used spring boot version;

## Annotations
- @RestController: Define a class as a rest entrypoint;
- @RequestMapping: Define an endpoint;
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

#### Monitoring and Deploying

Monitoring (with Actuator):
An Actuator is a bunch o binaries we add to our class
- We can change the port our health check is running;
	- `/health`
	- We can set the `port` of the health check by adding `management.port` to the `application.properties` 
- Other endpoints provided by `Actuator` can be found [here](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready)


Deploying:
- Generate a JAR file. This can be ran anywhere with a JVM;
- `mvn clean install`
	- 'clean' is to clear `target` release first;
- `java -jar target/<generated_jar-_file>` to run init;
- Distribute this JAR file;

---

If we're using TOMCAT:
- add/change the attribute `packaging` in `pom.xml` from `jar` to `war`
- `java -jar target/<generated_jar-_file>` to run init; 
