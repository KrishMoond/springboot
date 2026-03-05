# URL Shortener Service

Spring Boot application for URL shortening service with JPA/Hibernate, PostgreSQL, and JSP views.

## Features

- URL shortening service
- Spring Data JPA integration
- PostgreSQL database
- JSP view templates
- REST API endpoints
- Swagger/OpenAPI documentation
- Bean validation
- Lombok for boilerplate reduction

## Tech Stack

- **Spring Boot**: 3.3.5
- **Spring Data JPA**: Database operations
- **Spring Web**: REST API & MVC
- **PostgreSQL**: Database
- **Tomcat Jasper**: 11.0.14 (JSP support)
- **SpringDoc OpenAPI**: 2.5.0 (API documentation)
- **Lombok**: Code generation
- **Java**: 21

## Build & Run

```bash
# Build
mvn clean install

# Run
mvn spring-boot:run
```

## Configuration

Update `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/urlshortener_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## API Documentation

Access Swagger UI at: `http://localhost:8080/swagger-ui.html`

## Features

- Shorten long URLs
- Redirect to original URLs
- Track URL statistics
- Custom short URL aliases
