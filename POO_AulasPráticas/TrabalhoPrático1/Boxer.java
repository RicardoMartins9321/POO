package P05;

public class Boxer extends Fighter {
    private int range = (int) Math.floor(Math.random() * 10) + 1;
    private int distance;
    private int damage;
    

    public Boxer(String name, int life, int numVictorys, int numDefeats, int range, int distance) {
        super(name, life, numVictorys, numDefeats);
        this.range = range;
        this.distance = distance;
    }

    public double getRange() {
        return range;
    }

    public int getDistance() {
        return distance;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setDistance(int distance) {
        this.distance = (int) Math.floor(Math.random() * 10) + 1;
    }

    public int attack(Fighter fighter) {
        if (distance < range) {
            damage = (int) Math.floor(Math.random() * 100) + 1;
            return damage;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Distance: " + distance + "Range: " + range + "Damage: " + damage;
    }


}
