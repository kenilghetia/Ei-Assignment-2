package com.satellite;

// Command Pattern: Command interface
interface Command {
    void execute() throws SatelliteCommandException;
}
