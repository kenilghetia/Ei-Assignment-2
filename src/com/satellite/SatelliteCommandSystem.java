package com.satellite;

import java.util.Scanner;

public class SatelliteCommandSystem {
    public static void main(String[] args) {
        Satellite satellite = Satellite.getInstance();
        SatelliteObserver display = new SatelliteDisplay();
        satellite.addObserver(display);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Available Commands:");
            System.out.println("1. Rotate satellite (command: rotate [north/south/east/west])");
            System.out.println("2. Activate Solar Panels (command: activate)");
            System.out.println("3. Deactivate Solar Panels (command: deactivate)");
            System.out.println("4. Collect Data (command: collect)");
            System.out.println("5. Exit (command: exit)");
            System.out.print("Enter a command: ");

            String command = scanner.nextLine().toLowerCase();

            try {
                Command satelliteCommand = null;

                switch (command) {
                    case "rotate":
                        System.out.print("Enter a direction (north/south/east/west): ");
                        String direction = scanner.nextLine().toUpperCase();
                        satelliteCommand = new RotateCommand(satellite, Orientation.valueOf(direction));
                        break;
                    case "activate":
                        satelliteCommand = new ActivatePanelsCommand(satellite);
                        break;
                    case "deactivate":
                        satelliteCommand = new DeactivatePanelsCommand(satellite);
                        break;
                    case "collect":
                        satelliteCommand = new CollectDataCommand(satellite);
                        break;
                    case "exit":
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid command. Please try again.");
                }

                if (satelliteCommand != null) {
                    satelliteCommand.execute();
                }
            } catch (IllegalArgumentException e) {
                System.err.println("Error: Invalid direction entered.");
            } catch (SatelliteCommandException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

        // Display the final satellite state
        System.out.println("Final Satellite State:");
        System.out.println(satellite.getState());

        // Close the scanner
        scanner.close();
    }
}
