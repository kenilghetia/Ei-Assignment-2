package com.satellite;

// Concrete Command: Deactivate Solar Panels command
class DeactivatePanelsCommand implements Command {
    private final Satellite satellite;

    public DeactivatePanelsCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    public void execute() {
        satellite.deactivatePanels();
    }
}
