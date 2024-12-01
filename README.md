# Vacation Checkout Application

This project is a Java Spring Boot Web App designed for managing vacation packages and customer orders with a checkout form. It demonstrates the integration of a MySQL database with a RESTful API and is equipped with a modular architecture for scalability and maintainability.

## Tech Stack Used

- **Backend**: Java, Spring Boot, Spring Data JPA, Rest Repositories, Lombok
- **Database**: MySQL
- **Frontend**: Angular (prebuilt and integrated)

## Dependencies

- Spring Data JPA
- Rest Repositories
- MySQL Driver
- Lombok

## Project Structure

The project is organized into four primary packages, each serving a distinct purpose:

### **Controller**

- Contains the custom API endpoints.
- Handles incoming HTTP requests and interacts with the service layer to process them.

### **Services**

- Implements the business logic required for checkout operations.
- Serves as a bridge between the controller layer and the repository layer.

### **DAO (Data Access Object)**

- Contains interfaces extending the JPA Repository for database access.
- Utilizes Spring Data REST to expose CRUD operations automatically for the repositories.

### **Entities**

- Defines the structure of the data objects used by the web application.
- Includes entity classes annotated for ORM mapping with the database.


