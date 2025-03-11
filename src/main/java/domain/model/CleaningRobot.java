package domain.model;

public class CleaningRobot {
    private Position position;
    private final Grid grid;

    public CleaningRobot(Position startPosition, Grid grid) {
        if (!grid.isWithinBounds(startPosition)) {
            throw new IllegalArgumentException("Starting position is out of bounds.");
        }
        this.position = startPosition;
        this.grid = grid;
    }

    public void executeInstruction(char instruction) {
        switch (instruction) {
            case 'L' -> position.rotateLeft();
            case 'R' -> position.rotateRight();
            case 'M' -> move();
            default -> throw new IllegalArgumentException("Invalid instruction: " + instruction);
        }
    }

    private void move() {
        Position newPosition = new Position(position.getX(), position.getY(), position.getOrientation());
        newPosition.moveForward();
        if (grid.isWithinBounds(newPosition)) {
            this.position = newPosition;
        }
    }

    public Position getPosition() {
        return position;
    }
}