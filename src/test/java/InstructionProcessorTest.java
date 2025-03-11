
import application.service.InstructionProcessor;
import domain.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InstructionProcessorTest {
    @Test
    void testProcessingInstructions() {
        Grid grid = new Grid(5, 5);
        Position startPosition = new Position(3, 3, Orientation.E);
        CleaningRobot robot = new CleaningRobot(startPosition, grid);
        InstructionProcessor processor = new InstructionProcessor();

        processor.processInstructions(robot, "MMRMMRMRRM");

        assertEquals(5, robot.getPosition().getX());
        assertEquals(1, robot.getPosition().getY());
        assertEquals(Orientation.E, robot.getPosition().getOrientation());
    }
}
