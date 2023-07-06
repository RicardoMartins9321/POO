package aula07;

public class Ex7_3 {
    public static void main(String[] args) {
        // Create teams
        Robot[] team1Robots = { new Robot("R1", "Goalkeeper", 0, 0), new Robot("R2", "Defender", 0, 0), new Robot("R3", "Forward", 0, 0) };
        Team team1 = new Team("Team 1", "John Doe", team1Robots);
        Robot[] team2Robots = { new Robot("R4", "Goalkeeper", 0, 0), new Robot("R5", "Defender", 0, 0), new Robot("R6", "Forward", 0, 0) };
        Team team2 = new Team("Team 2", "Jane Doe", team2Robots);

        // Create ball
        Ball ball = new Ball("White", 0, 0);

        // Create game
        Game game = new Game(team1, team2, ball, 60); // 60 seconds duration

        // Start game
        game.start();

        // Simulate movements
        while (game.isInProgress()) {
            // Team 1 moves
            for (Robot robot : team1.getRobots()) {
                int randomX = (int) (Math.random() * 10); // random movement in X axis
                int randomY = (int) (Math.random() * 10); // random movement in Y axis
                robot.move(randomX, randomY);
            }

            // Team 2 moves
            for (Robot robot : team2.getRobots()) {
                int randomX = (int) (Math.random() * 10); // random movement in X axis
                int randomY = (int) (Math.random() * 10); // random movement in Y axis
                robot.move(randomX, randomY);
            }

            // Check if a goal was scored
            if (ball.getX() < 0) { // ball crossed the left goal line, team 2 scored
                team2.scoreGoal();
                System.out.println("Goal for " + team2.getName() + "!");
                ball.reset();
            } else if (ball.getX() > 100) { // ball crossed the right goal line, team 1 scored
                team1.scoreGoal();
                System.out.println("Goal for " + team1.getName() + "!");
                ball.reset();
            }

            try {
                Thread.sleep(1000); // wait for 1 second before simulating next movement
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print final score
        System.out.println("Final score:");
        System.out.println(team1.getName() + ": " + team1.getGoalsScored() + " goals");
        System.out.println(team2.getName() + ": " + team2.getGoalsScored() + " goals");
    }

}
