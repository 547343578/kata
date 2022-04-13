package com.lucas.marsrover.utils.Impl;

import com.lucas.marsrover.model.Mars;
import com.lucas.marsrover.model.Obstacle;
import com.lucas.marsrover.model.Position;
import com.lucas.marsrover.model.Rover;
import com.lucas.marsrover.utils.DimensionUtilsApi;

import javax.swing.*;

public class DimensionUtils implements DimensionUtilsApi {
    @Override
    public Boolean isAboveLimitedY(Rover rover) {
        Integer posY = rover.getPosition().getY();
        return posY.equals(rover.getMars().getDimension().getY());
    }

    @Override
    public Boolean isUnderLimitedY(Rover rover) {
        Integer posY = rover.getPosition().getY();
        return posY.equals(1);
    }

    @Override
    public Boolean isAboveLimitedX(Rover rover) {
        Integer posX = rover.getPosition().getX();
        return posX.equals(rover.getMars().getDimension().getX());
    }

    @Override
    public Boolean isUnderLimitedX(Rover rover) {
        Integer posX = rover.getPosition().getX();
        return posX.equals(1);
    }

    @Override
    public Boolean existObstacle(Position position, Mars mars) {
        if(mars.getObstacles().size() != 0) {
            for (Obstacle obstacle : mars.getObstacles()) {
                if (obstacle.getPosition().getX() == position.getX()
                        && obstacle.getPosition().getY() == position.getY()) {
                    return true;
                }
            }
        }
        return false;
    }
}
