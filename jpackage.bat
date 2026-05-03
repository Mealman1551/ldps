cd /d %~dp0
mvn clean package
jpackage --name LDPS --input target --main-jar ldps.jar --type app-image --dest dist --win-console