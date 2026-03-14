# Library Management System with Spring Security

A Spring Boot REST API for managing a library system with book borrowing, user management, and Spring Security integration.

## Features

- User management (add, list)
- Book management (add, list, delete)
- Borrow and return books
- Borrow history tracking
- Active borrow tracking
- Spring Security configuration
- Swagger/OpenAPI documentation
- PostgreSQL database

## Tech Stack

- **Spring Boot**: 3.5.11
- **Spring Security**: Authentication & Authorization
- **Spring Data JPA**: Database operations
- **PostgreSQL**: Database
- **SpringDoc OpenAPI**: 2.8.16
- **Lombok**: Code generation
- **Java**: 17

## Project Structure

```
library_task_spring_security/
├── config/
│   └── SecurityConfig.java         # Spring Security configuration
├── controller/
│   ├── BookController.java         # Book REST endpoints
│   ├── BorrowController.java       # Borrow/return endpoints
│   └── UserController.java         # User REST endpoints
├── entity/
│   ├── Book.java                   # Book entity
│   ├── BorrowRecord.java           # Borrow record entity
│   └── User.java                   # User entity (table: users)
├── repository/
│   ├── BookRepository.java
│   ├── BorrowRecordRepository.java
│   └── UserRepository.java
└── service/
    ├── BookService.java
    ├── BorrowService.java
    └── UserService.java
```

## Configuration

Update `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/securitydb
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
| GET | /api/users | Get all users |
| POST | /api/users | Add user |
| GET | /api/books | Get all books |
| POST | /api/books | Add book |
| DELETE | /api/books/{id} | Delete book |
| POST | /api/borrow?userId=1&bookId=1 | Borrow a book |
| PUT | /api/borrow/return/{recordId} | Return a book |
| GET | /api/borrow/user/{userId} | User borrow history |
| GET | /api/borrow/user/{userId}/active | Active borrows |
| GET | /api/borrow | All borrow records |

## Swagger UI

Access at: `http://localhost:8080/swagger-ui.html`
