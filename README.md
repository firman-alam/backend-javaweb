## Dependency

MySQL:

```xml
<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <scope>runtime</scope>
</dependency>
```

- For MySQL

```
spring.datasource.url= jdbc:mysql://localhost:3306/restapi?useSSL=false
spring.datasource.username= root
spring.datasource.password=

spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto= update

# App Properties
budiluhur.app.jwtSecret= javawebTugas
budiluhur.app.jwtExpirationMs= 86400000
```

## Run Spring Boot application

```
mvn spring-boot:run
```

## Run following SQL insert statements

```
INSERT INTO roles(name) VALUES('ROLE_USER');
INSERT INTO roles(name) VALUES('ROLE_MODERATOR');
INSERT INTO roles(name) VALUES('ROLE_ADMIN');
```
