# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Spring Boot 4.0.0 web application with Thymeleaf templating, configured with Java 17. The project uses Gradle for build management and Lombok for reducing boilerplate code.

**Group ID**: `com.mercury`
**Artifact ID**: `study`
**Base Package**: `com.mercury.study`

## Build and Development Commands

### Building the project
```bash
./gradlew build
```

### Running the application
```bash
./gradlew bootRun
```

### Running tests
```bash
./gradlew test
```

### Running a single test class
```bash
./gradlew test --tests com.mercury.study.StudyApplicationTests
```

### Clean build
```bash
./gradlew clean build
```

## Architecture

### Technology Stack
- **Spring Boot 4.0.0** with Spring MVC for web layer
- **Thymeleaf** for server-side template rendering
- **Lombok** for annotation-based code generation (requires annotation processing)
- **JUnit 5** (Jupiter) for testing

### Project Structure
```
src/main/java/com/mercury/study/     # Main application code
src/main/resources/                  # Configuration and templates
src/test/java/com/mercury/study/     # Test code
```

### Key Configuration Files
- `build.gradle` - Gradle build configuration with dependencies
- `src/main/resources/application.properties` - Spring Boot configuration
- `StudyApplication.java` - Main application entry point with `@SpringBootApplication`

## Development Notes

This is a standard Spring Boot MVC application structure. When adding new features:
- Controllers should be placed in `com.mercury.study` package or appropriate subpackages
- Thymeleaf templates go in `src/main/resources/templates/`
- Static resources (CSS, JS, images) belong in `src/main/resources/static/`
- Configuration properties are in `application.properties`
