# Selenide Code Challenge

This project contains the solution to the automation challenge using **Selenide**. The project follows the **Page Object Model (POM)** pattern to organize code in a modular and reusable way. The objective is to automate UI test cases to ensure the correct functionality of a web application.

## Prerequisites

- **Java 11+**: [Download Java 11](https://www.oracle.com/java/technologies/downloads/#java11)  
  Verify installation: `java -version`

- **Maven**: [Download Maven](https://maven.apache.org/download.cgi)  
  Verify installation: `mvn -v`

- **Set Environment Variables**: Follow [this tutorial](https://www.tutorialspoint.com/maven/maven_environment_setup.htm).

- **IntelliJ IDEA**: [Download IntelliJ](https://www.jetbrains.com/es-es/idea/download/#section=windows)

## Technologies Used

- **Selenide**: For UI automation.
- **Java**: Primary programming language.
- **TestNG**: For structuring and executing tests.
- **Maven**: For dependency management and test execution.

## Project Structure

- `/src/test/java`: Contains test files organized into classes and methods following the **Page Object Model (POM)** pattern.
  - `/pages`: Contains classes representing the pages of the application.
  - `/tests`: Contains test cases that use the page classes to perform actions.
- `pom.xml`: File for configuring dependencies and Maven plugins.

## How to Run

1. Open your terminal and navigate to the root directory of the project.
2. Run the tests using Maven with the following command:
   ```bash
   mvn clean test

## NOTES
- If you want to run the test cases without using the headless mode follow these instructions please:
  - Go to HerokuApp > Base Test class
  - Modify the following line:
    - `Configuration.headless = true` to `Configuration.headless = false`
