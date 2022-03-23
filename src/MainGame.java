import java.util.Scanner;
import java.util.Random;

public class MainGame {

    int i;
    int winStrike;

    void start(){

        System.out.println("Play, play, play!");
        System.out.println("Enter: Heads, Tails or Edge!");
        System.out.println("Use 'exit' to off this game.");
        System.out.println();
        while(true) {
            Scanner scan1 = new Scanner(System.in);
            String scanStr = scan1.nextLine();
            String headsStr = "heads"; // 0
            String tailsStr = "tails"; // 1
            String edgeStr = "edge"; // 2

            Random rand = new Random();
            int value = 3;
            int randInt = rand.nextInt(value);

            if (scanStr.equalsIgnoreCase(headsStr)) {
                if (randInt == 0) {
                    System.out.println();
                    System.out.println("Win!");
                    System.out.println();
                    i++;
                    if (i >= winStrike) {
                        winStrike = i;
                        System.out.println("Your current Win Strike: " + i);
                        System.out.println("Your Win strike: " + winStrike);
                        System.out.println();
                    } else {
                        System.out.println("Your current Win Strike: " + i);
                        System.out.println("Your Win strike: " + winStrike);
                        System.out.println();
                    }
                } else {
                    System.out.println();
                    System.out.println("Lose :с");
                    System.out.println();
                    if (randInt == 1) {
                        System.out.println("This is a Tails!");
                        System.out.println();
                    } else {
                        System.out.println("This is a Edge!");
                        System.out.println();
                    }
                    i = 0;
                    System.out.println("Your current Win Strike: " + i);
                    System.out.println("Your Win strike: " + winStrike);
                    System.out.println();
                }
            } else if (scanStr.equalsIgnoreCase(tailsStr)) {
                if (randInt == 1) {
                    System.out.println();
                    System.out.println("Win!");
                    System.out.println();
                    i++;
                    if (i >= winStrike) {
                        winStrike = i;
                        System.out.println("Your current Win Strike: " + i);
                        System.out.println("Your Win strike: " + winStrike);
                        System.out.println();
                    } else {
                        System.out.println("Your current Win Strike: " + i);
                        System.out.println("Your Win strike: " + winStrike);
                        System.out.println();
                    }
                } else {
                    System.out.println();
                    System.out.println("Lose :с");
                    System.out.println();
                    if (randInt == 0) {
                        System.out.println("This is a Eagle!");
                        System.out.println();
                    } else {
                        System.out.println("This is a Edge!");
                        System.out.println();
                    }
                    i = 0;
                    System.out.println("Your current Win Strike: " + i);
                    System.out.println("Your Win strike: " + winStrike);
                    System.out.println();
                }
            } else if (scanStr.equalsIgnoreCase(edgeStr)) {
                if (randInt == 2) {
                    System.out.println();
                    System.out.println("Win!");
                    System.out.println();
                    i++;
                    if (i >= winStrike) {
                        winStrike = i;
                        System.out.println("Your current Win Strike: " + i);
                        System.out.println("Your Win strike: " + winStrike);
                        System.out.println();
                    } else {
                        System.out.println("Your current Win Strike: " + i);
                        System.out.println("Your Win strike: " + winStrike);
                        System.out.println();
                    }
                } else {
                    System.out.println();
                    System.out.println("Lose :с");
                    System.out.println();
                    if (randInt == 0) {
                        System.out.println("This is a Eagle!");
                        System.out.println();
                    } else {
                        System.out.println("This is a Tails!");
                        System.out.println();
                    }
                    i = 0;
                    System.out.println("Your current Win Strike: " + i);
                    System.out.println("Your Win strike: " + winStrike);
                    System.out.println();
                }
            } else if(scanStr.isEmpty()) {
                System.out.println("Something went wrong... OPS.");
            } else if(scanStr.equalsIgnoreCase("exit")){
                System.exit(0);
            } else {
                System.out.println("Something went wrong... OPS.");
            }
        }
    }
}