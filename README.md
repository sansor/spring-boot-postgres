# Spring Data - Postgres - Hikari (spring-boot-postgres)

### Project Description
Spring Boot with Spring Data + Postgres + Hikari. It is a very basic project just to demo how postgres can be intergated with Spring boot application. [Hikari](https://brettwooldridge.github.io/HikariCP/) is a “zero-overhead” production-quality connection pool.


### Hikari Dependency
```		
<dependency>
	<groupId>com.zaxxer</groupId>
	<artifactId>HikariCP</artifactId>
	<version>2.7.2</version>
</dependency>
```
### Postgres SQL Dependency
```
<dependency>
	<groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>
```
### To run with Hikari
```
spring:
  datasource: 
    type: com.zaxxer.hikari.HikariDataSource
    driverClassName: org.postgresql.Driver
    jdbcUrl: jdbc:postgresql://localhost/test
    username: postgres
    password: root
    hikari:
      idle-timeout: 10000
  jpa:
    generate-ddl: true

```
### To run without Hikari
To remove hikari dependencies - you just need to comment our type, hikari.idle.timeout and remove JPAConfig file.

### Using MySQL in place of Postgres
change the driverClassName and jdbcUrl


