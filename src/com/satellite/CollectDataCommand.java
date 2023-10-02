package com.satellite;

// Concrete Command: Collect Data command
class CollectDataCommand implements Command {
    private final Satellite satellite;

    public CollectDataCommand(Satellite satellite) {
        this.satellite = satellite;
    }

    public void execute() {
        satellite.collectData();
    }
}
