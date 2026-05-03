#!/bin/bash
cd "$(dirname "$0")"
jpackage --name LDPS --input target --main-jar ldps.jar --type app-image --dest dist