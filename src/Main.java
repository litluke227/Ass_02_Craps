import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        Random rnd = new Random();
        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int dieSum = die1 + die2;
            System.out.println("The dice are " + die1 + " and " + die2);
            if (dieSum == 2 || dieSum == 3 || dieSum == 12) {
                System.out.println("Craps! You lose");
            }
            if (dieSum == 7 || dieSum == 11) {
                System.out.println("With a sum of " + dieSum + ", you WIN with a natural!!!");
            } else {
                int point = dieSum;
                System.out.println("The point you are trying to hit is: " + point);
                while (true) {
                    int dieRoll1 = rnd.nextInt(6) + 1;
                    int dieRoll2 = rnd.nextInt(6) + 1;
                    int dieSum2 = dieRoll1 + dieRoll2;
                    System.out.println("You rolled " + dieRoll1 + " and " + dieRoll2);
                    if (dieSum2 == point) {
                        System.out.println("You win by matching the point!");
                        break;
                    } else if (dieSum2 == 7) {
                        System.out.println("You lose by rolling a 7");
                        break;
                    }
                }

                System.out.println("Do you want to play again?");
                String confirm = in.nextLine();
                done = !confirm.equalsIgnoreCase("Y");


            }
        } while (!done);
    }
}