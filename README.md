# GitTasks
This repo is to practice Git features
# Calculator Program

The Calculator program is a simple command-line tool that performs basic mathematical calculations. It allows users to input arithmetic expressions and obtain the computed result.

## Features

- Addition: Add two or more numbers together.
- Subtraction: Subtract one number from another.
- Multiplication: Multiply two or more numbers.
- Division: Divide one number by another.

## Prerequisites

- Java Development Kit (JDK) 8 or later installed on your machine.
- Command-line interface (CLI) or terminal to run the program.

## Build and Install

To build and install the project, follow these steps:

### Maven

1. Ensure that you have Apache Maven installed on your system. If not, you can download it from the Apache Maven website (https://maven.apache.org/download.cgi) and follow the installation instructions.

2. Open a terminal or command prompt and navigate to the root directory of the project.

3. Build the project by running the following command:

   ```shell
   mvn clean install

Maven will compile the source code, run tests, and package the modules. The JAR and WAR files will be generated in the target directories of the respective modules.

After a successful build, you can find the following artifacts:

- admin/target/admin.jar: The JAR file generated by the "admin" module.
- web/target/web.war: The WAR file generated by the "web" module.

### Gradle
1. Open a terminal or command prompt and navigate to the root directory of the project.

2. Build the project by running the following command:

   ```shell
   ./gradlew clean build

Gradle will compile the source code, run tests, and package the modules. The JAR and WAR files will be generated in the build directories of the respective modules.

After a successful build, you can find the following artifacts:

- admin/build/libs/admin-1.0-SNAPSHOT.jar: The JAR file generated by the "admin" module.
- web/build/libs/web-1.0-SNAPSHOT.war: The WAR file generated by the "web" module.

### Module-specific Code
Each module has its own source code directory where you can add your module-specific Java code:

- admin/src/main/java: Add your Java code specific to the "admin" module here.
- web/src/main/java: Add your Java code specific to the "web" module here.

### Dependencies
If your modules have dependencies on external libraries, you can specify them in the respective module's pom.xml file under the <dependencies> section. Maven will automatically download and manage the required dependencies.

### Contributing
If you'd like to contribute to this project, please follow these steps:

1. Fork the repository on GitHub. 
2. Create a new branch for your changes:

   ```shell
   git checkout -b feature/your-feature
3. Make your modifications and add any necessary code or documentation.
4. Commit your changes:
   ```shell
   git commit -m "Add your commit message here"

5. Push your branch to your forked repository:
   ```shell
   git push origin feature/your-feature

6. Open a pull request on GitHub, describing your changes and the rationale behind them.

## Getting Started

1. Clone the repository or download the source code.

2. Compile the Java source code:

   ```shell
   javac Calculator.java

## License
This project is licensed under free license.

## Run the Calculator program
   ```shell
   java Calculator