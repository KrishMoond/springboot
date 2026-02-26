# Banking Application - Loan Processing System

Banking application with loan processing, validation services, credit score checking, and audit functionality.

## Features

- Loan application processing
- Credit score validation
- Income verification
- Multi-validator architecture
- Audit logging service
- Spring-based dependency injection
- Validation chain pattern

## Tech Stack

- **Spring Context**: 5.3.39
- **Java Annotations**: 1.3.2
- **Java**: 8+
- **Maven**: 3.x

## Project Structure

```
Task3_Bank_App_25_FEB/
├── BankAppMain.java              # Application entry point
├── BankAppConfig.java            # Spring configuration
├── LoanService.java              # Loan processing service
├── LoanValidator.java            # Validator interface
├── CreditScoreValidator.java     # Credit score validation
├── IncomeValidator.java          # Income validation
└── AuditService.java             # Audit logging
```

## Build & Run

```bash
# Build
mvn clean install

# Run
mvn exec:java -Dexec.mainClass="Task3_Bank_Loan_25_FEB.BankAppMain"
```

## Key Concepts

- **Chain of Responsibility**: Validation chain
- **Service Layer**: Business logic separation
- **Validator Pattern**: Modular validation
- **Audit Trail**: Transaction logging
- **Dependency Injection**: Spring manages validators
- **Single Responsibility**: Each validator has one job
