# eCommerce API

This is a Spring project for an eCommerce API that allows users to manage products, addresses, and orders.

## Technologies Used

- Java
- Spring Boot
- MySQL
- Hibernate
- RESTful API

## Setup

1. Clone the repository:


2. Configure the database connection in the `application.properties` file:


5. The API will be accessible at `http://localhost:8080`.

## Endpoints

The following endpoints are available:

### Users

- `GET /users`: Get all users.
- `GET /users/{userId}`: Get a user by ID.

### Products

- `GET /products`: Get all products.
- `GET /products?category={category}`: Get products by category.
- `DELETE /products/{productId}`: Delete a product by ID.

### Addresses

- `GET /addresses`: Get all addresses.
- `GET /addresses/{addressId}`: Get an address by ID.

### Orders

- `GET /orders/{orderId}`: Get an order by ID.
- `POST /orders`: Create an order.

## Data Models

The project includes the following data models:

- User
    - id: integer
    - name: string
    - email: string
    - password: string
    - phoneNumber: string

- Product
    - id: integer
    - name: string
    - price: integer
    - description: string
    - category: string
    - brand: string

- Address
    - id: integer
    - name: string
    - landmark: string
    - phoneNumber: string
    - zipcode: string
    - state: string
    - userID: foreign key mapping

- Order
    - id: integer
    - userID: integer (foreign key mapping)
    - productID: integer (foreign key mapping)
    - addressID: integer (foreign key mapping)
    - productQuantity: integer

# Description:
The eCommerce API project is a Spring-based web application that provides a set of endpoints to manage users, products, addresses, and orders for an eCommerce platform. It utilizes the Spring Boot framework along with MySQL as the underlying database.

# Key Features:
- User Management: The API allows users to be created and retrieved. Each user has properties such as name, email, password, and phone number.
- Product Management: Products can be created, retrieved, and deleted. Each product contains properties like name, price, description, category, and brand.
- Address Management: Users can manage their addresses by creating, retrieving, and updating them. Address properties include name, landmark, phone number, zipcode, state, and a foreign key mapping to the user who owns the address.
- Order Placement: Users can place orders by providing their user ID, product ID, address ID, and the quantity of the product they want to order. Orders are created with a unique ID and are associated with the corresponding user, product, and address.
- Retrieval of Orders, Users, and Products: The API provides endpoints to retrieve specific orders by their ID, retrieve users by their ID, and retrieve all products. Additionally, products can be filtered based on their category using query parameters.
- Deletion of Products: Products can be deleted from the system by specifying their ID.
