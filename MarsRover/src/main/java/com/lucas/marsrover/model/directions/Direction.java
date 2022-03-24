package com.lucas.marsrover.model.directions;

import com.lucas.marsrover.model.Rover;

public class Direction {
    private final String direction;
    private final String left;
    private final String right;


    public Direction(String direction, String left, String right) {
        this.direction = direction;
        this.left = left;
        this.right = right;
    }

    public void moveForward(Rover rover){
    }

    public void moveBackward(Rover rover){}

    public String getDirection() {
        return direction;
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

}
