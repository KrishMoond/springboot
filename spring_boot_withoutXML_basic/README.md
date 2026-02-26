# Spring Boot Without XML

Spring Framework with Java-based configuration demonstrating annotation-driven dependency injection without XML files.

## Features

- Java-based configuration (@Configuration)
- Annotation-driven dependency injection
- Component scanning
- No XML configuration files
- Modern Spring approach

## Tech Stack

- **Spring Context**: 5.3.39
- **Java**: 8+
- **Maven**: 3.x

## Project Structure

```
spring_boot_withoutXML_basic/
├── Configuration classes    # @Configuration annotated
├── Component classes        # @Component annotated
└── Main.java               # Application entry point
```

## Configuration

Uses Java annotations instead of XML:
```java
@Configuration
@ComponentScan("package.name")
public class AppConfig {
    @Bean
    public MyBean myBean() {
        return new MyBean();
    }
}
```

## Build & Run

```bash
# Build
mvn clean install

# Run
mvn exec:java -Dexec.mainClass="your.main.Class"
```

## Key Concepts

- **@Configuration**: Defines configuration class
- **@Bean**: Declares a Spring bean
- **@ComponentScan**: Enables component scanning
- **@Autowired**: Automatic dependency injection
- **Java Config**: Modern alternative to XML
