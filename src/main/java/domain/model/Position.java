package domain.model;

public class Position {
    private int x;
    private int y;
    private Orientation orientation;

    public Position(int x, int y, Orientation orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void moveForward() {
        switch (orientation) {
            case N -> y++;
            case S -> y--;
            case E -> x++;
            case W -> x--;
        }
    }

    public void rotateLeft() {
        this.orientation = orientation.rotateLeft();
    }

    public void rotateRight() {
        this.orientation = orientation.rotateRight();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    @Override
    public String toString() {
        return x + " " + y + " " + orientation;
    }
}