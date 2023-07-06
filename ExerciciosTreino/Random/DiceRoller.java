package ExerciciosTreino.Random;

import java.util.Random;


public class DiceRoller {
    
    Random random;
    int number;
 
    // this is what you call a constructor
    DiceRoller(){
        random = new Random();
        roll();
    }
 
    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

}
