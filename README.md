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
./jpackage.sh
```

On Windows:

```bash
jpackage.bat
```

This will build the project and create an app-image in the `dist` directory.

### Specifications

- OpenJDK 21 or later
- Maven 3.6 or later

Tested with:
- openjdk 26.0.1 2026-04-21
- OpenJDK Runtime Environment (build 26.0.1+8-34)
- OpenJDK 64-Bit Server VM (build 26.0.1+8-34, mixed mode, sharing)

###### &copy; 2026 Mealman1551
