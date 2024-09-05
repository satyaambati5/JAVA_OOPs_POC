# JAVA_OOPs_POC
A  small project to demonstrate the concepts of Object-Oriented Programming (OOP) in Java would be a Car Rental System. This project will cover the following OOP concepts:  Class and Object Encapsulation Abstraction (using interfaces) Inheritance Polymorphism (both compile-time and runtime)
Project: Simple Car Rental System
Objective:
The car rental system allows users to rent a car. It will have multiple car types, and the system will calculate the cost based on the car type rented.

Project Structure:
Class: Vehicle (Abstract Class)

Fields: brand, model, rentalPrice
Methods: Getters/Setters for brand, model, rentalPrice
Abstract method: calculateRentalCost(int days)
Classes: Car, Bike (Inherits from Vehicle)

Overrides the calculateRentalCost() method for each specific vehicle type.
Interface: Rentable (Interface)

Method: void rent(int days) – to be implemented by Car and Bike.
Polymorphism:

Demonstrate runtime polymorphism by using the rent() method.
Main Class:

Interact with the user, allow them to select a vehicle, rent it for a specified number of days, and calculate the total rental cost.
