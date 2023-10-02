package com.satellite;

import java.util.ArrayList;
import java.util.List;

// Singleton Satellite class
class Satellite {
    private static Satellite instance;
    private Orientation orientation;
    private boolean solarPanelsActive;
    private int dataCollected;
    private List<SatelliteObserver> observers;

    private Satellite() {
        orientation = Orientation.NORTH;
        solarPanelsActive = false;
        dataCollected = 0;
        observers = new ArrayList<>();
    }

    public static Satellite getInstance() {
        if (instance == null) {
            instance = new Satellite();
        }
        return instance;
    }

    public void addObserver(SatelliteObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(SatelliteObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (SatelliteObserver observer : observers) {
            observer.update(this);
        }
    }

    // Getter methods for state attributes
    public Orientation getOrientation() {
        return orientation;
    }

    public boolean isSolarPanelsActive() {
        return solarPanelsActive;
    }

    public int getDataCollected() {
        return dataCollected;
    }

    // Command Pattern: Rotate command
    public void rotate(Orientation newOrientation) {
        orientation = newOrientation;
        notifyObservers();
    }

    // Command Pattern: Activate Solar Panels command
    public void activatePanels() throws SolarPanelActivationException {
        if (!solarPanelsActive) {
            solarPanelsActive = true;
            notifyObservers();
        } else {
            throw new SolarPanelActivationException("Solar panels are already active");
        }
    }

    // Command Pattern: Deactivate Solar Panels command
    public void deactivatePanels() {
        solarPanelsActive = false;
        notifyObservers();
    }

    // Command Pattern: Collect Data command
    public void collectData() {
        if (solarPanelsActive) {
            dataCollected += 10;
            notifyObservers();
        }
    }

    // Method to get the satellite's state as a string
    public String getState() {
        return "Orientation: " + orientation + "\nSolar Panels: " + (solarPanelsActive ? "Active" : "Inactive") + "\nData Collected: " + dataCollected;
    }
}
