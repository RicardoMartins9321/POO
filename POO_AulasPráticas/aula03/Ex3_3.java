package aula03;
import java.util.Scanner;

public class Ex3_3 {
    public static void main(String[] args){
        boolean play = true;
        Scanner sc = new Scanner(System.in);

        while(play==true) {
            double randomNum = Math.floor(Math.random() * 100) + 1;
            int guess;
            int count = 0;

            do{
            System.out.print("Digite um numero: ");
            guess = sc.nextInt();

            if (guess > randomNum){
                System.out.println("O numero que deste é muito alto");
            }else if (guess < randomNum){
                System.out.println("O número que deste é muito baixo");
            }
            count+=1;

            }while(guess != randomNum);
        
            System.out.printf("Parabéns descobriste o número %d em %d tentativas \n", guess, count);

            System.out.print("Queres jogar outra vez? ");
            String answer = sc.next();
            if(answer.equals("n")|| answer.equals("N") || answer.equals("nao")|| answer.equals("Nao")){
                play = false;
            }else if(answer.equals("s")|| answer.equals("S") || answer.equals("sim")|| answer.equals("Sim")){
                play = true;
            }else{
                System.out.println("Até mais!");
                break;
            }
        }
        sc.close();  
    }
}
