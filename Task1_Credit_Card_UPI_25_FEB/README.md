# Credit Card & UPI Payment System

Payment processing system demonstrating multiple payment methods including Credit Card and UPI integration using Spring Framework.

## Features

- Multiple payment method support
- Credit Card payment processing
- UPI payment integration
- Payment gateway abstraction
- Spring dependency injection
- Strategy pattern implementation

## Tech Stack

- **Spring Context**: 5.3.39
- **Java Annotations**: 1.3.2
- **Java**: 8+
- **Maven**: 3.x

## Project Structure

```
Task1_Credit_Card_UPI_25_FEB/
└── com/spring/payment/
    ├── PaymentService.java       # Payment processing service
    ├── PaymentMethod.java        # Payment interface
    ├── CreditCardPayment.java    # Credit card implementation
    ├── UpiPayment.java          # UPI implementation
    └── Main.java                # Application entry point
```

## Build & Run

```bash
# Build
mvn clean install

# Run
mvn exec:java -Dexec.mainClass="com.spring.payment.Main"
```

## Key Concepts

- **Strategy Pattern**: Different payment strategies
- **Dependency Injection**: Spring manages payment methods
- **Interface Segregation**: Payment method abstraction
- **Loose Coupling**: Easy to add new payment methods
