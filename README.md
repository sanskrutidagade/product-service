📘 Product Service – Spring Boot Microservice

A simple Spring Boot microservice providing CRUD operations for managing products.

Built using Spring Boot, JPA, H2 database, and layered architecture.

🚀 Features

Create a new product

Get a product by ID

Get all products

Update a product

Delete a product

In-memory H2 database

JPA repository

Service-layer business logic

REST Controller using JSON APIs

🏗 Tech Stack
Java 17
Spring Boot
Spring Web
Spring Data JPA
H2 Database
Lombok
Maven
Postman (API testing)

📂 Project Structure
src/main/java/com.springboot.productservice
│              
├── controller
│   └── ProductController.java           
│                                                                                                                                           
├── service                                                                                                                                
│   └── ProductService.java                                                                                                                  
│   └── ProductServiceImpl.java                                                                                                                
│                                                                                                                                              
├── repository                                                                                                                                  
│   └── ProductRepository.java                                                                                                                  
│                                                                                                                                                
├── entity                                                                                                                                       
│   └── Product.java                                                                                                                             
│                                                                                                                                                
└── ProductServiceApplication.java                                                                                                               

🔧 How to Run
1. Clone the repository
  git clone <repo-url>
2. Import in IntelliJ as Maven project
3. Run the application
4. H2 Console:
   http://localhost:8080/h2-console
5. Test APIs using Postman

📡 API Endpoints

Create Product
POST /api/products
Body:
{
  "name": "Laptop",
  "price": 50000,
  "quantity": 1
}

Get All Products
GET /api/products

Get Product by ID
GET /api/products/{id}

Update Product
PUT /api/products/{id}

Delete Product
DELETE /api/products/{id}

📝 Status
This is the first microservice in a multi-service architecture.
Next services (Order Service, API communication, Eureka, Feign) will be added later.


👤 Developer
Sanskruti Dagade — Java & Spring Boot Developer
https://www.linkedin.com/in/sanskrutidagade
sanskrutidagade1510@gmail.com




