package com.lucas.marsrover.utils;

import com.lucas.marsrover.model.Rover;

public interface ActionUtilsApi {
    void moveForward(Rover rover);
    void moveBackward(Rover rover);
    void turnLeft(Rover rover);
    void turnRight(Rover rover);
    void analizeCommands(String commands, Rover rover);
}
