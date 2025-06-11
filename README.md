# Spring Security - Basic Authentication Demo

This is a simple Spring Boot project demonstrating **Basic Authentication** using **Spring Security** with role-based access control.

## 📦 Project Structure

- `SecurityConfiguration.java`  
  Configures HTTP security, in-memory users, password encoding, and endpoint access based on roles.

- `SecurityDemoController.java`  
  REST controller with endpoints demonstrating public, user, and admin level access.

## 🔐 Security Configuration

The application defines two in-memory users:

| Username | Password     | Roles          |
|----------|--------------|----------------|
| `admin`  | `admin-pass` | ADMIN, USER    |
| `user`   | `user-pass`  | USER           |

### Endpoint Access Rules

| Endpoint         | Access Role   |
|------------------|---------------|
| `/rest/public`   | Public        |
| `/rest/user`     | USER, ADMIN   |
| `/rest/admin`    | ADMIN only    |

## 🔧 How to Run

1. **Clone the repo**
   ```bash
   git clone https://github.com/your-username/spring-security-basic-auth.git
   cd spring-security-basic-auth
Build and run the application

bash
Copy
Edit
./mvnw spring-boot:run
Access the endpoints via Postman or curl:

Public: http://localhost:8080/rest/public

User: http://localhost:8080/rest/user

Admin: http://localhost:8080/rest/admin

Use Basic Auth in your HTTP request headers with the defined username/password.

🔐 Example curl commands
bash
Copy
Edit
# Public
curl http://localhost:8080/rest/public

# User
curl -u user:user-pass http://localhost:8080/rest/user

# Admin
curl -u admin:admin-pass http://localhost:8080/rest/admin
✅ Dependencies Used
Spring Boot

Spring Web

Spring Security

📄 application.properties
properties
Copy
Edit
spring.application.name=security.basicauth

# Default Spring Security credentials (not used since in-memory users are defined)
spring.security.user.name=spring
spring.security.user.password=security
🧠 Notes
Passwords are encrypted using BCryptPasswordEncoder.

InMemoryUserDetailsManager is used for user management (no DB integration).

Ideal for learning and small-scale applications.

📚 References
Spring Security Docs

Spring Boot Security

