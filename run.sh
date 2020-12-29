#!/bin/sh

# This compiles and then runs the java package. Super basic but I got tired of doing it soooo
# Only runs on compilation success 

javac XMLPackage/*.java

echo "----------------------------"
echo "--- COMPILATION FINISHED ---"
echo "----------------------------"

if [ $? -eq 0 ]
then 
	java XMLPackage/DomParserExample.java $1
fi
