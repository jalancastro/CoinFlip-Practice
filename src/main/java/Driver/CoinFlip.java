package Driver;

import java.util.*;

public class CoinFlip {

    public static void main(String[] args) {
        int coin, num;
        int hCount = 0;
        int tCount = 0;
        double count = 0;
        double hAvg, tAvg;

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Press 1 to flip a coin or press 0 to exit.");
        int input = scan.nextInt();

        while (input != 0) {

            System.out.println("How many times would you like to flip a coin?");
            num = scan.nextInt();

            for (int i = 0; i < num; i++){
                coin = rand.nextInt(2);
                if (coin % 2 == 0) {
                    System.out.println("Heads");
                    hCount++;
                    count++;
                } else {
                    System.out.println("Tails");
                    tCount++;
                    count++;
                }
            }

            System.out.println("Would you like to keep flipping? 1 for Yes, 0 for No.");
            input = scan.nextInt();
        }

        hAvg = ((hCount * 100)/count);
        tAvg = ((tCount * 100)/count);

        System.out.println("Stats:");
        System.out.println("------");

        System.out.print("Heads: " + hCount + " | ");
        System.out.printf("%.2f", hAvg);
        System.out.println("%");

        System.out.print("Tails: " + tCount + " | ");
        System.out.printf("%.2f", tAvg);
        System.out.println("%");

        System.out.println("\nThank you for playing!");
    }


}
