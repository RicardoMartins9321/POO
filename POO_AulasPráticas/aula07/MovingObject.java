package aula07;

public class MovingObject {
    private int x;
    private int y;
    private int distanceTraveled;

    public MovingObject(int x, int y) {
        this.x = x;
        this.y = y;
        this.distanceTraveled = 0;
    }

    public void move(int newX, int newY) {
        int distance = (int) Math.sqrt(Math.pow(newX - x, 2) + Math.pow(newY - y, 2));
        distanceTraveled += distance;
        x = newX;
        y = newY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }
}
