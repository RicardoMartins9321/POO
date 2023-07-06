package aula07;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

public class Game {
    private Team team1;
    private Team team2;
    private Ball ball;
    private int durationInSeconds;
    private int elapsedSeconds;
    private Timer timer;

    public Game(Team team1, Team team2, Ball ball, int durationInSeconds) {
        this.team1 = team1;
        this.team2 = team2;
        this.ball = ball;
        this.durationInSeconds = durationInSeconds;
        this.elapsedSeconds = 0;
    }

    public void start() {
        timer = new Timer();
        Random random = new Random();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (elapsedSeconds < durationInSeconds) {
                    elapsedSeconds++;
                    System.out.println("Elapsed time: " + elapsedSeconds + " seconds");

                    // Move robots randomly
                    for (Robot robot : team1.getRobots()) {
                        int randomX = random.nextInt(100);
                        int randomY = random.nextInt(100);
                        robot.move(randomX, randomY);
                    }
                    for (Robot robot : team2.getRobots()) {
                        int randomX = random.nextInt(100);
                        int randomY = random.nextInt(100);
                        robot.move(randomX, randomY);
                    }

                    // Move ball randomly
                    int randomX = random.nextInt(100);
                    int randomY = random.nextInt(100);
                    ball.move(randomX, randomY);

                    // Check if ball is in goal
                    if (ball.getX() < 0) {
                        team2.scoreGoal();
                        System.out.println("Goal for team 2!");
                    } else if (ball.getX() > 100) {
                        team1.scoreGoal();
                        System.out.println("Goal for team 1!");
                    }
                } else {
                    end();
                }
            }
        }, 0, 1000);
    }

    private void end() {
        // game ended, display score and winner
        int team1Score = team1.getGoalsScored();
        int team2Score = team2.getGoalsScored();
        System.out.println("Game ended. Final score:");
        System.out.println(team1.getName() + ": " + team1Score);
        System.out.println(team2.getName() + ": " + team2Score);
        if (team1Score > team2Score) {
            System.out.println(team1.getName() + " wins!");
        } else if (team2Score > team1Score) {
            System.out.println(team2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
        timer.cancel(); // stop the timer
    }
    
    public boolean isInProgress() {
        return elapsedSeconds < durationInSeconds;
    }
}
