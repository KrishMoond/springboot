# Student Management System

A Spring Boot REST API for managing students with Spring Security and PostgreSQL.

## Features

- Student CRUD operations
- Spring Security authentication
- PostgreSQL database
- Lombok for boilerplate reduction
- Spring Boot DevTools

## Tech Stack

- **Spring Boot**: 3.5.11
- **Spring Security**: Authentication & Authorization
- **Spring Data JPA**: Database operations
- **Spring Web**: REST API
- **PostgreSQL**: Database
- **Lombok**: Code generation
- **Java**: 17

## Project Structure

```
studentManagementSystem/
├── src/main/java/com/capgemini/studentManagementSystem/
│   ├── controller/     # REST controllers
│   ├── entity/         # JPA entities
│   ├── repository/     # Spring Data repositories
│   ├── service/        # Business logic
│   └── config/         # Security configuration
└── resources/
    └── application.properties
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
