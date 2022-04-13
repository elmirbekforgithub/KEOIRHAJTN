package practica.realwork;

import practica.ConsoleColors;

import javax.xml.xpath.XPathEvaluationResult;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ClassWhichRepo {
    static Random rn = new Random();
    static Scanner sn = new Scanner(System.in);
    static Scanner line = new Scanner(System.in);
    static int cheat = rn.nextInt(3) + 1;
    static int random = rn.nextInt(5) + 1;
    static int random1 = rn.nextInt(5) + 1;
    static int random2 = rn.nextInt(5) + 1;
    static int random3 = rn.nextInt(5) + 1;
    static int random11 = rn.nextInt(5) + 1;
    static int random22 = rn.nextInt(5) + 1;
    static int random33 = rn.nextInt(5) + 1;
    static int random44 = rn.nextInt(5) + 1;
    static int random111 = rn.nextInt(5) + 1;
    static int random222 = rn.nextInt(5) + 1;
    static int random333 = rn.nextInt(5) + 1;
    static int random444 = rn.nextInt(5) + 1;

    public static void round1() {
        System.out.println("ROUND: 1");
        System.out.println("-----<< Start Game >>-----");
        System.out.print("Predict amount of points << 2 -> 12 >> here: ");
        int a = sn.nextInt();
        System.out.println("Do you want to cheat ? ( Y / N ) here");
        String cheatChoice = line.nextLine();
        if (cheatChoice.equals("Y")) {
            switch (cheat) {
                case 1:
                    System.out.println("did not have time");
                    break;
                case 2:
                    System.out.println("you're successfully cheated " + cheating());

                case 3:
                    System.out.println("did not have time");
                    break;
                case 4:
                    System.out.println("you're successfully cheated " + cheating());
                    break;
            }
        }
        if (a >= 2 && 12 >= a) {
            System.out.println("User rolls of points...");
            ClassForSwitch.choiceCub(random);
            ClassForSwitch.choiceCub(random1);
            int sumDice = random + random1;
            int sumaResult = Math.abs(sumDice - a) * 2;
            System.out.println("On the dice fell " + sumDice + " points.");
            System.out.println("Result is " + sumDice + " - abs ( " + sumDice + " - " + a + " )*2 : " + sumaResult + " points!.");
            System.out.println("now turn Computer ");
            System.out.println("Computer rolls the dice...");
            int ran = rn.nextInt(11) + 1;
            System.out.println("number Computer: " + ran);
            ClassForSwitch.choiceCub(random2);
            ClassForSwitch.choiceCub(random3);
            int sumBoot = random2 + random3;
            int sa = Math.abs(sumBoot - ran) * 2;
            System.out.println("On the dice fell " + sumBoot + " points!.");
            System.out.println("Result is " + sumBoot + " - abs ( " + sumBoot + " - " + ran + " )*2 : " + sa + " points!.");

            int ofr = 0;
            if (sumaResult > sa) {
                ofr = sa - sumaResult;
                System.out.println("**************************");
                System.out.println("     winner User");
                System.out.println("----Current score----");
                System.out.println("| User:      " + sumaResult);
                System.out.println("| Computer:  " + sa);
                System.out.println("User is ahead by " + ofr + " points!");
                System.out.println("**************************");
            } else if (sa > sumaResult) {
                ofr = sa - sumaResult;

                System.out.println("**************************");
                System.out.println("     winner Computer");
                System.out.println("----Current score----");
                System.out.println("| Computer:      " + sa);
                if (cheat == 3 || cheat == 1) {
                    int newSum = sumaResult - 10;
                    System.out.println("| User:          " + newSum);
                } else {
                    System.out.println("| User:          " + sumaResult);
                }
                System.out.println("Computer is ahead by " + ofr + " points!");
                System.out.println("**************************");
            }

        }


// TODO: body method
    }

    public static void round2() {

        System.out.println("ROUND: 2");
        System.out.println("-----<< Start Game >>-----");
        System.out.print("Predict amount of points << 2 -> 12 >> here: ");
        int a = sn.nextInt();
        System.out.println("Do you want to cheat ? ( Y / N ) here");
        String cheatChoice = line.nextLine();
        if (cheatChoice.equals("Y")) {
            switch (cheat) {
                case 1:
                    System.out.println("did not have time");
                    break;
                case 2:
                    System.out.println("you're successfully cheated " + cheating());

                case 3:
                    System.out.println("did not have time");
                    break;
                case 4:
                    System.out.println("you're successfully cheated " + cheating());
                    break;
            }
        }
        if (a >= 2 && 12 >= a) {
            System.out.println("User rolls of points...");
            ClassForSwitch.choiceCub(random11);
            ClassForSwitch.choiceCub(random22);
            int sumDice = random11 + random22;
            int sumaResult = Math.abs(sumDice - a) * 2;
            System.out.println("On the dice fell " + sumDice + " points.");
            System.out.println("Result is " + sumDice + " - abs ( " + sumDice + " - " + a + " )*2 : " + sumaResult + " points!.");
            System.out.println("now turn Computer ");
            System.out.println("Computer rolls the dice...");
            int ran = rn.nextInt(11) + 1;
            System.out.println("number Computer: " + ran);
            ClassForSwitch.choiceCub(random33);
            ClassForSwitch.choiceCub(random44);
            int sumBoot = random33 + random44;
            int sa = Math.abs(sumBoot - ran) * 2;
            System.out.println("On the dice fell " + sumBoot + " points!.");
            System.out.println("Result is " + sumBoot + " - abs ( " + sumBoot + " - " + ran + " )*2 : " + sa + " points!.");
            int ofr = 0;
            if (sumaResult > sa) {
                ofr = sa - sumaResult;
                System.out.println("**************************");
                System.out.println("     winner User");
                System.out.println("----Current score----");
                System.out.println("| User:      " + sumaResult);
                System.out.println("| Computer:  " + sa);
                System.out.println("User is ahead by " + ofr + " points!");
                System.out.println("**************************");
            } else if (sa > sumaResult) {
                ofr = sa - sumaResult;

                System.out.println("**************************");
                System.out.println("     winner Computer");
                System.out.println("----Current score----");
                System.out.println("| Computer:      " + sa);
                if (cheat == 3 || cheat == 1) {
                    int newSum = sumaResult - 10;
                    System.out.println("| User:          " + newSum);
                } else {
                    System.out.println("| User:          " + sumaResult);
                }
                System.out.println("Computer is ahead by " + ofr + " points!");
                System.out.println("**************************");

            }
        }

        // TODO: body class
    }

    public static void round3() {
        System.out.println("ROUND: 3");
        System.out.println("-----<< Start Game >>-----");
        System.out.print("Predict amount of points << 2 -> 12 >> here: ");
        int a = sn.nextInt();
        System.out.println("Do you want to cheat ? ( Y / N ) here");
        String cheatChoice = line.nextLine();
        if (cheatChoice.equals("Y")) {
            switch (cheat) {
                case 1:
                    System.out.println("did not have time");
                    break;
                case 2:
                    System.out.println("you're successfully cheated " + cheating());

                case 3:
                    System.out.println("did not have time");
                    break;
                case 4:
                    System.out.println("you're successfully cheated " + cheating());
                    break;
            }
        }
        if (a >= 2 && 12 >= a) {
            System.out.println("User rolls of points...");
            ClassForSwitch.choiceCub(random111);
            ClassForSwitch.choiceCub(random222);
            int sumDice = random111 + random222;
            int sumaResult = Math.abs(sumDice - a) * 2;
            System.out.println("On the dice fell " + sumDice + " points.");
            System.out.println("Result is " + sumDice + " - abs ( " + sumDice + " - " + a + " )*2 : " + sumaResult + " points!.");
            System.out.println("now turn Computer ");
            System.out.println("Computer rolls the dice...");
            int ran = rn.nextInt(11) + 1;
            System.out.println("number Computer: " + ran);
            ClassForSwitch.choiceCub(random333);
            ClassForSwitch.choiceCub(random444);
            int sumBoot = random333 + random444;
            int sa = Math.abs(sumBoot - ran) * 2;
            System.out.println("On the dice fell " + sumBoot + " points!.");
            System.out.println("Result is " + sumBoot + " - abs ( " + sumBoot + " - " + ran + " )*2 : " + sa + " points!.");
            int ofr = 0;
            if (sumaResult > sa) {
                ofr = sa - sumaResult;
                System.out.println("**************************");
                System.out.println("     winner User");
                System.out.println("----Current score----");
                System.out.println("| User:      " + sumaResult);
                System.out.println("| Computer:  " + sa);
                System.out.println("User is ahead by " + ofr + " points!");
                System.out.println("**************************");
            } else if (sa > sumaResult) {
                ofr = sa - sumaResult;

                System.out.println("**************************");
                System.out.println("     winner Computer");
                System.out.println("----Current score----");
                System.out.println("| Computer:      " + sa);
                if (cheat == 3 || cheat == 1) {
                    int newSum = sumaResult - 10;
                    System.out.println("| User:          " + newSum);
                } else {
                    System.out.println("| User:          " + sumaResult);
                }
                System.out.println("Computer is ahead by " + ofr + " points!");
                System.out.println("**************************");
            }
        }
    }

    public static int cheating() {
        int random = rn.nextInt(2) + 1;
        int random1 = rn.nextInt(3) + 1;
        ClassForSwitch.choiceCub(random);
        ClassForSwitch.choiceCub(random1);
        int sumaCheat = random + random1;
        return sumaCheat;
    }

    public static void finishGame1(int a, int sumDice, int sumaResult, int ran, int sumaBoot, int sa) {
        System.out.println("----------Finish Game-----------");
        System.out.println("Round | User          | Boot");
        System.out.println("-------------------------------");
        System.out.println("      | Predicted: " + a + "         | Predicted: " + ran);
        System.out.println(" -1-  | Dice:      " + sumDice + "     | Dice:    : " + sumaBoot);
        System.out.println("      | Result:    " + sumaResult + "     | Result:  : " + sa);
        System.out.println("----------------------------------------------------------------");
    }
}