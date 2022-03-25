package com.lucas.marsrover.utils.Impl;

import com.lucas.marsrover.exception.ObstacleException;
import com.lucas.marsrover.exception.UnknownCommandException;
import com.lucas.marsrover.model.*;
import com.lucas.marsrover.model.directions.*;
import com.lucas.marsrover.utils.ActionUtilsApi;

import java.util.HashMap;
import java.util.Map;

public class ActionActionUtils implements ActionUtilsApi {

    Map<String, Direction> directionMap = new HashMap<>(){{
        put("W", new West());
        put("E", new East());
        put("N", new North());
        put("S", new South());
    }};

    public Map<String, Direction> getDirectionMap() {
        return directionMap;
    }

    @Override
    public void moveForward(Rover rover){
        rover.getDirection().moveForward(rover);
    }

    @Override
    public void moveBackward(Rover rover) {
        rover.getDirection().moveBackward(rover);
    }

    @Override
    public void turnLeft(Rover rover) {
        Direction direction = directionMap.get(rover.getDirection().getLeft());
        rover.setDirection(direction);
    }

    @Override
    public void turnRight(Rover rover) {
        Direction direction = directionMap.get(rover.getDirection().getRight());
        rover.setDirection(direction);
    }

    @Override
    public void analizeCommands(String commands, Rover rover) {
        char[] commandsList = commands.toCharArray();
        for(char command : commandsList){
            switch (command){
                case 'f':
                    moveForward(rover);
                    break;
                case 'b':
                    moveBackward(rover);
                    break;
                case 'l':
                    turnLeft(rover);
                    break;
                case 'r':
                    turnRight(rover);
                    break;
                default:
                    throw new UnknownCommandException("UNKNOWN COMMAND");
            }
        }
    }




}
