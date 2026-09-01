# Student Management REST API

A RESTful CRUD API built with Spring Boot, Spring Data JPA, and MySQL for managing student records.

## Features
- Full CRUD operations (Create, Read, Update, Delete) for student records
- Layered architecture: Controller → Service → Repository
- Proper HTTP status codes using ResponseEntity (200, 201, 204, 404)
- Persistent storage with MySQL via Spring Data JPA

## Tech Stack
- Java 17
- Spring Boot 4
- Spring Data JPA
- MySQL
- Maven

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | /students | Get all students |
| GET | /students/{id} | Get a student by ID |
| POST | /students | Add a new student |
| PUT | /students/{id} | Update a student by ID |
| DELETE | /students/{id} | Delete a student by ID |

## How to Run
1. Clone this repository
2. Update `application.properties` with your MySQL credentials
3. Run `DemoApplication.java`
4. Test endpoints using Postman at `http://localhost:8080/students`

## Author
Mohd Nahar