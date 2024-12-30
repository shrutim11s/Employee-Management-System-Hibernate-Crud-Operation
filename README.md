# HibernateEmpCRUD
Employee Management System manages Employee database using Hibernate, ORM tool. Project is developed by performing all CRUD, search operations on database.

hibernate.cfg.xml
This is hibernate configuration file.It contains configuration details of Session Factory and resource of hibernate mapping file. It contains database connection details such as connection url, username, password, dialect, Driver class etc. I used mysql jdbc driver in this project.

How to use code
1. Setup the Project
Include necessary dependencies in your pom.xml (if using Maven) or add JAR files to your project manually.
2. Create the Database
Create a database like employee_management and a table as employees
Add some annotations like @ID for columns and @Entity for rows in database by using MySQL query browser
3. Configure Hibernate
Create a Hibernate configuration file hibernate.cfg.xml in the src/main/resources directory
4. Implement CRUD Operations
Save an Employee, Read an Employee, Update an Employee, Delete an Employee
5.Hibernate Utility Class
Create a utility class for managing Hibernate sessions
6. Run the Application
Create a main class to test CRUD operations
7. Run and Debug
Run the application and verify CRUD operations by checking your database.
Please Ensure you have the MySQL server running.




