# LDPS
[![Build & Publish Maven](https://github.com/Mealman1551/ldps/actions/workflows/build.yml/badge.svg)](https://github.com/Mealman1551/ldps/actions/workflows/build.yml)

Lightweight Directory Printing System

A simple Java CLI tool for listing directory contents.

## Build

javac -d out src/ldps.java
jar cfe ldps.jar ldps -C out .

## Run

java -jar ldps.jar

## Package and distribution

Run `./jpackage.sh` or `./jpackage.bat`

### Specifications on my side

openjdk 26.0.1 2026-04-21
OpenJDK Runtime Environment (build 26.0.1+8-34)
OpenJDK 64-Bit Server VM (build 26.0.1+8-34, mixed mode, sharing)

###### &copy; 2026 Mealman1551
