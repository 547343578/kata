import com.lucas.marsrover.exception.ObstacleException;
import com.lucas.marsrover.model.*;
import com.lucas.marsrover.model.directions.*;
import com.lucas.marsrover.utils.Impl.ActionActionUtils;
import com.lucas.marsrover.utils.ActionUtilsApi;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActionAndDirectionTests {

    ActionUtilsApi utils = new ActionActionUtils();
    Mars mars = new Mars(new Position(50,50));

    @Test
    public void is_rover_on_mars(){
        Direction direction = new East();
        Rover rover = new Rover(direction, new Position(5,5), mars);

        assertEquals(mars.getRover().size(), 1);
    }

    @Test
    public void generic_move_forward_north_test(){
        Direction direction = new North();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveForward(rover);
        assertEquals(rover.getPosition().getY(), 2);
    }

    @Test
    public void generic_move_backward_north_test(){
        Direction direction = new North();
        Position position = new Position(1,2);
        Rover rover = new Rover(direction, position, mars);

        utils.moveBackward(rover);
        assertEquals(rover.getPosition().getY(), 1);
    }

    @Test
    public void generic_move_forward_south_test(){
        Direction direction = new South();
        Position position = new Position(1,2);
        Rover rover = new Rover(direction, position, mars);

        utils.moveForward(rover);
        assertEquals(rover.getPosition().getY(), 1);
    }

    @Test
    public void generic_move_backward_south_test(){
        Direction direction = new South();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveBackward(rover);
        assertEquals(rover.getPosition().getY(), 2);
    }

    @Test
    public void generic_move_forward_west_test(){
        Direction direction = new West();
        Position position = new Position(2,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveForward(rover);
        assertEquals(rover.getPosition().getX(), 1);
    }

    @Test
    public void generic_move_backward_west_test(){
        Direction direction = new West();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveBackward(rover);
        assertEquals(rover.getPosition().getX(), 2);
    }

    @Test
    public void generic_move_forward_east_test(){
        Direction direction = new East();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveForward(rover);
        assertEquals(rover.getPosition().getX(), 2);
    }

    @Test
    public void generic_move_backward_east_test(){
        Direction direction = new East();
        Position position = new Position(2,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveBackward(rover);
        assertEquals(rover.getPosition().getX(), 1);
    }

    @Test
    public void specific_move_forward_north_test(){
        Direction direction = new North();
        Position position = new Position(1,50);
        Rover rover = new Rover(direction, position, mars);

        utils.moveForward(rover);
        assertEquals(rover.getPosition().getY(), 1);
    }

    @Test
    public void specific_move_backward_north_test(){
        Direction direction = new North();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveBackward(rover);
        assertEquals(rover.getPosition().getY(), 50);
    }

    @Test
    public void specific_move_forward_south_test(){
        Direction direction = new South();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveForward(rover);
        assertEquals(rover.getPosition().getY(), 50);
    }

    @Test
    public void specific_move_backward_south_test(){
        Direction direction = new South();
        Position position = new Position(1,50);
        Rover rover = new Rover(direction, position, mars);

        utils.moveBackward(rover);
        assertEquals(rover.getPosition().getY(), 1);
    }

    @Test
    public void specific_move_forward_west_test(){
        Direction direction = new West();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveForward(rover);
        assertEquals(rover.getPosition().getX(), 50);
    }

    @Test
    public void specific_move_backward_west_test(){
        Direction direction = new West();
        Position position = new Position(50,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveBackward(rover);
        assertEquals(rover.getPosition().getX(), 1);
    }

    @Test
    public void specific_move_forward_east_test(){
        Direction direction = new East();
        Position position = new Position(50,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveForward(rover);
        assertEquals(rover.getPosition().getX(), 1);
    }

    @Test
    public void specific_move_backward_east_test(){
        Direction direction = new East();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);

        utils.moveBackward(rover);
        assertEquals(rover.getPosition().getX(), 50);
    }

    @Test
    public void turn_left_test(){
        Direction direction = new North();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);

        utils.turnLeft(rover);
        assertEquals(rover.getDirection().getDirection(), "W");
        utils.turnLeft(rover);
        assertEquals(rover.getDirection().getDirection(), "S");
        utils.turnLeft(rover);
        assertEquals(rover.getDirection().getDirection(), "E");
        utils.turnLeft(rover);
        assertEquals(rover.getDirection().getDirection(), "N");
    }

    @Test
    public void turn_right_test(){
        Direction direction = new North();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);

        utils.turnRight(rover);
        assertEquals(rover.getDirection().getDirection(), "E");
        utils.turnRight(rover);
        assertEquals(rover.getDirection().getDirection(), "S");
        utils.turnRight(rover);
        assertEquals(rover.getDirection().getDirection(), "W");
        utils.turnRight(rover);
        assertEquals(rover.getDirection().getDirection(), "N");
    }


}
