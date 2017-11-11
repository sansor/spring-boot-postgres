# Spring Data - Postgres - Hikari (spring-boot-postgres)

### Project Description
Spring Boot with Spring Data + Postgres + Hikari. It is a very basic project just to demo how postgres can be intergated with Spring boot application. [Hikari](https://brettwooldridge.github.io/HikariCP/) is a “zero-overhead” production-quality connection pool.


## Dependencies 
```
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>com.zaxxer</groupId>
			<artifactId>HikariCP</artifactId>
			<version>2.7.2</version>
		</dependency>
	</dependencies>
```



