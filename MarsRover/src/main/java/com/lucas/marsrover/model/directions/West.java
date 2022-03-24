package com.lucas.marsrover.model.directions;

import com.lucas.marsrover.exception.ObstacleException;
import com.lucas.marsrover.model.Position;
import com.lucas.marsrover.model.Rover;
import com.lucas.marsrover.utils.Impl.DimensionUtils;
import com.lucas.marsrover.utils.DimensionUtilsApi;

public class West extends Direction{

    DimensionUtilsApi dimensionUtilsApi = new DimensionUtils();

    public West() {
        super("W", "S", "N");
    }

    @Override
    public void moveForward(Rover rover){
        Integer posX = rover.getPosition().getX();
        if (dimensionUtilsApi.isUnderLimitedX(rover)){
            Position position = new Position(rover.getMars().getDimension().getX(), rover.getPosition().getY());
            if (dimensionUtilsApi.existObstacle(position, rover.getMars())){
                throw new ObstacleException("OBSTACLE DETECTION!");
            }else{
                rover.getPosition().setX(rover.getMars().getDimension().getX());
            }
        }else {
            Position position = new Position(posX - 1, rover.getPosition().getY());
            if(dimensionUtilsApi.existObstacle(position, rover.getMars())) {
                throw new ObstacleException("OBSTACLE DETECTION!");
            }else{
                rover.getPosition().setX(posX - 1);
            }
        }
    }

    @Override
    public void moveBackward(Rover rover) {
        Integer posX = rover.getPosition().getX();
        if(dimensionUtilsApi.isAboveLimitedX(rover)){
            Position position = new Position(1, rover.getPosition().getY());
            if (dimensionUtilsApi.existObstacle(position, rover.getMars())){
                throw new ObstacleException("OBSTACLE DETECTION!");
            }else{
                rover.getPosition().setX(1);
            }
        }else {
            Position position = new Position(posX + 1, rover.getPosition().getY());
            if(dimensionUtilsApi.existObstacle(position, rover.getMars())) {
                throw new ObstacleException("OBSTACLE DETECTION!");
            }else{
                rover.getPosition().setX(posX + 1);
            }
        }
    }
}
