package com.satellite;

// Concrete Command: Rotate command
class RotateCommand implements Command {
    private final Satellite satellite;
    private final Orientation newOrientation;

    public RotateCommand(Satellite satellite, Orientation newOrientation) {
        this.satellite = satellite;
        this.newOrientation = newOrientation;
    }

    public void execute() {
        satellite.rotate(newOrientation);
    }
}
