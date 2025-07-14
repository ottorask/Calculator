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
src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── calculator/
│   │           ├── Calculator.java          # Main application entry point
│   │           ├── CalculatorController.java # GUI controller
│   │           └── CalculatorEngine.java    # Core calculation logic
│   └── resources/
│       └── fxml/
│           └── calculator.fxml              # JavaFX UI layout
```

## Technologies Used

- **Java 21**: Core programming language
- **JavaFX**: GUI framework for creating the user interface
- **Event-Driven Programming**: Button click handling and user interactions

## How to Run

1. Ensure you have Java 21 or higher installed
2. Compile the project: `javac -d bin src/main/java/com/calculator/*.java`
3. Run the application: `java -cp bin com.calculator.Calculator`

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