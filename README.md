# Calingo - Back-End

This is the back-end service of the **Calingo** project — a platform that translates regional Brazilian expressions into standard Portuguese, providing context, explanations, and cultural background.

## 🌐 Repository Overview

This repository contains the core API logic for the Calingo system. It manages:
- User authentication and authorization (RBAC and PBAC)
- Secure session management with JWT
- Expression and quiz database interactions
- Suggestion and ranking systems
- Admin moderation tools

## ⚙️ Tech Stack

- **Java 17**
- **Spring Boot**
- **PostgreSQL**
- **JWT (JSON Web Token)**
- **BCrypt (password encryption)**
- **Docker** and `docker-compose`

## 🛡️ Security Highlights

- Encrypted passwords with BCrypt
- Role- and permission-based access control
- Session expiration with JWT
- Input validation and basic audit logging

## 🚀 How to Run (Docker)

```bash
# Clone the repository
git clone https://github.com/CalingoTeam/Back-End.git
cd Back-End

# Build and run the application
docker-compose up --build
````

The API will be available at:
📍 `http://localhost:8080`

## 🗂️ Project Structure

```

Projeto\_Calingo/
├── .github/                  # GitHub Actions and workflow files
├── .mvn/                     # Maven wrapper support
├── src/
│   ├── main/
│   │   ├── java/com/example/Projeto\_Calingo/
│   │   │   ├── controller/          # REST controllers
│   │   │   ├── entities/            # JPA entities
│   │   │   ├── infra/security/      # Security configuration (JWT, RBAC/PBAC)
│   │   │   ├── repositories/        # Spring Data repositories
│   │   │   ├── services/            # Business logic
│   │   │   ├── user/                # User models and logic
│   │   │   └── ProjetoCalingoApplication.java # Main application entry point
│   │   └── resources/              # application.properties and static resources
│   └── test/java/com/example/Projeto\_Calingo/ # Unit and integration tests
├── .gitattributes
├── .gitignore
├── mvnw / mvnw\.cmd               # Maven wrapper scripts
├── pom.xml                       # Maven project configuration
└── README.md

````

## 🧪 Running Tests

* JUnit & Mockito
* To run tests:

```bash
./gradlew test
```

## 📋 API Documentation

* Swagger available at `/swagger-ui.html` (when the app is running)

## 🤝 Contributors

Maintained by [CalingoTeam](https://github.com/CalingoTeam).

