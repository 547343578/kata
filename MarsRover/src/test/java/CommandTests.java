import com.lucas.marsrover.exception.ObstacleException;
import com.lucas.marsrover.exception.UnknownCommandException;
import com.lucas.marsrover.model.Mars;
import com.lucas.marsrover.model.Position;
import com.lucas.marsrover.model.Rover;
import com.lucas.marsrover.model.directions.Direction;
import com.lucas.marsrover.model.directions.North;
import com.lucas.marsrover.utils.Impl.ActionActionUtils;
import com.lucas.marsrover.utils.ActionUtilsApi;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandTests {


    ActionUtilsApi utils = new ActionActionUtils();
    Mars mars = new Mars(new Position(50,50));

    @Test
    public void commands_test(){
        Direction direction = new North();
        Position position = new Position(5,10);
        Rover rover = new Rover(direction, position, mars);
        String commands = "fffrffflbb";

        utils.analizeCommands(commands, rover);

        assertEquals(rover.getDirection().getDirection(), "N");
        assertEquals(rover.getPosition().getX(), 8);
        assertEquals(rover.getPosition().getY(), 11);
    }

    @Test(expected = UnknownCommandException.class)
    public void unkown_commands_test(){
        Direction direction = new North();
        Position position = new Position(1,1);
        Rover rover = new Rover(direction, position, mars);
        String commands = "frfofbr";

        utils.analizeCommands(commands, rover);
    }
}
