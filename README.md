# LDPS
[![Build & Publish Maven](https://github.com/Mealman1551/ldps/actions/workflows/build.yml/badge.svg)](https://github.com/Mealman1551/ldps/actions/workflows/build.yml)

Lightweight Directory Printing System

A simple Java CLI tool for listing directory contents.

## Build

To build the project, ensure you have Maven installed. Then run:

```bash
mvn clean compile
```

To create the JAR file:

```bash
mvn package
```

## Run

After building, run the application with:

```bash
java -jar target/ldps.jar
```

## Package and Distribution

To create a distributable package, use the provided scripts:

On Linux/Mac:

```bash
./build.sh
```

On Windows:

```bash
./build.bat
```

This will build the project and create an app-image in the `dist` directory.

### Specifications

- OpenJDK 21 or later
- Maven 3.6 or later

Tested and builded with:
openjdk 25.0.4 2026-07-21 LTS
OpenJDK Runtime Environment Temurin-25.0.4+7 (build 25.0.4+7-LTS)
OpenJDK 64-Bit Server VM Temurin-25.0.4+7 (build 25.0.4+7-LTS, mixed mode, sharing)

###### &copy; 2026 Mealman1551
