# Spring Boot User Management Demo

## Overview
This project is a simple Spring Boot application demonstrating:
- Object-oriented design with Java
- Dependency Injection
- In-memory data management using a fake repository
- Unit testing with JUnit
- Gitflow-based version control

## Technologies Used
- **Java 17+** – main language for application logic
- **Spring Boot 3.1.0** – for building the web app
- **Gradle** – build tool (required by project brief)
- **JUnit 5** – for testing
- **Git & GitHub** – version control and collaboration

## File Structure
src/
├── main/
│ ├── java/com/example/demo/
│ │ ├── model/ ← User class
│ │ ├── repo/ ← FakeRepo and interface
│ │ ├── service/ ← Service interface + implementation
│ └── resources/ ← application.properties
└── test/
└── java/com/example/demo/service/
└── UserServiceTest.java

## How to Run
1. Clone the repo:
git clone https://github.com/KeanuM123/spring-boot-user-demo.git
cd spring-boot-user-demo

2. Run the app:
./gradlew bootRun

3. Console Output:
Keanu added
hello Keanu
Keanu removed

## How to Test
Run unit tests with:

./gradlew test

You’ll see:
BUILD SUCCESSFUL
3 tests completed

## Gitflow Branches
- `main`: final, production-ready code
- `develop`: integration branch for active work
- `feature/initial-setup`: complete Spring Boot app
- `test`: used to test code before merging to `main`

## Why Other Languages Appear on GitHub
GitHub shows some non-Java languages due to required files:
- **Groovy**: from `build.gradle` (used by Gradle)
- **Shell**: from `gradlew` scripts (used to run builds)

> ✅ These are required by the project brief for Gradle support  
> ✅ Java is still the main language used

---

## Author
Keanu Moodley 
 
