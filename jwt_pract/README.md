# JWT Authentication - Spring Boot

A Spring Boot REST API with JWT-based authentication using PostgreSQL.

---

## Tech Stack

- Java 21
- Spring Boot 3.5.11
- Spring Security
- JSON Web Token (JJWT 0.13.0)
- Spring Data JPA
- PostgreSQL

---

## Project Structure

```
src/main/java/com/example/demo/
├── controller/
│   └── Controller.java          # REST endpoints
├── dto/
│   ├── LoginDto.java            # Login request body
│   └── UserDto.java             # Register request body
├── entity/
│   └── UserInfo.java            # JPA entity mapped to DB
├── repo/
│   └── UserRepo.java            # JPA repository
├── security/
│   ├── JwtFilter.java           # Validates JWT on every request
│   ├── SecurityConfig.java      # Spring Security configuration
│   └── UserAuthenticationService.java  # Loads user from DB for auth
├── service/
│   └── UserService.java         # Business logic (register user)
├── util/
│   └── JwtUtil.java             # Token create / parse / validate
└── JwtPractApplication.java     # Entry point
```

---

## Setup

### 1. PostgreSQL

Create a database:
```sql
CREATE DATABASE studentdb;
```

### 2. application.properties

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/studentdb
spring.datasource.username=postgres
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Run

```bash
mvn spring-boot:run
```

App starts on `http://localhost:8080`

---

## API Endpoints

### Register User
```
POST /auth/create
Content-Type: application/json
```
```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "password": "secret123",
  "phone": "1234567890"
}
```
**Response:** saved user object with generated ID.

---

### Login
```
POST /auth/login
Content-Type: application/json
```
```json
{
  "email": "john@example.com",
  "password": "secret123"
}
```
**Response:** HTTP 200, empty body.
Token is returned in the **response header**:
```
Authorization: Bearer eyJhbGciOiJIUzI1NiJ9...
```
> In Postman → check the **Headers tab** of the response.

---

### Use Token on Protected Routes
Add the token to the **request header**:
```
Key:   Authorization
Value: Bearer eyJhbGciOiJIUzI1NiJ9...
```

---

### Generate Token (Test Only)
```
GET /auth/{username}
```
Returns a raw token for the given username without authentication.

---

### Extract Username from Token
```
GET /auth/g/{token}
```
Returns the username/email embedded in the token.

---

### Validate Token
```
GET /auth/check/{username}/{token}
```
Returns `VALID TOKEN` or `INVALID TOKEN`.

---

## How JWT Works Here

```
1. Register   →  POST /auth/create  →  password BCrypt encoded → saved to DB
2. Login      →  POST /auth/login   →  credentials verified → JWT generated → sent in response header
3. Request    →  Any protected URL  →  JwtFilter reads Authorization header → validates token → grants access
```

---

## Security Design

| Component | Responsibility |
|---|---|
| `SecurityConfig` | Permits `/auth/**` publicly, protects everything else, stateless session |
| `JwtFilter` | Runs on every request, validates token, sets SecurityContext |
| `UserAuthenticationService` | Loads user from DB by email for Spring Security |
| `JwtUtil` | Creates, parses, and validates JWT tokens |
| `UserService` | Encodes password with BCrypt before saving |

---

## Token Details

- Algorithm: `HMAC-SHA256`
- Expiry: `1 hour`
- Secret key configured in `JwtUtil.java`

---

## Common Mistakes to Avoid

| Mistake | Why It Fails |
|---|---|
| Saving plain text password | Spring Security uses BCrypt to compare — will always fail |
| `cors.disable()` in SecurityConfig | Strips custom response headers like `Authorization` |
| Login logic inside `JwtFilter` | Causes circular dependency, filter is for validation only |
| No `STATELESS` session policy | Spring creates HTTP sessions, breaks JWT flow |
| Hitting `/create` instead of `/auth/create` | Controller has `@RequestMapping("/auth")` prefix |
