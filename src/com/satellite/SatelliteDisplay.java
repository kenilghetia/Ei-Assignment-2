package com.satellite;

// Concrete Observer
class SatelliteDisplay implements SatelliteObserver {
    public void update(Satellite satellite) {
        System.out.println("Satellite state updated:");
        System.out.println(satellite.getState());
    }
}
