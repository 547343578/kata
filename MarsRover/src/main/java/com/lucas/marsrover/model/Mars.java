package com.lucas.marsrover.model;

import java.util.ArrayList;
import java.util.List;

public class Mars{
    private List<Rover> rover;
    private final Position dimension;
    private List<Obstacle> obstacles;

    public Mars(List<Rover> rover, Position dimension, List<Obstacle> obstacles) {
        this.rover = rover;
        this.dimension = dimension;
        this.obstacles = obstacles;
    }

    public Mars(Position dimension) {
        this.rover = new ArrayList<>();
        this.obstacles = new ArrayList<>();
        this.dimension = dimension;
    }

    public List<Obstacle> getObstacles() {
        return obstacles;
    }

    public void setObstacles(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public Position getDimension() {
        return dimension;
    }

    public List<Rover> getRover() {
        return rover;
    }

    public void setRover(List<Rover> rover) {
        this.rover = rover;
    }
}
