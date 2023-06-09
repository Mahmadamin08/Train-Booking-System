# Train Reservation System

The Train Reservation System is a console-based application implemented in Java, designed to enable users to book train tickets. The system is designed to provide a seamless ticket booking experience for users, considering factors such as train availability, route, date, class/coach type, the number of passengers and generte report. This readme file will guide you through the features, usage, and installation of the Train Reservation System.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Screenshots](#screenshots)
- [Installation](#installation)
- [Usage](#usage)
- [Contributing](#contributing)

## Introduction

The Train Reservation System allows users to book train tickets for various routes, dates, and coach types. It provides a user-friendly interface to search for available trains, check seat availability, and book tickets. The system handles multiple trains, stations, coach configurations, and calculates fares based on distance and class.

## Features

- Displays all available trains based on the booking request, including train numbers and details.
- Allows users to book tickets for a specific train, route, date, class/coach type, and number of passengers.
- Calculates the fare accurately based on the distance, selected class, and number of passengers.
- Generates a unique PNR number for each booked ticket.
- Ensures seat availability and displays an appropriate error message if no seats are available.
- Books tickets systematically, starting from the lowest coach number to the highest, and within each coach, assigns seats from the lowest seat number to the highest.
- Supports various coach types, such as Sleeper (SL), 3 Tier AC (3A), 2 Tier AC (2A), and 1st class AC (1A).
- Implements input validation to ensure the correctness of booking information.
- Efficiently handles multiple booking requests concurrently.
- Enables retrieval of booking details using the unique PNR.
- Provides a report generation feature to display all booked ticket details in the correct order.

## Screenshots

Here are some screenshots of the Train Reservation System in action:
<br>
<br>
*Screenshot 1: Enter a Train Details.*
<br>
<br>
![Screenshot 1](https://raw.github.com/Mahmadamin08/Train-Reservation-System/main/ss/trainentry.jng)
<br>
<br>
*Screenshot 2: Booking a ticket for a given route, date, and class.*
<br>
<br>
![Screenshot 2](https://raw.github.com/Mahmadamin08/Train-Reservation-System/main/ss/bookingreq.jng)
<br>
<br>
*Screenshot 3: is No Seats Available.*
<br>
<br>
![Screenshot 3](https://raw.github.com/Mahmadamin08/Train-Reservation-System/main/ss/noSeatAvi.png)
<br>
<br>
*Screenshot 4: if No Trian Available.*
<br>
<br>
![Screenshot 4](https://raw.github.com/Mahmadamin08/Train-Reservation-System/main/ss/noTrainAvi.png)
<br>
<br>
*Screenshot 5: Retrieve booking details using PNR.*
<br>
<br>
![Screenshot 5](https://raw.github.com/Mahmadamin08/Train-Reservation-System/main/ss/retrivebyprn.jpg)
<br>
<br>
*Screenshot 6: Invalid PNR.*
<br>
<br>
![Screenshot 6](https://raw.github.com/Mahmadamin08/Train-Reservation-System/main/ss/invalidprn.jpg)
<br>
<br>
*Screenshot 7: Generate Report.*
<br>
<br>
![Screenshot 7](https://raw.github.com/Mahmadamin08/Train-Reservation-System/main/ss/report.jpg)

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
   Output:
   ```
   No Seats Available
   ```

4. Tickets can be booked for the next available date:
   ```
   Input: Rajkot Mumbai 2023-03-16 1A 10
   ```

   Output:
   ```
   PNR: 100000003
   Fare: 30000
   ```

5. If no trains are available for the given route and date, an error message will be displayed:
   ```
   Input: Rajkot Chennai 2023-03-16 1A 10
   ```

   Output:
   ```
   No Trains Available
   ```

**Note:** The above examples demonstrate the usage of the Train Reservation System. You can enter different routes, dates, class types, and numbers of passengers to book tickets according to your requirements.

## Contributing

Contributions to the Train Reservation System project are welcome! If you have any ideas, suggestions, or improvements, please feel free to open an issue or submit a pull request. Let's collaborate to make this system even better.



