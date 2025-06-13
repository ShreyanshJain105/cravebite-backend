# 🍽️ Food Order System – Backend

This is the **backend service** for the Food Order System, a modern and scalable platform for food ordering and management. Built with **Spring Boot**, it provides a RESTful API for frontend clients, supports secure user authentication, integrates **AWS S3** for media storage, **Razorpay** for online payments, and uses **MongoDB** as the primary database.

---

## 🚀 Key Features

- 🔐 JWT-based user authentication and authorization
- 📦 RESTful API endpoints for products, orders, users, and categories
- 💳 Razorpay payment gateway integration
- ☁️ AWS S3 integration for image/file upload
- 🗂️ Role-based access for Admin and User
- 📊 Order and payment tracking
- 🌍 CORS-enabled for frontend consumption

---

## 🛠️ Tech Stack

| Layer         | Technology           |
|---------------|----------------------|
| Language      | Java 17              |
| Framework     | Spring Boot 3.x      |
| Database      | MongoDB (NoSQL)      |
| Cloud Storage | AWS S3               |
| Payments      | Razorpay REST API    |
| Auth          | Spring Security + JWT|
| Build Tool    | Maven                |
| Deployment    | Docker, AWS EC2      |

---

🚀 Running the Application
Prerequisites
Java 17+

Maven 3.x

MongoDB running locally or in cloud

AWS S3 bucket configured

Razorpay account

Run locally:

mvn clean install

mvn spring-boot:run

API will be available at:
http://localhost:8080/api

📦 API Overview
Full Swagger/OpenAPI documentation available at /swagger-ui.html

Authentication
POST /api/auth/register – Register user

POST /api/auth/login – Login & get JWT

Products
GET /api/food – Get all food items

POST /api/food – Add food item (Admin)

DELETE /api/food/{id} – Delete item (Admin)

Orders
POST /api/orders – Place an order

GET /api/orders/user – View user orders

GET /api/orders/admin – View all orders (Admin)

Payment
POST /api/payment/create-order – Create Razorpay order

POST /api/payment/verify – Verify signature from Razorpay

🧪 Testing
Use Postman or Swagger UI to test endpoints. Unit and integration tests are located under src/test.

☁️ Deployment
This application can be containerized and deployed to AWS:

# Build JAR
mvn clean package

# Docker Build
docker build -t food-order-backend .

# Run Locally
docker run -p 8080:8080 food-order-backend
Alternatively, deploy the JAR to an EC2 instance, with MongoDB Atlas and S3 configured via environment variables or Secrets Manager.
