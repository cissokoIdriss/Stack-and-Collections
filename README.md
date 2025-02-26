# Stack-and-Collections

# 📌 Project Overview:
This repository contains an implementation of a stack-based sorting program in Java. The project reads integers into a stack, allows operations such as adding, removing, and displaying the stack (sorted and unsorted), and follows best practices in object-oriented programming including:
 - Encapsulation: Using private variables with getter methods.
 - Single Responsibility Principle: Each class has a dedicated function.
 - Code Reusability: Leveraging Java’s built-in Stack and sorting methods from the collection framework.

# Sample Image
<img width="851" alt="Screenshot 2025-02-25 at 9 30 48 PM" src="https://github.com/user-attachments/assets/4e4283e8-2d62-43d9-8733-dcc134989b52" />


#  ✨ Features
 - Interactive Menu display
 - Reading integer from scanned input
 - Adding numbers to the stack
 - Removing numbers from the stack
 - Display the unsorted list
 - Display the sorted list


# 📁 Folder Structure
```
  📂 integer-reading-to-stack/
   |-- 📂 implementation   # contains Java source files
        |-- Main.java     # Entry point of the program
        |-- MenuOptionsDisplay.java  # Display menu options
        |-- MyStack.java  # Manages stack operations
        |-- SortStack.java  # Sorts the Stack
        |-- UserInputManagement.java # handles user input
   |-- MyStackProgram.jar  
   |-- Planning-and-Maintenance.pdf
   |-- Readme.txt # explains how to run the program
   |-- UML-DIAGRAM.pdf 
    
    
```
# Prerequisites
To run or clone this program you will need Java installed [Java](https://www.java.com/en/download/help/download_options.html) and/or [Git](https://git-scm.com)

# How to clone the program 
Follow instructions from the github documentation <a href="https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository" target ="_blank"> Here </a>

# How to run the program using the Jar file (Highly recommended)
1 Navigate to project root folder
```
  $ cd integer-reading-to-stack
```
2 run the program
```
  java -jar MyStackProgram.jar 
```

# How to run the program by compiling

1 Navigate to root folder
```
  $ cd integer-reading-to-stack

```
2 Compile java files

```
  javac -d . implementation/*.java 
```

3 Run the program

```
  java implementation.Main
```

# How to Create the Documentation
From the root folder
```
  javadoc -d doc implementation/*.java

```
Then open doc/index.html in the browser

Then open `doc/index.html` in a browser.

## 🔄 Notes
- A **Plan and Maintenance** file has been added to explain the process of adapting the previous project.
- The **UML diagram** has been updated to reflect the changes.
- A **JAR file** has been provided to prevent compilation errors.

