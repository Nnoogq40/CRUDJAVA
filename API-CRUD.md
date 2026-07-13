API CRUD 
This is a RESTful API built with Spring Boot to manage [e.g., products, users, tasks] using a MySQL database.

Tech Stack
Java 21
Spring Boot 3.3.1
Spring Data JPA
MySQL
Maven

Project Architecture

The project follows the standard Spring MVC design pattern, ensuring a clear separation between data, logic, and exposition layers:
Model (@Entity): Represents the database structure.
Repository (JpaRepository): Handles CRUD (Create, Read, Update, Delete) operations automatically.
Controller (@RestController): Exposes the endpoints to be consumed by Postman or any Frontend application.

Setup & Configuration
To run this project, ensure your environment is configured:

Database: Create a MySQL database named api_crud.
Configuration: Update your src/main/resources/application.properties with your credentials:

Properties
spring.datasource.url=jdbc:mysql://localhost:3307/api_crud?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=YOUR_PASSWORD

Execution:
Bash :  mvn spring-boot:run

Contributing
Feel free to fork this repository and submit pull requests if you would like to contribute or improve this project.
