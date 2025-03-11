package application.service;

import domain.model.CleaningRobot;
import domain.model.Grid;
import domain.model.Position;
import domain.model.Orientation;

public class CleaningRobotService {
    private final InstructionProcessor instructionProcessor = new InstructionProcessor();

    public Position executeRobot(Grid grid, int startX, int startY, char startOrientation, String instructions) {
        Position startPosition = new Position(startX, startY, Orientation.valueOf(String.valueOf(startOrientation)));
        CleaningRobot robot = new CleaningRobot(startPosition, grid);
        instructionProcessor.processInstructions(robot, instructions);
        return robot.getPosition();
    }
}
