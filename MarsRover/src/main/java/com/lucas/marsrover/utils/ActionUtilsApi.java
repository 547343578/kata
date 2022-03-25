package com.lucas.marsrover.utils;

import com.lucas.marsrover.model.Rover;
import com.lucas.marsrover.model.directions.Direction;

import java.util.Map;

public interface ActionUtilsApi {
    void moveForward(Rover rover);
    void moveBackward(Rover rover);
    void turnLeft(Rover rover);
    void turnRight(Rover rover);
    void analizeCommands(String commands, Rover rover);
    Map<String, Direction> getDirectionMap();
}
