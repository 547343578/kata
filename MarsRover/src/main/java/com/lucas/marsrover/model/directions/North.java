package com.lucas.marsrover.model.directions;

import com.lucas.marsrover.exception.ObstacleException;
import com.lucas.marsrover.model.Position;
import com.lucas.marsrover.model.Rover;
import com.lucas.marsrover.utils.Impl.DimensionUtils;
import com.lucas.marsrover.utils.DimensionUtilsApi;

public class North extends Direction{

    DimensionUtilsApi dimensionUtilsApi = new DimensionUtils();

    public North() {
        super("N", "W", "E");
    }

    @Override
    public void moveForward(Rover rover){
        Integer posY = rover.getPosition().getY();
        if(dimensionUtilsApi.isAboveLimitedY(rover)){
            Position position = new Position(rover.getPosition().getX(), 1);
            if (dimensionUtilsApi.existObstacle(position, rover.getMars())) {
                throw new ObstacleException("OBSTACLE DETECTION!");
            } else {
                rover.getPosition().setY(1);
            }
        }else {
            Position position = new Position(rover.getPosition().getY(), posY + 1);
            if (dimensionUtilsApi.existObstacle(position, rover.getMars())) {
                throw new ObstacleException("OBSTACLE DETECTION!");
            } else {
                rover.getPosition().setY(posY + 1);
            }
        }
    }

    @Override
    public void moveBackward(Rover rover) {
        Integer posY = rover.getPosition().getY();
        if(dimensionUtilsApi.isUnderLimitedY(rover)){
            Position position = new Position(rover.getPosition().getX(),rover.getMars().getDimension().getY() );
            if (dimensionUtilsApi.existObstacle(position, rover.getMars())) {
                throw new ObstacleException("OBSTACLE DETECTION!");
            } else {
                rover.getPosition().setY(rover.getMars().getDimension().getY());
            }
        }else{
            Position position = new Position(rover.getPosition().getX(), posY - 1);
            if (dimensionUtilsApi.existObstacle(position, rover.getMars())) {
                throw new ObstacleException("OBSTACLE DETECTION!");
            } else {
                rover.getPosition().setY(posY - 1);
            }
        }
    }
}
