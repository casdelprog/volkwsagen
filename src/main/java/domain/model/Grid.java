package domain.model;

public class Grid {
    private final int width;
    private final int height;

    public Grid(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Grid dimensions must be positive.");
        }
        this.width = width;
        this.height = height;
    }

    public boolean isWithinBounds(Position position) {
        return position.getX() >= 0 && position.getX() <= width &&
                position.getY() >= 0 && position.getY() <= height;
    }
}