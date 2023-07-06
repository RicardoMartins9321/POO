package aula07;

public class Robot extends MovingObject {
    private String id;
    private String type;
    private int goalsScored;

    public Robot(String id, String type, int x, int y) {
        super(x, y);
        this.id = id;
        this.type = type;
        this.goalsScored = 0;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void scoreGoal() {
        goalsScored++;
    }
}
