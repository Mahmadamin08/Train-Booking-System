# Train Reservation System

The Train Reservation System is a console-based application implemented in Java, designed to enable users to book train tickets. The system is designed to provide a seamless ticket booking experience for users, considering factors such as train availability, route, date, class/coach type, and the number of passengers. This readme file will guide you through the features, usage, and installation of the Train Reservation System.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Train Reservation System allows users to book train tickets for various routes, dates, and coach types. It provides a user-friendly interface to search for available trains, check seat availability, and book tickets. The system handles multiple trains, stations, coach configurations, and calculates fares based on distance and class.

## Features

- Book tickets for a given route, date, class/coach type, and number of passengers.
- Supports multiple trains with different coach configurations.
- Calculates fare based on the distance,class selected and No of passengers.
- Assigns a unique PNR (Passenger Name Record) to each ticket.
- Ensures seat availability and displays an error message if no seats are available.
- Books tickets from the lowest coach number to the highest, and within each coach, from the lowest seat number to the highest.
- Supports a range of coach types, including Sleeper (SL), 3 Tier AC (3A), 2 Tier AC (2A), and 1st class AC (1A).
- Validated inputs to ensure accurate booking information.
- Efficiently handles multiple booking requests simultaneously.

## Screenshots

Here are some screenshots of the Train Reservation System in action:

![Screenshot 1](https://raw.github.com/Mahmadamin08/Train-Reservation-System/main/ss/bookingReq.png)
*Screenshot 1: Booking a ticket for a given route, date, and class.*

![Screenshot 2](screenshots/screenshot2.png)
*Screenshot 2: Booking an entire coach for a group.*

![Screenshot 3](screenshots/screenshot3.png)
*Screenshot 3: Error message when no seats are available.*

## Installation

To run the Train Reservation System on your local machine, follow these steps:

1. Clone the repository from GitHub:
   ```
   git clone https://github.com/your-username/train-reservation-system.git
   ```

2. Navigate to the project directory:
   ```
   cd train-reservation-system
   ```

3. Compile the Java source code:
   ```
   javac Main.java
   ```

4. Run the application:
   ```
   java Main
   ```

## Usage

Once the Train Reservation System is up and running, you can use the following commands to interact with the application:

1. Enter the route, date, class, and number of passengers to book a ticket:
   ```
   Input: Rajkot Mumbai 2023-03-15 SL 6
   ```

   Output: 
   ```
   PNR: 100000001
   Fare: 4500
   ```

2. To book an entire coach for a group, specify the number of passengers equal to the coach capacity:
   ```
   Input: Rajkot Mumbai 2023-03-15 1A 24
   ```

   Output: 
   ```
   PNR: 100000002
   Fare: 72000
   ```

3. If no seats are available, an error message will be displayed:
   ```
   Input: Rajkot Mumbai 2023-03-15 1A 1
   ```

