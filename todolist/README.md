# Todo List Application

A Spring Boot MVC web application for managing tasks with JSP views, validation, and PostgreSQL database.

## Features

- Task management (create, list, update, delete)
- JSP-based UI with JSTL
- Bean validation
- PostgreSQL database
- Spring Boot DevTools

## Tech Stack

- **Spring Boot**: 3.5.11
- **Spring Data JPA**: Database operations
- **Spring Web MVC**: Web framework
- **Spring Validation**: Input validation
- **Tomcat Jasper**: JSP rendering
- **JSTL**: JSP tag library
- **PostgreSQL**: Database
- **Java**: 21

## Project Structure

```
todolist/
├── src/main/java/com/capgemini/todolist/
│   ├── controller/     # MVC controllers
│   ├── entity/         # JPA entities
│   ├── repository/     # Spring Data repositories
│   └── service/        # Business logic
├── src/main/webapp/WEB-INF/view/
│   ├── task-list.jsp   # Task listing view
│   └── task-form.jsp   # Task create/edit form
└── resources/
    └── application.properties
```

## Configuration

Update `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tododb
spring.datasource.username=postgres
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.mvc.view.prefix=/WEB-INF/view/
spring.mvc.view.suffix=.jsp
```

## Build & Run

```bash
mvn clean install
mvn spring-boot:run
```

Access the app at: `http://localhost:8080`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /tasks | List all tasks |
| GET | /tasks/new | Show create form |
| POST | /tasks | Create task |
| GET | /tasks/edit/{id} | Show edit form |
| POST | /tasks/update/{id} | Update task |
| GET | /tasks/delete/{id} | Delete task |
