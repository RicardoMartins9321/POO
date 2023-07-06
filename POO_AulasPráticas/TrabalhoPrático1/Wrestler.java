package P05;

public class Wrestler extends Fighter {
    private int speed = (int) Math.floor(Math.random() * 10) + 1;
    private int distance;
    private int damage;

    public Wrestler(String name, int life, int numVictorys, int numDefeats, int distance, int speed) {
        super(name, life, numVictorys, numDefeats);
        this.distance = distance;
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public int getDistance() {
        return distance;
    }

    public void setRange(int speed) {
        this.speed = speed;
    }

    public void setDistance(int distance) {
        this.distance = (int) Math.floor(Math.random() * 10) + 1;
    }

    public int attack(Fighter fighter) {
        if (distance < speed) {
            damage = (int) Math.floor(Math.random() * 100) + 1;
            return damage;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Distance: " + distance + "Speed: " + speed + "Damage: " + damage;
    }

}
