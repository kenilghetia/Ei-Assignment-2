package com.satellite;

// Concrete Command: Activate Solar Panels command
class ActivatePanelsCommand implements Command {
    private final Satellite satellite;

    public ActivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    public void execute() throws SatelliteCommandException {
        satellite.activatePanels();
    }
}
