#!/bin/bash

# Compile the Java source file
javac HelloWorld.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
  # Run the compiled Java program
  java HelloWorld
else
  echo "Compilation failed."
