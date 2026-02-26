# Hibernate Spring Integration

Spring Framework integration with Hibernate ORM for database operations using PostgreSQL.

## Features

- Spring Context configuration
- Hibernate ORM integration
- JPA persistence
- DAO (Data Access Object) pattern
- Service layer architecture
- PostgreSQL database connectivity

## Tech Stack

- **Spring Framework**: 5.3.39
- **Hibernate Core**: 5.6.15.Final
- **PostgreSQL Driver**: 42.6.0
- **Java Annotations**: 1.3.2
- **Java**: 8+

## Project Structure

```
hibernate_spring/
├── dao/
│   └── EmployeeDao.java          # Data access layer
├── dto/
│   └── Employee.java             # Entity model
├── service/
│   └── EmployeeService.java      # Business logic layer
├── main/
│   └── Main.java                 # Application entry point
├── JpaUtil.java                  # JPA utility class
├── ProjectConfig.java            # Spring configuration
└── resources/
    └── META-INF/
        └── persistence.xml       # JPA configuration
```

## Configuration

### Database Setup

Update `persistence.xml` with your PostgreSQL credentials:
```xml
<property name="javax.persistence.jdbc.url" value="jdbc:postgresql://localhost:5432/your_db"/>
<property name="javax.persistence.jdbc.user" value="your_username"/>
<property name="javax.persistence.jdbc.password" value="your_password"/>
```

## Build & Run

```bash
# Build
mvn clean install

# Run
mvn exec:java -Dexec.mainClass="hibernate_spring.main.Main"
```

## Key Concepts

- **Dependency Injection**: Spring manages bean lifecycle
- **ORM**: Hibernate handles object-relational mapping
- **Transaction Management**: Automatic transaction handling
- **DAO Pattern**: Separation of data access logic
