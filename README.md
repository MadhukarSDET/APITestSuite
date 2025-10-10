# APITestSuite
RestAssured API Automation Framework (Maven + TestNG + Log4j2)
Overview:
This project is a Java-based API Automation Framework built using:
RestAssured for API testing
TestNG for test execution and suite management
Log4j2 for detailed runtime logging
Maven for dependency management and build
TestNG Listeners for custom reporting and event handling

The framework is designed to be configurable, maintainable, and CI/CD ready — suitable for enterprise-level testing.

Tech Stack:

Java 11+	Programming language
Maven	Build & dependency management
TestNG	Test runner, reporting & assertions
API Testing Librery - RestAssured
Log4j2	Logging framework
Listeners (TestNG ITestListener)	Capture test start/end/failure events


Running Tests
▶️ From Command Line:
mvn clean test -Dsuite=TESTNG

▶️ From IntelliJ / Eclipse:

Right-click on TESTNG.xml → “Run TestNG Suite”
