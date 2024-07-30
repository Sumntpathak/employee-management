# employee-management

# Employee Management System

## Overview

The **Employee Management System** is a Spring Boot-based application designed to manage employee records efficiently. This application allows you to perform CRUD (Create, Read, Update, Delete) operations on employee data. It leverages Spring Boot, Spring Data JPA, and MySQL for robust and scalable data management.

## Features

- **Create**: Add new employee records.
- **Read**: View details of all employees or a specific employee.
- **Update**: Modify existing employee information.
- **Delete**: Remove employee records.
- **Persistent Storage**: Uses MySQL for data persistence.
- **RESTful API**: Exposes endpoints for CRUD operations.

## Technologies Used

- **Spring Boot**: For building the application.
- **Spring Data JPA**: For data persistence and database interactions.
- **MySQL**: For the relational database.
- **H2**: For in-memory database testing (optional).
- **Git**: For version control.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- MySQL (or H2 for testing)
- Git

### Clone the Repository

```sh
git clone https://github.com/Sumntpathak/employee-management.git
cd employee-management
```

### Configure Database

1. **MySQL**: Update the `src/main/resources/application.properties` file with your MySQL database credentials.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
    spring.datasource.username=root
    spring.datasource.password=password
    spring.jpa.hibernate.ddl-auto=update
    ```

2. **H2**: If using H2, update the file to use H2 settings:

    ```properties
    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driver-class-name=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
    ```

### Build and Run

1. **Build the Project**:

    ```sh
    mvn clean install
    ```

2. **Run the Application**:

    ```sh
    mvn spring-boot:run
    ```

   Alternatively, you can run the JAR file:

    ```sh
    java -jar target/employee-management-0.0.1-SNAPSHOT.jar
    ```

### API Endpoints

- **Create Employee**: `POST /api/employees`
- Request Body: `Employee` object
- **Get All Employees**: `GET /api/employees/all`
- **Get Employee by ID**: `GET /api/employees/{id}`
- **Update Employee**: `PUT /api/employees/{id}`
- Request Body: `Employee` object
- **Delete Employee**: `DELETE /api/employees/{id}`

### Testing

You can run unit tests using Maven:

```sh
mvn test
```

### Contributing

Contributions are welcome! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push the branch (`git push origin feature-branch`).
5. Create a new Pull Request.

### License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Thanks to [Spring Boot](https://spring.io/projects/spring-boot) for providing a powerful framework for building Java applications.
- Thanks to [MySQL](https://www.mysql.com/) for providing a reliable database system.

