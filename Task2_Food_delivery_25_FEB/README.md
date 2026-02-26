# Food Delivery Application

Comprehensive food delivery system with order management, restaurant services, delivery tracking, and multi-channel notifications.

## Features

- Order management system
- Restaurant service integration
- Delivery tracking service
- Email notifications
- SMS notifications
- Multi-channel notification support
- Spring-based architecture

## Tech Stack

- **Spring Context**: 5.3.39
- **Java Annotations**: 1.3.2
- **Java**: 8+
- **Maven**: 3.x

## Project Structure

```
Task2_Food_delivery_25_FEB/
├── FoodAppMain.java              # Application entry point
├── FoodAppConfig.java            # Spring configuration
├── OrderService.java             # Order management
├── RestaurantService.java        # Restaurant operations
├── DeliveryService.java          # Delivery tracking
├── NotificationService.java      # Notification interface
├── EmailNotification.java        # Email implementation
└── SmsNotification.java          # SMS implementation
```

## Build & Run

```bash
# Build
mvn clean install

# Run
mvn exec:java -Dexec.mainClass="Task2_Food_delivery_25_FEB.FoodAppMain"
```

## Key Concepts

- **Service Layer Architecture**: Separation of business logic
- **Observer Pattern**: Notification system
- **Dependency Injection**: Spring manages services
- **Multi-channel Communication**: Email and SMS
- **Modular Design**: Easy to extend with new features
