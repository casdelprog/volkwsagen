import domain.model.CleaningRobot;
import domain.model.Grid;
import domain.model.Orientation;
import domain.model.Position;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CleaningRobotTest {
    @Test
    void testMovementAndRotation() {
        Grid grid = new Grid(5, 5);
        Position startPosition = new Position(1, 2, Orientation.N);
        CleaningRobot robot = new CleaningRobot(startPosition, grid);

        robot.executeInstruction('L');
        assertEquals(Orientation.W, robot.getPosition().getOrientation());

        robot.executeInstruction('M');
        assertEquals(0, robot.getPosition().getX());
        assertEquals(2, robot.getPosition().getY());

        robot.executeInstruction('R');
        assertEquals(Orientation.N, robot.getPosition().getOrientation());
    }
}