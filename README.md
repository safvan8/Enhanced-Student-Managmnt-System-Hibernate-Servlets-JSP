# Student Management Application

This is a web-based student management application created using Servlet technology and used JSP and JSTL for the view layer. The application is designed to manage student data and provide basic CRUD (Create, Read, Update, Delete) functionality. The application uses a layered approach and implements the Factory and Singleton design patterns.

## Technologies Used

- Servlet API
- JSP + JSTL in view
- Hibernate as ORM tool
- Apache Tomcat 9.0 server

## Functionality

The student management application provides the following functionality:

- Add new student
- View all students
- Update student details
- Delete student
- Search for a student by ID
- Login feature with Session Management

## Customizations

The application adds a domain name at the end of all user's login email. For example, if the user entered "safvan@gmail.com", it will not add anything, but if the user only entered "safvan", then it will add "@gmail.com" at the end.

## Usage

To use this application, follow the steps below:

1. Clone the repository to your local machine.
2. Update the database configurations in the `hibernate.cfg.xml` file.
3. Access the application on `http://localhost:{port}/student-management-app/`

## Note

If you want to modify the application, you can update the `hibernate.cfg.xml` file to change the database specifications.
