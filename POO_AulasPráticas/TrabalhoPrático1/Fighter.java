package P05;
import java.util.Random;

public abstract class Fighter {
    private String name;
    private int life = 100;
    private int numVictorys = 0;
    private int numDefeats = 0;

    public Fighter(String name, int life, int numVictorys, int numDefeats) {
        this.name = name;
        this.life = life;
        this.numVictorys = numVictorys;
        this.numDefeats = numDefeats;
    }

    public String getname() {
        return name;
    }

    public String setName() {
        Random ran = new Random();
        int top = 3;
        char data = ' ';
        String dat = "";

        for (int i=0; i<=top; i++) {
        data = (char)(ran.nextInt(25)+97);
        dat = data + dat;
        }
        return this.name = dat;
    }

    public int getlife() {
        return life;
    }

    public int getnumVictory() {
        return numVictorys;
    }

    public int getnum_defeats() {
        return numDefeats;
    }

    public boolean isAlive() {
        if (life != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        else {
            return false;
        }
    }

    public abstract int attack(Fighter fighter);

    @Override
    public String toString() {
        return "name: " + name + "life: " + life + "num_victorys: " + numVictorys + "num_victorys: " + numDefeats;
    }
}
