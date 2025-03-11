package infrastructure.adapter;

import application.service.CleaningRobotService;
import domain.model.Grid;
import domain.model.Position;

import java.util.Scanner;

public class ConsoleAdapter {
    private final CleaningRobotService service = new CleaningRobotService();

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int gridWidth = scanner.nextInt();
        int gridHeight = scanner.nextInt();
        Grid grid = new Grid(gridWidth, gridHeight);

        while (scanner.hasNext()) {
            int startX = scanner.nextInt();
            int startY = scanner.nextInt();
            char startOrientation = scanner.next().charAt(0);
            String instructions = scanner.next();

            Position finalPosition = service.executeRobot(grid, startX, startY, startOrientation, instructions);
            System.out.println(finalPosition);
        }

        scanner.close();
    }
}