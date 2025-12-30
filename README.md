# 🛒 Product Management REST API using Spring Boot

This is a simple **Spring Boot REST API** that performs **CRUD operations** on products stored in a MySQL database.  
It demonstrates how to create, read, update, and delete product details using RESTful endpoints.

---

## 🚀 Features
- Add new products
- View all products
- View a single product by ID
- Update product details
- Delete product by ID
- Stores data using MySQL & Spring Data JPA

---

## 🛠 Technologies Used
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

---

## 📦 Project Structure
```
src/main/java/com/example/product
│
├─ controller
│   └─ ProductController.java
│
├─ service
│   └─ ProductServices.java
│
├─ repository
│   └─ ProductRepository.java
│
└─ model
    └─ Product.java
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the project
```bash
git clone https://github.com/yourusername/product-api.git
cd product-api
```

### 2️⃣ Configure database  
Edit `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Run the application
```bash
./mvnw spring-boot:run
```

Server runs at 👉 `http://localhost:8080`

---

## 🧾 API Endpoints

| Method | Endpoint | Description | Body Required |
|--------|----------|-------------|---------------|
| GET    | `/product` | Get all products | ❌ |
| GET    | `/product/{productId}` | Get product by ID | ❌ |
| POST   | `/product` | Add new product | ✔ JSON |
| PUT    | `/product/{productId}` | Update product | ✔ JSON |
| DELETE | `/product/{productId}` | Delete product | ❌ |

---

## 🧠 Example JSON Request

```json
 {
    "productId": id,
    "productName": "ProductName",
    "productDescription": "ProductDescription",
    "productPrice": ProductPrice,
    "productQuantity": ProductQuantity
  }
```

---

## 🔍 Sample CURL Commands

### ➕ Add Product
```bash
curl -X POST -H "Content-Type: application/json" -d '{"productName":"Laptop Stand","productDescription":"Aluminum stand","productPrice":999.0,"productQuantity":15}' http://localhost:8080/product
```

### 📌 Update Product (example: ID = 1)
```bash
curl -X PUT -H "Content-Type: application/json" -d '{"productName":"Gaming Mouse","productDescription":"RGB Mouse","productPrice":1299,"productQuantity":12}' http://localhost:8080/product/1
```

### ❌ Delete Product (example: ID = 1)
```bash
curl -X DELETE http://localhost:8080/product/1
```

---

## 🤝 Contributing
Feel free to submit pull requests or enhancements!

---

## 📜 License
This project is licensed under the **MIT License**.

---
