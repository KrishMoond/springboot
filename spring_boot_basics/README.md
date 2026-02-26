# Spring Boot Basics

Introduction to Spring Framework with XML-based configuration demonstrating core concepts of dependency injection and bean management.

## Features

- XML-based Spring configuration
- Bean definition and management
- Dependency Injection (DI)
- Spring Context initialization
- Basic POJO classes

## Tech Stack

- **Spring Context**: 5.3.39
- **Java**: 8+
- **Maven**: 3.x

## Project Structure

```
spring_boot_basics/
├── Employee.java         # Employee POJO
├── Person.java          # Person POJO
├── Main.java            # Application entry point
└── resources/
    └── config.xml       # Spring XML configuration
```

## Configuration

Spring beans are configured in `config.xml`:
```xml
<beans>
    <bean id="employee" class="spring_boot_basics.Employee"/>
    <bean id="person" class="spring_boot_basics.Person"/>
</beans>
```

## Build & Run

```bash
# Build
mvn clean install

# Run
mvn exec:java -Dexec.mainClass="spring_boot_basics.Main"
```

## Key Concepts

- **IoC Container**: Spring manages object creation
- **Bean Lifecycle**: Spring controls bean instantiation
- **XML Configuration**: Traditional Spring configuration approach
- **ApplicationContext**: Core Spring container interface
