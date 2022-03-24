import com.lucas.marsrover.exception.ObstacleException;
import com.lucas.marsrover.model.Mars;
import com.lucas.marsrover.model.Obstacle;
import com.lucas.marsrover.model.Position;
import com.lucas.marsrover.model.Rover;
import com.lucas.marsrover.model.directions.*;
import com.lucas.marsrover.utils.ActionUtilsApi;
import com.lucas.marsrover.utils.Impl.ActionActionUtils;
import org.junit.Test;



public class ObstacleDetectionTests {
    ActionUtilsApi utils = new ActionActionUtils();
    Mars mars = new Mars(new Position(50,50));

    @Test(expected = ObstacleException.class)
    public void generic_west_backward_obstacle_detection_test(){
        Direction direction = new West();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(2,1));

        mars.getObstacles().add(obstacle);
        utils.moveBackward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void generic_west_forward_obstacle_detection_test(){
        Direction direction = new West();
        Position position = new Position(2,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,1));

        mars.getObstacles().add(obstacle);
        utils.moveForward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void generic_east_backward_obstacle_detection_test(){
        Direction direction = new East();
        Position position = new Position(2,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,1));

        mars.getObstacles().add(obstacle);
        utils.moveBackward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void generic_east_forward_obstacle_detection_test(){
        Direction direction = new East();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(2,1));

        mars.getObstacles().add(obstacle);
        utils.moveForward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void generic_north_forward_obstacle_detection_test(){
        Direction direction = new North();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,2));

        mars.getObstacles().add(obstacle);
        utils.moveForward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void generic_north_backward_obstacle_detection_test(){
        Direction direction = new North();
        Position position = new Position(1,2);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,1));

        mars.getObstacles().add(obstacle);
        utils.moveBackward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void generic_south_forward_obstacle_detection_test(){
        Direction direction = new South();
        Position position = new Position(1,2);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,1));

        mars.getObstacles().add(obstacle);
        utils.moveForward(rover);
    }
    @Test(expected = ObstacleException.class)
    public void generic_south_backward_obstacle_detection_test(){
        Direction direction = new South();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,2));

        mars.getObstacles().add(obstacle);
        utils.moveBackward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void specific_west_backward_obstacle_detection_test(){
        Direction direction = new West();
        Position position = new Position(50,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,1));

        mars.getObstacles().add(obstacle);
        utils.moveBackward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void specific_west_forward_obstacle_detection_test(){
        Direction direction = new West();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(50,1));

        mars.getObstacles().add(obstacle);
        utils.moveForward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void specific_east_backward_obstacle_detection_test(){
        Direction direction = new East();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(50,1));

        mars.getObstacles().add(obstacle);
        utils.moveBackward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void specific_east_forward_obstacle_detection_test(){
        Direction direction = new East();
        Position position = new Position(50,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,1));

        mars.getObstacles().add(obstacle);
        utils.moveForward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void specific_north_forward_obstacle_detection_test(){
        Direction direction = new North();
        Position position = new Position(1,50);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,1));

        mars.getObstacles().add(obstacle);
        utils.moveForward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void specific_north_backward_obstacle_detection_test(){
        Direction direction = new North();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,50));

        mars.getObstacles().add(obstacle);
        utils.moveBackward(rover);
    }

    @Test(expected = ObstacleException.class)
    public void specific_south_forward_obstacle_detection_test(){
        Direction direction = new South();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,50));

        mars.getObstacles().add(obstacle);
        utils.moveForward(rover);
    }
    @Test(expected = ObstacleException.class)
    public void specific_south_backward_obstacle_detection_test(){
        Direction direction = new South();
        Position position = new Position(1,50);
        Rover rover = new Rover(direction, position, mars);
        Obstacle obstacle = new Obstacle(new Position(1,1));

        mars.getObstacles().add(obstacle);
        utils.moveBackward(rover);
    }

}
