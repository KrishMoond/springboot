# Spring Security with Database Authentication

Spring Boot application demonstrating Spring Security with database-backed authentication and authorization using PostgreSQL.

## Features

- Spring Security configuration
- Database authentication
- User management with JPA
- Role-based access control
- PostgreSQL integration
- Spring Boot Actuator
- Lombok for boilerplate reduction

## Tech Stack

- **Spring Boot**: 3.5.11
- **Spring Security**: Authentication & Authorization
- **Spring Data JPA**: Database operations
- **PostgreSQL**: Database
- **Lombok**: Code generation
- **Spring Boot Actuator**: Monitoring
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
spring.datasource.url=jdbc:postgresql://localhost:5432/security_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Features

- User registration and login
- Password encryption
- JWT/Session-based authentication
- Role-based authorization
- Secure REST endpoints
