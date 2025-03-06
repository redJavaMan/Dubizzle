# Dubizzle Automation Testing Framework

A Selenium-based test automation framework for testing the Dubizzle Dubai website.

## Overview

This project is an automation framework built with Selenium WebDriver and TestNG to test functionality on the Dubizzle Dubai marketplace platform. The framework follows the Page Object Model (POM) design pattern for better maintainability and scalability.

## Project Structure

```
Dubizzle/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── pages/
│   │           ├── HomePage.java
│   │           └── TabletPage.java
│   └── test/
│       └── java/
│           ├── Base/
│           │   └── BaseTest.java
│           └── Tests/
│               └── SortTest.java
├── pom.xml
└── README.md
```

## Features

- Page Object Model design pattern implementation
- TestNG testing framework for test organization and execution
- Base test configuration for setup and teardown operations
- Chrome WebDriver implementation

## Current Test Scenarios

- **SortTest**: Verifies the sorting functionality (price low to high) in the Tablets category

## Technology Stack

- Java 8
- Selenium WebDriver 4.10.0
- TestNG 7.4.0
- Maven

## Prerequisites

- Java JDK 8 or higher
- Maven
- Chrome browser
- ChromeDriver (compatible with your Chrome browser version)

## Setup and Configuration

1. Clone this repository:
   ```
   git clone https://github.com/yourusername/Dubizzle.git
   ```

2. Update the ChromeDriver path in `BaseTest.java`:
   ```java
   System.setProperty("webdriver.chrome.driver", "/path/to/your/chromedriver");
   ```

3. Run the tests using Maven:
   ```
   mvn test
   ```

## Extending the Framework

### Adding a New Page

1. Create a new class in the `pages` package
2. Extend the functionality as needed, following the Page Object Model pattern

Example:
```java
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewPage {
    private WebDriver driver;
    protected By someElement = By.xpath("//yourXpath");

    public NewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction() {
        driver.findElement(someElement).click();
    }
}
```

### Adding a New Test

1. Create a new test class in the `Tests` package
2. Extend the `BaseTest` class to inherit setup and teardown methods

Example:
```java
package Tests;

import Base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class NewTest extends BaseTest {

    @Test
    public void testNewFeature() {
        // Your test code here
    }
}
```



## Author
Mohammed Lukmanudin M - [GitHub Profile](https://github.com/redJavaMan)
