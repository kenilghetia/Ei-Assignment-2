# Satellite Command System


## Introduction
a command-line application that simulates controlling a satellite's actions using predefined commands. It demonstrates the Command Pattern, Observer Pattern, and Object-Oriented Programming (OOP) principles.

## Table of Contents

- [Project Folder Structure](#project-folder-structure)
- [Functionalities](#functionalities)
- [Features](#features)
  - [Use of Design Patterns in code](#use-of-design-patterns-in-code)
  - [Use of OOP principles in code](#use-of-oop-principles-in-code)
  - [Use of SOLID Principles in code](#use-of-solid-principles-in-code)
- [Usage](#usage)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)

## Project Folder Structure

    ├── src (Source code directory)
    │ └── com
    │   └── satellite
    │        ├── ActivatePanelsCommand.java (Command class for activating solar panels.)
    │        ├── CollectDataCommand.java (Command class for collecting data.)
    │        ├── Command.java (Command interface.)
    │        ├── DeactivatePanelsCommand.java (Command class for deactivating solar panels.)
    │        ├── Orientation.java (Enum representing satellite orientations.)
    │        ├── RotateCommand.java (Command class for rotating the satellite.)
    │        ├── Satellite.java (Singleton class representing the satellite.)
    │        ├── SatelliteDisplay.java (Concrete observer class for displaying satellite state.)
    │        ├── SatelliteCommandException.java (Custom exception class for satellite commands.)
    │        ├── SolarPanelActivationException.java (Custom exception class for solar panel activation.)
    │        └── SatelliteCommandSystem.java (Main class for running the application.)
    ├── LICENSE
    └── README.md

## Features

- Rotate the satellite to different orientations (North, South, East, West).
- Activate and deactivate the solar panels of the satellite.
- Collect data when the solar panels are active.
- Monitor the satellite's state in real-time using the Observer Pattern.
- Custom exceptions for handling command execution errors.

## Best Practices
### Use of Design Patterns in code

- Singleton Pattern  
The Satellite class is implemented as a Singleton. It ensures that only one instance of the class exists throughout the application, which is useful for managing a single satellite entity.

- Command Pattern  
The Command Pattern is used to encapsulate and decouple the requests (commands) from the receiver (Satellite) by introducing command objects (Command interface and its implementations: RotateCommand, ActivatePanelsCommand, DeactivatePanelsCommand, and CollectDataCommand). These commands encapsulate the actions and allow for easy addition of new commands without modifying the Satellite class.

- Observer Pattern  
The Observer Pattern is used to implement a mechanism where SatelliteObserver objects (such as SatelliteDisplay) are notified and updated when the state of the Satellite changes. This pattern allows for loose coupling between the Satellite and its observers.


### Use of OOP principles in Code
### Use of SOLID Principles in Code


### Usage
Upon running the application, you'll be presented with a menu of available commands.  
Use the following commands to interact with the satellite:  
- rotate [north/south/east/west]: Rotate the satellite in the specified direction.  
- activate: Activate the solar panels.  
- deactivate: Deactivate the solar panels.  
- collect: Collect data (only when solar panels are active).  
- exit: Exit the application.  
The application will display the satellite's state after each command execution.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Git (for cloning the repository)

### Installation

1. Clone this repository to your local machine:
   ```bash
   https://github.com/kenilghetia/Ei-Assignment-2.git
2. Navigate to the project directory:
   ```bash
   cd satellite-command-system
3. Compile the Java source files:
   ```bash
   javac com/satellite/*.java
4. Run the application:
  ```bash
  java com.satellite.SatelliteCommandSystem
  ```
