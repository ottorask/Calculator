# Calculator Application

A simple Java calculator application built with JavaFX GUI framework.

## Features

- **Basic Arithmetic Operations**: Addition (+), Subtraction (-), Multiplication (*), Division (/), and Percent (%)
- **User Interface**: Simple GUI button layout
- **Error Handling**: Handling of division by zero and invalid operations
- **Functionality**: Reset calculator state with clear button
- **Organized Code**: Clean Java classes for organized code

## Project Structure

```
Calculator/
├── pom.xml                                  # Maven configuration and dependencies
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── calculator/
│       │           ├── Calculator.java          # Main application entry point
│       │           ├── CalculatorController.java # GUI controller
│       │           └── CalculatorEngine.java    # Core calculation logic
│       └── resources/
│           └── fxml/
│               └── calculator.fxml              # JavaFX UI layout
```

## Technologies Used

- **Java 21**: Core programming language
- **JavaFX**: GUI framework for creating the user interface
- **Event-Driven Programming**: Button click handling and user interactions

## How to Run

1. Ensure you have Java 21 or higher installed
2. Build the project: `mvn clean compile`
3. Run the application: `mvn javafx:run`

Alternatively, you can use:
- `mvn clean package` to create a JAR file
- `java -jar target/calculator-1.0-SNAPSHOT.jar` to run the JAR

## Development Approach

This project demonstrates:
- **Separation of Concerns**: UI logic separated from business logic
- **Object-Oriented Design**: Clean class structure and inheritance
- **Event Handling**: Proper implementation of JavaFX event listeners
- **Error Management**: Robust error handling for edge cases
- **Code Documentation**: Comprehensive comments for maintainability

## Future Enhancements

- Scientific calculator functions (sin, cos, tan, etc.)
- Memory functions (M+, M-, MR, MC)
- History of calculations
- Keyboard input support

---