# Spring MVC Web Application

Spring MVC web application demonstrating Model-View-Controller architecture with Maven WAR packaging.

## Features

- Spring MVC framework
- Web application structure
- WAR packaging for deployment
- Maven build configuration
- Servlet-based web application

## Tech Stack

- **Spring MVC**: Web framework
- **Java**: 8
- **Maven**: 3.x
- **Packaging**: WAR
- **JUnit**: 4.13.1 (testing)

## Project Structure

```
springmvc/
├── src/main/
│   ├── java/              # Java source files
│   ├── resources/         # Configuration files
│   └── webapp/            # Web resources (JSP, HTML, CSS)
└── pom.xml               # Maven configuration
```

## Build & Deploy

```bash
# Build WAR file
mvn clean package

# Output: target/springmvc.war

# Deploy to Tomcat/Jetty
# Copy WAR to server's webapps directory
```

## Run Locally

```bash
# Using Maven plugin
mvn tomcat7:run
# or
mvn jetty:run
```

## Key Concepts

- **MVC Pattern**: Separation of concerns
- **Controllers**: Handle HTTP requests
- **Views**: Render response (JSP/HTML)
- **Models**: Data transfer objects
- **WAR Deployment**: Traditional Java web deployment
