# Java_basics

# ========================================================================================================================

# Day 1 – Java Setup & Basics

# 1️⃣ Install JDK 17+
# Download
# Get JDK 17 (LTS) or JDK 21 (LTS) from:
# Oracle JDK or
# Eclipse Temurin (recommended for devs)

# 2️⃣ Install IntelliJ IDEA (Community)
# Download IntelliJ IDEA Community Edition
# This is the best Java IDE (like VS Code + extensions, but native)
# Create your first project
# Open IntelliJ
# New Project
# Select Java
# Choose JDK 17
# Build system: None (for now)
# Name it: java-basics-day1

# 3️⃣ Understand Java Project Structure
# You’ll see something like:
# java-basics-day1
# └── src
#  └── Main.java
# This is your entry point.

# 4️⃣ The main() Method (Very Important)
# Every Java program starts here:
# public class Main {
#   public static void main(String[] args) {
#       System.out.println("Hello Java!");
#   }
# }

# 5️⃣ Variables & Data Types
# Java is strongly typed.
# int age = 25;
# double height = 1.75;
# boolean isDeveloper = true;
# char grade = 'A';
# String name = "Esrael";

# 6️⃣ Printing to Console
# Use:
# System.out.println("Hello");
# System.out.print("No newline");
# System.out.printf("Name: %s, Age: %d%n", name, age);

# ✅ Day 1 Checklist
# ✔ JDK installed
# ✔ IntelliJ setup
# ✔ main() understood
# ✔ Variables & types
# ✔ First Java program

# ========================================================================================================================

# Day 2 – Control Flow & Methods
# 1️⃣ if / else Statements
# Java conditionals are similar to JS but types matter.
# int age = 20;
# if (age >= 18) {
#   System.out.println("Adult");
# } else {
#   System.out.println("Minor");
# }
# Logical operators
# &&  // AND
# ||  // OR
# !   // NOT
# 2️⃣ switch Statement
# Used when you have fixed options.
# int day = 3;
# switch (day) {
#  case 1 -> System.out.println("Monday");
#   case 2 -> System.out.println("Tuesday");
#   case 3 -> System.out.println("Wednesday");
#   default -> System.out.println("Invalid day");
# }
# 3️⃣ Loops
# for loop
# for (int i = 1; i <= 5; i++) {
#   System.out.println(i);
# }
# int count = 0;
# while (count < 3) {
#   System.out.println("Count: " + count);
#   count++;
# }
# do-while
# do {
#   System.out.println("Runs at least once");
# } while (false);
# do-while
# do {
#   System.out.println("Runs at least once");
# } while (false);
# Method with return value
# public static int add(int a, int b) {
#   return a + b;
# }
# 5️⃣ Reading User Input (Very Important)
# Java uses Scanner for CLI input.
# import java.util.Scanner;
# Scanner scanner = new Scanner(System.in);
# System.out.print("Enter your name: ");
# String name = scanner.nextLine();
# System.out.println("Hello " + name);
# ✅ Day 2 Checklist
# ✔ if / else
# ✔ switch
# ✔ loops
# ✔ methods
# ✔ user input
# ✔ CLI calculator

# ========================================================================================================================

# Day 3 – Classes & Objects
# 1️⃣ What Is a Class?
# A class is a blueprint.
# An object is an instance of that blueprint.
# 2️⃣ Create Your First Java Class
# Create a new file inside src
# 3️⃣ Creating Objects
# 4️⃣ Constructors (Very Important)
# Constructors initialize objects.
# 5️⃣ Methods Inside a Class
# Add behavior to your class.
# ✅ Day 3 Checklist
# ✔ Classes
# ✔ Objects
# ✔ Constructors
# ✔ this keyword
# ✔ Methods

# ========================================================================================================================

# Day 4 – Encapsulation & Access Modifiers
# 1️⃣ What Is Encapsulation? (Big Idea)
# Encapsulation means:
# Hide internal data and control access to it
# ❌ Bad:
# user.age = -100;
# ✅ Good:
# user.setAge(29);
# ✅ Day 4 Checklist
# ✔ Encapsulation
# ✔ Access modifiers
# ✔ Getters & setters
# ✔ Validation logic