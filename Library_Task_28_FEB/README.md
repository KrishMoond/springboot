# Library Management System

Spring Boot REST API application for library management with JPA/Hibernate and PostgreSQL database.

## Features

- RESTful API endpoints
- Spring Data JPA integration
- PostgreSQL database
- Swagger/OpenAPI documentation
- Spring Boot DevTools for development

## Tech Stack

- **Spring Boot**: 3.5.11
- **Spring Data JPA**: Database operations
- **Spring Web**: REST API
- **PostgreSQL**: Database
- **SpringDoc OpenAPI**: 2.8.15 (API documentation)
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
spring.datasource.url=jdbc:postgresql://localhost:5432/library_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## API Documentation

Access Swagger UI at: `http://localhost:8080/swagger-ui.html`

## Endpoints

- Library management operations
- Book CRUD operations
- Member management
