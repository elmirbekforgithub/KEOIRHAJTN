package practica.firstEtap;

import java.util.Random;
import java.util.Scanner;

public class FirstStage {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);


    //realization
    public static void main(String[] args) {
        while (true) {
            System.out.print("-----<<< Start Game >>>-----\nPredicate amount of points (2 ... 12)\nWrite here: ");
            int a = in.nextInt();
            if (a >= 2 && 12 >= a) {
                System.out.println("User rolls the dises...");
                int randomNumbers = random.nextInt(5) + 1;
                int randomNumbers1 = random.nextInt(5) + 1;
                firstCub(randomNumbers);
                secondCub(randomNumbers1);
                suma(randomNumbers, randomNumbers1, a);
            } else {
                System.err.println("wrong\nTRY AGAIN");
            }
        }
    }


    //firstCub
    public static void firstCub(int randomNumbers) {
        switch (randomNumbers) {
            case 1:
                System.out.println("+-------+\n|       |\n|   #   |\n|       |\n+-------+");
                break;
            case 2:
                System.out.println("+-------+\n| #     |\n|       |\n|     # |\n+-------+");
                break;
            case 3:
                System.out.println("+-------+\n|     # |\n|   #   |\n| #     |\n+-------+");
                break;
            case 4:
                System.out.println("+-------+\n| # #   |\n| # #   |\n|       |\n+-------+");
                break;
            case 5:
                System.out.println("+-------+\n| #   # |\n|   #   |\n| #   # |\n+-------+");
                break;
            case 6:
                System.out.println("+-------+\n| #   # |\n| #   # |\n| #   # |\n+-------+");
                break;
            default:
                System.err.println("Don't!");
        }
    }

    //secondCub
    public static void secondCub(int randomNumbers1) {
        switch (randomNumbers1) {
            case 1:
                System.out.println("+-------+\n|       |\n|   #   |\n|       |\n+-------+");
                break;
            case 2:
                System.out.println("+-------+\n| #     |\n|       |\n|     # |\n+-------+");
                break;
            case 3:
                System.out.println("+-------+\n|     # |\n|   #   |\n| #     |\n+-------+");
                break;
            case 4:
                System.out.println("+-------+\n| # #   |\n| # #   |\n|       |\n+-------+");
                break;
            case 5:
                System.out.println("+-------+\n| #   # |\n|   #   |\n| #   # |\n+-------+");
                break;
            case 6:
                System.out.println("+-------+\n| #   # |\n| #   # |\n| #   # |\n+-------+");
                break;
            default:
                System.err.println("Don't!");
        }
    }

    //suma
    public static void suma(int randomNumbers, int randomNumbers1, int a) {
        int summaInDar = randomNumbers + randomNumbers1;
        int allsuma = Math.abs(summaInDar - a) * 2;
        if (allsuma > 0) {
            System.out.println("you're wins \nyour scope: " + allsuma + "\n//////////////////////");
        } else if (allsuma < 0) {
            System.err.println("you lost because your point is less than 0 \nyour score: " + allsuma + "\n//////////////////////");
        }
    }
}
