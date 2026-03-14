# Event Announcement System

A Spring Boot REST API for managing and announcing events with Spring Security for role-based access control.

## Features

- Event management (create, list, update, delete)
- Announcement broadcasting
- Spring Security with role-based access
- PostgreSQL database
- Lombok for boilerplate reduction

## Tech Stack

- **Spring Boot**: 3.5.11
- **Spring Security**: Role-based access control
- **Spring Data JPA**: Database operations
- **Spring Web**: REST API
- **PostgreSQL**: Database
- **Lombok**: Code generation
- **Java**: 17

## Project Structure

```
event-announcement-system/
├── controller/         # REST controllers
├── entity/             # JPA entities
├── repository/         # Spring Data repositories
├── security/           # Security configuration
└── service/            # Business logic
```

## Configuration

Update `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/eventdb
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
| GET | /api/events | Get all events |
| GET | /api/events/{id} | Get event by ID |
| POST | /api/events | Create event |
| PUT | /api/events/{id} | Update event |
| DELETE | /api/events/{id} | Delete event |
| GET | /api/announcements | Get all announcements |
| POST | /api/announcements | Create announcement |
