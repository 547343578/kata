package com.lucas.marsrover;

import com.lucas.marsrover.model.Mars;
import com.lucas.marsrover.model.Position;
import com.lucas.marsrover.model.Rover;
import com.lucas.marsrover.model.directions.Direction;
import com.lucas.marsrover.utils.ActionUtilsApi;
import com.lucas.marsrover.utils.Impl.ActionActionUtils;

import java.util.Scanner;

public class MarsRover {

    static ActionUtilsApi utils = new ActionActionUtils();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dimension of MARS: ");
        System.out.println("like: 50 50");
        String dimension = sc.nextLine();
        char[] dim = dimension.toCharArray();
        Mars mars = new Mars(new Position((int) dim[0], (int) dim[1]));

        System.out.println("Introduce the rover'position: ");
        String position = sc.nextLine();
        Position positionRover = new Position((int)position.toCharArray()[0], (int)position.toCharArray()[1]);

        System.out.println("Introduce the rover'direction: ");
        System.out.println("EAST -----> e");
        System.out.println("WEST -----> w");
        System.out.println("SOUTH -----> s");
        System.out.println("NORTH -----> n");
        String direction = sc.nextLine().toLowerCase();
        Direction directionRover = utils.getDirectionMap().get(direction.toUpperCase());
        Rover rover = new Rover(directionRover, positionRover, mars);

        System.out.println("Introduce commands: ");
        System.out.println("Move forward -----> f");
        System.out.println("Move backward -----> b");
        System.out.println("Turn left -----> l");
        System.out.println("Turn right -----> r");
        utils.analizeCommands(sc.nextLine(), rover);

        System.out.println("Rover's position: " + rover.toString());
    }
}
