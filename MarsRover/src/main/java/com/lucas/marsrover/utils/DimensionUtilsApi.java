package com.lucas.marsrover.utils;

import com.lucas.marsrover.model.Mars;
import com.lucas.marsrover.model.Position;
import com.lucas.marsrover.model.Rover;

public interface DimensionUtilsApi {
    Boolean isAboveLimitedY(Rover rover);
    Boolean isUnderLimitedY(Rover rover);
    Boolean isAboveLimitedX(Rover rover);
    Boolean isUnderLimitedX(Rover rover);
    Boolean existObstacle(Position position, Mars mars);
}
