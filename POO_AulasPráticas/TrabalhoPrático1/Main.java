package P05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fighter[] figthers = new Fighter[10];
        
        int choice = 0;
        do {
            System.out.println("Game menu:");
            System.out.println("1. Generate fighters");
            System.out.println("2. Show all fighters");
            System.out.println("3. Start fight between selected fighters");
            System.out.println("4. Start fight between random fighters");
            System.out.println("5. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // generate fighters
                    Fighter fighter = new Fighter();
                    break;
                case 2:
                    // show fighters
                    System.out.println(figthers);
                    break;
                case 3:
                    //simulate a fight between selected fighters
                    int n1;
                    int n2;
                    do{
                        System.out.print("Enter Fighther2's number: ");
                        n1 = scanner.nextInt();
                        System.out.print("Enter Fighther2's number: ");
                        n2 = scanner.nextInt();
                    } while(n1 < 0 || n2 < 0);
                    Fighter fighter1 = figthers[n1];
                    Fighter fighter2 = figthers[n2];
                    break;
                case 4:
                    //simulate a fight between random fighters
                    n1 = (int) Math.floor(Math.random() * 10) + 1;
                    n2 = (int) Math.floor(Math.random() * 10) + 1;
                    Fighter randomFighter = figthers[n1];
                    Fighter randomFighter2 = figthers[n2];
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Opção não existe!");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}
