# JavaFX Calculator Application

A lightweight, user-friendly desktop calculator application built with Java Swing. This calculator provides a graphical interface for performing basic arithmetic operations with a clean and intuitive design.

## Features

- **Basic Arithmetic Operations**: Addition, subtraction, multiplication, and division
- **User-Friendly Interface**: Clean and intuitive GUI built with Java Swing
- **Decimal Support**: Perform calculations with decimal numbers
- **Error Handling**: Graceful error handling for invalid operations
- **Clear Functions**:
  - **Clear (C)**: Reset calculator to initial state
  - **Backspace**: Remove the last entered digit
  - **Clear All**: Clear the entire calculation
- **Real-time Display**: View your input and results on the display screen

## Technologies Used

- **Java 11**: Core programming language
- **Swing**: GUI framework for the desktop interface
- **Maven**: Build and dependency management tool
- **JUnit 4**: Unit testing framework

## Prerequisites

Before you begin, ensure you have the following installed on your system:

- **Java Development Kit (JDK) 11** or higher
  - Download from [Oracle JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
  - Or use OpenJDK: `choco install openjdk11` (Windows) or `brew install openjdk@11` (macOS)
  
- **Apache Maven 3.6.0** or higher
  - Download from [Maven Official Site](https://maven.apache.org/download.cgi)
  - Or install via package manager: `choco install maven` (Windows) or `brew install maven` (macOS)

- **Git** (optional, for cloning the repository)
  - Download from [Git Official Site](https://git-scm.com/)

## Installation

### Option 1: Clone from GitHub

```bash
git clone https://github.com/your-username/javafx-CALCULATOR.git
cd javafx-CALCULATOR
```

### Option 2: Download as ZIP

1. Download the project as a ZIP file
2. Extract it to your desired location
3. Navigate to the project directory

## Building the Project

### Using Maven

Build the project using Maven:

```bash
mvn clean install
```

This command will:
- Clean previous build artifacts
- Download project dependencies
- Compile the source code
- Run unit tests
- Create a JAR file in the `target/` directory

### Compile Only (without running tests)

```bash
mvn clean compile
```

## Running the Application

### Method 1: Using Maven (Recommended)

```bash
mvn exec:java -Dexec.mainClass="com.rakshana.calculator.App"
```

### Method 2: Using the JAR File

After building with Maven:

```bash
java -jar target/javafx-CALCULATOR-1.0-SNAPSHOT.jar
```

### Method 3: From IDE

If using an IDE like IntelliJ IDEA or Eclipse:
1. Open the project
2. Navigate to `src/main/java/com/rakshana/calculator/App.java`
3. Right-click and select "Run" or "Run As" → "Java Application"

## Usage

1. **Enter Numbers**: Click the number buttons (0-9) to enter numbers
2. **Enter Operations**: Click an operation button (+, -, *, /)
3. **Complete Calculation**: Press the "=" button to see the result
4. **Clear Display**: Use the "C" button to reset the calculator
5. **Backspace**: Use the "Back" button to remove the last digit
6. **Decimal Point**: Click "." to add a decimal point (only one per number)

### Example Calculations

- Addition: `5 + 3 =` → Result: `8`
- Subtraction: `10 - 4 =` → Result: `6`
- Multiplication: `6 * 7 =` → Result: `42`
- Division: `20 / 4 =` → Result: `5`
- Decimal: `3.5 + 2.5 =` → Result: `6`

## Testing

Run the unit tests to verify the calculator engine functionality:

```bash
mvn test
```

This will execute all tests in the `src/test/` directory. The project includes comprehensive unit tests for the `CalculatorEngine` class to ensure all operations work correctly.

### View Test Reports

After running tests, view the detailed report:

```bash
# On Windows
start target/surefire-reports/index.html

# On macOS/Linux
open target/surefire-reports/index.html
```

## Project Structure

```
javafx-CALCULATOR/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── rakshana/
│   │               └── calculator/
│   │                   ├── App.java                 # Main GUI application
│   │                   └── CalculatorEngine.java    # Calculator logic engine
│   └── test/
│       └── java/
│           └── com/
│               └── rakshana/
│                   └── calculator/
│                       └── CalculatorEngineTest.java # Unit tests
├── target/                  # Build output directory
├── pom.xml                 # Maven configuration file
└── README.md               # Project documentation
```

## File Descriptions

### Main Application Files

- **[App.java](src/main/java/com/rakshana/calculator/App.java)**: 
  - Entry point for the application
  - Creates the GUI using Java Swing
  - Manages user interactions and button clicks
  - Displays calculation results

- **[CalculatorEngine.java](src/main/java/com/rakshana/calculator/CalculatorEngine.java)**:
  - Core calculator logic
  - Processes user input
  - Performs arithmetic operations
  - Maintains calculator state

- **[CalculatorEngineTest.java](src/test/java/com/rakshana/calculator/CalculatorEngineTest.java)**:
  - Unit tests for the calculator engine
  - Verifies all operations work correctly
  - Ensures edge cases are handled

## Maven Configuration

The `pom.xml` file includes:

- **Java Version**: Targets Java 11
- **Dependencies**: JUnit 4.12 for testing
- **Build Plugins**:
  - Maven Compiler Plugin: Compiles Java code
  - Maven JAR Plugin: Creates JAR artifacts
  - Maven Shade Plugin: Packages all dependencies into a single JAR

## Troubleshooting

### Issue: "Java not found" error
**Solution**: Ensure JDK 11 is installed and added to your system PATH
```bash
java -version
```

### Issue: "Maven not found" error
**Solution**: Ensure Maven is installed and added to your system PATH
```bash
mvn -version
```

### Issue: Build fails with dependency errors
**Solution**: Update Maven repositories and try again
```bash
mvn clean install -U
```

### Issue: GUI doesn't appear when running
**Solution**: Ensure you're using the correct main class:
```bash
mvn exec:java -Dexec.mainClass="com.rakshana.calculator.App"
```

## Future Enhancements

Potential features for future versions:

- Advanced operations (square root, percentage, power)
- Calculation history
- Different themes (light/dark mode)
- Keyboard support for number input
- Memory functions (M+, M-, MR, MC)
- Scientific calculator mode
- Multi-language support

## Contributing

Contributions are welcome! To contribute to this project:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

**Rakshana** - [GitHub Profile](https://github.com/your-username)

## Support

For issues, questions, or suggestions, please create an issue on the [GitHub Issues](https://github.com/your-username/javafx-CALCULATOR/issues) page.

## Changelog

### Version 1.0 (Current)
- Initial release
- Basic arithmetic operations
- Clean GUI interface
- Comprehensive unit tests
- Maven build configuration

---

**Last Updated**: February 2026

Made with ❤️ by Rakshana
