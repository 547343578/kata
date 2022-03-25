package com.lucas.marsrover.model;

import com.lucas.marsrover.model.directions.Direction;

public class Rover {
    private Direction direction;
    private Position position;
    private final Mars mars;

    public Rover(Direction direction, Position position, Mars mars) {
        this.direction = direction;
        this.position = position;
        this.mars = mars;
        mars.getRover().add(this);
    }

    public Mars getMars() {
        return mars;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Rover " +
                "position = [" + position.getX() + "," + position.getY() + "]";
    }
}
