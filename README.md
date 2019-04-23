# Accelerate Project
> This is a sample demo application to use all the different jars for the accelerate project

## Description
> This application uses spring boot to bootstrap the application quickly.

### Dependencies Used
- spring-boot-starter-web   -------  For embedded tomcat and Spring MVC and Jackson
- spring-boot-starter-data-jpa  ------   For Spring JDBC or JPA -- support for databases H2, MySQL, Derby etc
- mysql-conector-java -------- Driver for your MySQL Server 
- spring-boot-starter-aop ------ Aspect oriented Programming Support
- spring-boot-starter-jersey ------  jaxb-api, glassfish-container, jersey etc
- spring-boot-devtools  --------  Automatic restart on changes in classpath   ----  not used yet
- spring-boot-starter-test ------  Spring Test, JUnit, Slf4j, Hamcrest, and Mockito etc
- lombok ------ Build time dependency to reduce boilerplate code

### Testing
> - The Unit tests are yet to be implemented
> - The APIs can be tested from any rest client like POSTMAN etc.

## Instructions
- Import the project as a maven project into your favourite editor and start the maven build. It should automatically download all the dependencies and add them to the classpath.
- We need to setup a MySQL database as mentioned in the application.properties file i.e. at localhost:3306 
- Also there need to be a database created with name accelerate. If your configuration for the MySQL is different then you need to update the same in the configuration.properties file

### Run the project as spring application or a maven project with clean install. It should start the tomcat on port 8080

### Future Implementations
- [ ] Role based access
- [ ] Authorization and Authentication using Spring Security and OAuth2
- [ ] Email support 
- [ ] Job Scheduler using quartz
- [ ] CI/CD Integration

> Step wise tutorial in the future

#### Feel free to fork, change or download.
#### Enjoy Coding :smile:
