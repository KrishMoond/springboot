# Student Management REST API

A Spring Boot REST API for managing students with full CRUD operations, DTO pattern, security, and PostgreSQL database.

## Features

- Student CRUD operations
- DTO pattern for request/response
- Spring Security integration
- Repository pattern
- PostgreSQL database
- Spring Boot DevTools

## Tech Stack

- **Spring Boot**: 3.5.11
- **Spring Data JPA**: Database operations
- **Spring Web**: REST API
- **Spring Security**: Authentication
- **PostgreSQL**: Database
- **Lombok**: Code generation
- **Java**: 17

## Project Structure

```
student_management_REST_API/
├── config/             # Security & app configuration
├── controller/         # REST controllers
├── dto/                # Data Transfer Objects
├── entity/             # JPA entities
├── repository/         # Spring Data repositories
├── security/           # Security configuration
└── service/            # Business logic
```

## Configuration

Update `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=postgres
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

## Build & Run

```bash
mvn clean install
mvn spring-boot:run
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /api/students | Get all students |
| GET | /api/students/{id} | Get student by ID |
| POST | /api/students | Add student |
| PUT | /api/students/{id} | Update student |
| DELETE | /api/students/{id} | Delete student |
