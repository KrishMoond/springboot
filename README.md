# Spring Boot Projects Workspace

A comprehensive collection of Spring Framework and Spring Boot projects demonstrating various concepts including dependency injection, Hibernate ORM, Spring MVC, and real-world application scenarios.

## 📋 Projects Overview

### 1. hibernate_spring
Spring Framework integration with Hibernate ORM and PostgreSQL database.
- **Tech Stack**: Spring 5.3.39, Hibernate 5.6.15, PostgreSQL 42.6.0
- **Features**: JPA/Hibernate configuration, DAO pattern, Service layer
- **Package**: `hibernate_spring`

### 2. spring_boot_basics
Introduction to Spring Framework with XML-based configuration.
- **Tech Stack**: Spring Context 5.3.39
- **Features**: Bean configuration, Dependency Injection, XML configuration
- **Package**: `spring_boot_basics`

### 3. spring_boot_withoutXML_basic
Spring Framework with Java-based configuration (no XML).
- **Tech Stack**: Spring Context 5.3.39
- **Features**: Java-based configuration, Annotation-driven DI
- **Package**: `spring_boot_basics`

### 4. springmvc
Spring MVC web application with Maven WAR packaging.
- **Tech Stack**: Spring MVC, Maven, Java 8
- **Packaging**: WAR (Web Application Archive)
- **Package**: `com.capgemini`

### 5. Task1_Credit_Card_UPI_25_FEB
Payment processing system supporting Credit Card and UPI payments.
- **Tech Stack**: Spring Context 5.3.39, Java Annotations
- **Features**: Payment gateway integration, Multiple payment methods
- **Package**: `com.spring.payment`

### 6. Task2_Food_delivery_25_FEB
Food delivery application with notification services.
- **Tech Stack**: Spring Context 5.3.39
- **Features**: Order management, Restaurant service, Delivery tracking, Email/SMS notifications
- **Package**: `Task2_Food_delivery_25_FEB`

### 7. Task3_Bank_App_25_FEB
Banking application with loan processing and validation.
- **Tech Stack**: Spring Context 5.3.39
- **Features**: Loan service, Credit score validation, Income validation, Audit service
- **Package**: `Task3_Bank_Loan_25_FEB`

## 🛠️ Prerequisites

- **Java**: JDK 8 or higher
- **Maven**: 3.x or higher
- **IDE**: Eclipse, IntelliJ IDEA, or VS Code
- **Database**: PostgreSQL (for hibernate_spring project)

## 🚀 Quick Start

### Build a Project
```bash
cd <project-directory>
mvn clean install
```

### Run Spring Boot Application
```bash
mvn spring-boot:run
```

### Run Java Application
```bash
mvn exec:java
```

### Package WAR (for springmvc)
```bash
mvn clean package
```

## 📁 Project Structure

Each project follows standard Maven structure:
```
project-name/
├── src/
│   ├── main/
│   │   ├── java/          # Java source files
│   │   └── resources/     # Configuration files
│   └── test/              # Test files
├── target/                # Compiled classes (generated)
└── pom.xml               # Maven configuration
```

## 🔧 Configuration

- **Spring Configuration**: Check `resources/` folder for XML configs or Java config classes
- **Database**: Update `persistence.xml` in hibernate_spring project
- **Dependencies**: Managed via `pom.xml` in each project

## 📚 Learning Path

1. Start with **spring_boot_basics** - Learn XML-based configuration
2. Move to **spring_boot_withoutXML_basic** - Learn annotation-based configuration
3. Explore **hibernate_spring** - Learn ORM and database integration
4. Study **springmvc** - Learn web application development
5. Review Task projects - Real-world application scenarios

## 🤝 Contributing

Feel free to explore, modify, and enhance these projects for learning purposes.

## 📄 License

These projects are for educational purposes.
