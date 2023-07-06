package aula07;

public class Ball extends MovingObject {
    private String color;
    int x;
    int y;

    public Ball(String color, int x, int y) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void reset() {
        x = 0;
        y = 0;
    }
}
