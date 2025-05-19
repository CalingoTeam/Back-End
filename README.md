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

## 🚀 Running Locally

```bash
# Clone the repository
git clone https://github.com/CalingoTeam/Back-End.git
cd Back-End

# Build and run using Docker
docker-compose up --build
````

Access the API at `http://localhost:8080`.

## 📂 Project Structure

```
src/
├── controller/
├── service/
├── repository/
├── model/
└── security/
```

## ✅ Testing

* JUnit & Mockito
* To run tests:

```bash
./gradlew test
```

## 📋 API Documentation

* Swagger (available at `/swagger-ui.html` when running)

---

## 🤝 Contributors

Maintained by [CalingoTeam](https://github.com/CalingoTeam).
