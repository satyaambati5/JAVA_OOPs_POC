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


Key Concepts in the Project:
Encapsulation:

The Vehicle class hides its internal data (like brand, model, and rentalPrice) using private fields and provides public getters and setters.
Abstraction:

The Vehicle class is abstract and defines an abstract method calculateRentalCost() that each specific vehicle type (Car, Bike) must implement.
Inheritance:

The Car and Bike classes inherit the properties and behaviors of the Vehicle class, but they can also provide their own implementation for calculating rental cost.
Polymorphism:

Both the Car and Bike classes implement the Rentable interface, and you can use runtime polymorphism by calling the rent() method on both objects using a Rentable reference.
Compile-Time Polymorphism (Method Overloading):


OUTPUT:

<<<<<Welcome To Janatha Garrage>>>>

Welcome To Janatha Garrage Rental Cars.

You have rented the car Brand: Kia.
Model Seltos-2022 for 5 days.

Price Per Day is: 1740.0
Total Rental Cost For the Car is: 8700.0.

Welcome To Janatha Garrage Rental Bikes.

You have rented the Bike Brand: Royal Enfield.
Model Metror-350CC-2024 for 4 days.

Price Per Day is: 1050.0
Total Rental Cost For the Bike is: 4200.0.
