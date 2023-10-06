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

## Functionalities

- Rotate the satellite to different orientations (North, South, East, West).
- Activate and deactivate the solar panels of the satellite.
- Collect data when the solar panels are active.
- Final state is displayed when user exits the program.

## Features
### Use of Design Patterns in code

- Singleton Pattern  
The `Satellite` class is implemented as a Singleton. It ensures that only one instance of the class exists throughout the application, which is useful for managing a single satellite entity.

- Command Pattern  
The Command Pattern is used to encapsulate and decouple the requests (`commands`) from the receiver (`Satellite`) by introducing command objects (Command interface and its implementations: `RotateCommand`, `ActivatePanelsCommand`, `DeactivatePanelsCommand`, and `CollectDataCommand`). These commands encapsulate the actions and allow for easy addition of new commands without modifying the `Satellite` class.

- Observer Pattern  
The Observer Pattern is used to implement a mechanism where SatelliteObserver objects (such as `SatelliteDisplay`) are notified and updated when the state of the Satellite changes. This pattern allows for loose coupling between the Satellite and its observers.


### Use of OOP principles in Code

Classes and Objects  
- The code defines classes (e.g., `Satellite`, `SatelliteObserver`) that represent real-world entities and actions.
- Objects of these classes are created and manipulated throughout the code.

Encapsulation  
- The `Satellite` class encapsulates the state and behavior of the satellite, hiding internal details.
- Command classes encapsulate specific commands and their execution.

Polymorphism  
- The `Command` interface defines the `execute` method, which is implemented by various concrete command classes (`ActivatePanelsCommand`, `RotateCommand`, etc.).
- This allows the `SatelliteCommandSystem` to treat these commands uniformly, demonstrating polymorphism.


### Use of SOLID Principles in Code

Single Responsibility Principle (SRP)
- The `Satellite` class primarily manages the state and behavior of the satellite.
- Concrete command classes (`RotateCommand`, `ActivatePanelsCommand`, etc.) have single responsibilities related to executing specific commands.
- `SatelliteDisplay` class is responsible for displaying the satellite's state.

Open/Closed Principle (OCP)
- The code is open for extension when adding new commands (e.g., creating a new command class) without modifying existing code.

Liskov Substitution Principle (LSP)
- The concrete command classes (`RotateCommand`, `ActivatePanelsCommand`, etc.) implement the `Command` interface, ensuring that they can be used interchangeably where `Command` is expected.

Interface Segregation Principle (ISP)
- The `SatelliteObserver` interface is minimal and contains only the `update` method, adhering to the ISP by providing a focused interface for observers.

Dependency Inversion Principle (DIP)
- Dependency injection is used to inject concrete command objects (`RotateCommand`, `ActivatePanelsCommand`, etc.) into the `SatelliteCommandSystem` rather than having the system create these objects directly. This promotes loose coupling and adherence to DIP.

### Usage
Upon running the application, you'll be presented with a menu of available commands.  
Use the following commands to interact with the satellite:  
- rotate [north/south/east/west]: Rotate the satellite in the specified direction.  
- activate: Activate the solar panels.  
- deactivate: Deactivate the solar panels.  
- collect: Collect data (only when solar panels are active).  
- exit: Exit the application.  
The application will display the satellite's state after each command execution.

---

- Initial Screen  
  ![image](https://github.com/kenilghetia/Ei-Assignment-2/assets/91539303/4564776d-1743-43fb-bf0c-297fdd64dcb9)
- Rotate satellite  
  ![image](https://github.com/kenilghetia/Ei-Assignment-2/assets/91539303/97d90f12-5a1b-4e9c-8de3-20a01cccb828)
- Activate Solar panels  
  ![image](https://github.com/kenilghetia/Ei-Assignment-2/assets/91539303/dcd1369f-e2c6-49b3-ac4b-3fe4eeeb6b76)

- Collect Data  
  ![image](https://github.com/kenilghetia/Ei-Assignment-2/assets/91539303/f2dd805c-6ba7-4e08-96e0-2fbea82542f6)
  ![image](https://github.com/kenilghetia/Ei-Assignment-2/assets/91539303/0135f8f6-8993-466f-89da-a1303eea113c)
  
- Deactivate Solar panels  
  ![image](https://github.com/kenilghetia/Ei-Assignment-2/assets/91539303/bf7ee20b-4053-405a-8248-c37125947da4)

- Exit and display final result  
  ![image](https://github.com/kenilghetia/Ei-Assignment-2/assets/91539303/eb6df6f8-a7e2-415e-bb06-4acf9023e016)



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
