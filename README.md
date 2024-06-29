# TaskAutomationSelenium

- In this project, working with Selenium Java version 4.18.1, Maven version 3.0.0-M5, TestNG version 7.8.0, all in the Eclipse IDE in pom.xml file

 #  Objective
- task is to provide a suite of tests, using TestNG, Selenium Webdriver

#  Website
- https://www.saucedemo.com/

# Project Structure
 encapsulate the elements in a separate class to improve the maintainability and readability of my code. This is often referred to as the Page Object Model (POM) pattern. 
 
1. POM Pattern of my Project :
   ```css
   Calculator-Tests
   ├── pom.xml
   ├── testng.xml
   ├── src
   │   ├── main
   │   │   └── java
   │   │       
   │   │       
   │   └── test
   │       └── java
   │           └── com
   │           │    └── google
   │           │        └── selenium
   │           │                 ├──test
   │           │               │   ├── Test1.java
   │           │               │   ├── test2.java
   │           │               │   └── test3.java
   │           │               │   └── Test4.java
   │           │               │   └── Test5.java
   │           └── pages
   │                 └── LoginPage.java
   │                   
   └── README.md


# Pages
- LoginPage.java: Contains web elements and actions for the login page.
  
# Tests

- Test1.java: Verifies the presence of the username, password fields, and login button.
- test2.java: Tests a valid login scenario.
- test3.java: Tests an invalid login scenario.
- Test4.java: Tests login with an empty username field.
- Test5.java: Tests login with an empty password field.

# Prerequisites
-Java Development Kit (JDK) 8 or higher
-Maven (for dependency management)
-ChromeDriver (matching your version of Chrome)
-An IDE like Eclipse

# Running Tests

1. Using TestNG XML:
   ```xml
     <?xml version="1.0" encoding="UTF-8"?>
 
    <suite name="First">
      <test name="Default test" verbose="2">
          <classes>
              <class name="com.google.selenium.test.Test1"/>
              <class name="com.google.selenium.test.test2"/>
              <class name="com.google.selenium.test.test3"/>
              <class name="com.google.selenium.test.Test4"/>
              <class name="com.google.selenium.test.Test5"/>
          </classes>
    </test>  
</suite>  


- Run the tests using the following command:
  ```cmd
      mvn test -DsuiteXmlFile=testng.xml
  
2. Using IDE:
- Open the project in your IDE and run the individual test classes or the entire suite using TestNG configurations.

# Tests Result
![Screenshot 2024-06-29 163518](https://github.com/Yassmin-gamal/TaskAutomationSelenium/assets/66153260/aa237ade-d389-4c3f-b23a-9dc1792c98eb)

![Screenshot 2024-06-29 163730](https://github.com/Yassmin-gamal/TaskAutomationSelenium/assets/66153260/539d4467-b83c-44b2-b7a2-60baa3dcbf06)



