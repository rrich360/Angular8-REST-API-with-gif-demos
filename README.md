# AngularJS-REST-API-Demo
Consuming a RESTful web service with AngularJS, we can manage employee records.
Tech stack used includes :
Angular JS, Spring boot, RESTful API, JPA, Hibernate, MySQL, and CRUD Principles.


# CRUD App Functionality
![CRUD-functionality](https://user-images.githubusercontent.com/20470279/106377706-e2f11400-636c-11eb-9341-fec9d5e729a3.gif)



# 1.	Register the application module(AngularJS)
 	When registering the module, you need to co-pass the “ngResource” which is responsible for calling the REST API.
 	Create the factory method to call it in the app.
 	In this project, I created a CRUD service for employees. 

 #   2. Create a controller function for your web service.
 	In Angular, you need to define the scope for employee service to run queries and functions.
 	In my controller, I defined a method for saving, updating, and deleting employee data. 

 #  3.Create a HTML template to access and display results.
 	I created a submission form that displays the Employee Name, Salary, and Department. It takes input and there is a submit button for saving the record.
 	I created a table in a separate div to displays the records from the database.  
  
  
  # 3.5 CRUD App Design
  ![CRUD-App-Design](https://user-images.githubusercontent.com/20470279/106377147-e6829c00-6368-11eb-8069-0ad26d9f2522.gif)
  

# 4. Include dependencies(pom.xml)
 	You want to include dependencies for jpa, spring-boot-starter web, dev-tools, and since I’m using phpMyAdmin, MySQL dependency. 

# 5. Configure the app properties for connecting to a database.
  My URL is configured to use MySQL connection.

# 6. Create table for Employees with entity annotations and listeners.
 	The entity will create the attributes that will store the data in the table.

# 7. Create Repository Interface, then implement methods with service class. 
 	The EmployeeService Class uses the interface object from the repository to implement methods from the jpa interface like save( ), findAll( ), and delete( ).
# 8. Create a controller class to manage the web services. 
 	In this controller class, I have created request methods for CRUD protocol, which includes the following: 
 	GET(create)
 	POST(read)
 	PUT (update)
 	DELETE(delete)
# 9. Create a spring app (Crud) to run and initiate all the arguments.
 This allows the web services to run according to the methods created from the repository, resource, and service class.

# 10. Create the web app into a maven project then run it as a java application. 
Verify the output and functionality of the CRUD App. 

# 10.5 Maven-Build
![maven-build](https://user-images.githubusercontent.com/20470279/106377594-1a12f580-636c-11eb-8052-b6bddb1dede0.gif)




