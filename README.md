# AngularJS-REST-API-Demo
Consuming a RESTful web service with AngularJS, we can manage employee records.
Tech stack used includes :
Angular JS, Spring boot, RESTful API, JPA, Hibernate, MySQL, and CRUD Principles.

# 1.	Begin by registering the application module(AngularJS)
 	When registering the module, you need to co-pass the “ngResource” which is responsible for calling the REST API.
 	Create the factory method to call it in the app.
 	In this project, I created a CRUD service for employees. 

 #   2. Next you need to create a controller function for your web service.
 	In Angular, you need to define the scope for employee service to run queries and functions.
 	In my controller, I defined a method for saving, updating, and deleting employee data. 

 #  3.Next, create a HTML file to access and display results.
 	I created a submission form that displays the Employee Name, Salary, and Department. It takes input and there is a submit button for saving the record.
 	I created a table in a separate div to displays the records from the database.  
  
  
  # 3.5 CRUD App Design
  ![CRUD-App-Design](https://user-images.githubusercontent.com/20470279/106377147-e6829c00-6368-11eb-8069-0ad26d9f2522.gif)
  

# 4. Next, you need to include dependencies in your pom.xml
 	You want to include dependencies for jpa, spring-boot-starter web, dev-tools, and since I’m using phpMyAdmin, MySQL dependency. 

# 5. Then you need to configure the application properties for connecting the web app to a database. My URL is set to use mysql connection.

# 6. Next, you need to create the table for Employees by implementing entity annotation and entity listeners.
 	The entity will create the attributes that will store the data in the table.

# 7. Then you will need to create a Repository interface for the Employee service class to implement methods. 
 	The EmployeeService Class uses the interface object from the repository to implement methods from the jpa interface like save( ), findAll( ), and delete( ).
# 8. Then you need to create a controller class to manage the web services for requesting and responding from the client to the server and back. 
 	In this controller class, I have created request methods for CRUD protocol, which includes the following: 
 	GET(create)
 	POST(read)
 	PUT (update)
 	DELETE(delete)
# 9. Next, I created a spring app called, “Crud”, to run and initiate all the arguments in the spring app class.
 This allows the web services to run according to the methods created from the repository, resource, and service class.

# 10. Next, I created the web app into a maven project and run it as a java application. 
Verify the output and functionality of the CRUD App. 
