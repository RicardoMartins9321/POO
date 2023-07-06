package aula07;

import java.util.ArrayList;

public class Team {
    private String name;
    private String personInCharge;
    private int goalsScored;
    private int goalsConceded;
    private ArrayList<Robot> robots;

    public Team(String name, String personInCharge) {
        this.name = name;
        this.personInCharge = personInCharge;
        this.goalsScored = 0;
        this.goalsConceded = 0;
        this.robots = new ArrayList<>();
    }

    public Team(String name, String personInCharge, Robot[] players) {
        this.name = name;
        this.personInCharge = personInCharge;
        this.goalsScored = 0;
        this.goalsConceded = 0;
    }
    

    public String getName() {
        return name;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public ArrayList<Robot> getRobots() {
        return robots;
    }

    public void addRobot(Robot robot) {
        robots.add(robot);
    }

    public void scoreGoal() {
        goalsScored++;
    }

    public void concedeGoal() {
        goalsConceded++;
    }
}
