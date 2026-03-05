# Product Management System

Spring Boot REST API application for product management with JPA/Hibernate and PostgreSQL database.

## Features

- RESTful API for product operations
- Spring Data JPA integration
- PostgreSQL database
- Swagger/OpenAPI documentation
- CRUD operations for products

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
spring.datasource.url=jdbc:postgresql://localhost:5432/product_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## API Documentation

Access Swagger UI at: `http://localhost:8080/swagger-ui.html`

## Endpoints

- Product CRUD operations
- Product search and filtering
- Inventory management
