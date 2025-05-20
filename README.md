<h1 align="center">Calingo - Back-End</h1>

<p align="center">
  <img alt="Status" src="https://img.shields.io/badge/status-in%20development-yellow" />
  <img alt="Java" src="https://img.shields.io/badge/Java-007396?logo=java&logoColor=white" />
  <img alt="Spring Boot" src="https://img.shields.io/badge/Spring_Boot-6DB33F?logo=springboot&logoColor=white" />
  <img alt="JUnit" src="https://img.shields.io/badge/JUnit-25A162?logo=junit5&logoColor=white" />
  <img alt="Maven" src="https://img.shields.io/badge/Maven-C71A36?logo=apachemaven&logoColor=white" />
  <img alt="Tests" src="https://img.shields.io/badge/tests-passing-brightgreen" />
  <img alt="Repo size" src="https://img.shields.io/github/repo-size/CalingoTeam/Back-End" />
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/CalingoTeam/Back-End" />
  <img alt="CodeQL" src="https://github.com/CalingoTeam/Back-End/actions/workflows/codeql.yml/badge.svg" />
  <img alt="Dependabot enabled" src="https://img.shields.io/badge/Dependabot-enabled-brightgreen?logo=dependabot" />
</p>

<p align="center">
  This is the back-end service of the <strong>Calingo</strong> project — a platform that translates regional Brazilian expressions into standard Portuguese, providing context, explanations, and cultural background.
</p>

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

