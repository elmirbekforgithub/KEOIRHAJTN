package practica.secondEtap;

import java.util.Random;
import java.util.Scanner;

public class SecondStage {
    static Random random = new Random();
    static Scanner in = new Scanner(System.in);

    //realization
    public static void main(String[] args) {
        System.out.print("-----<<< Start Game >>>-----\nPredicate amount of points (2 ... 12)\nWrite here: ");
        int forUser = in.nextInt();
        int forBoot = random.nextInt(11) + 1;
        int randomForBoot = random.nextInt(5) + 1;
        int randomForBoot2 = random.nextInt(5) + 1;
        int sumaInCubForBoot = randomForBoot + randomForBoot2;
        int sumaBoot = Math.abs(sumaInCubForBoot - forBoot) * 2;
        int randomForCub = random.nextInt(5) + 1;
        int randomForCub2 = random.nextInt(5) + 1;
        int sumaInCub = randomForCub + randomForCub2;
        int suma = Math.abs(sumaInCub - forUser) * 2;
        if (forUser >= 2 && 12 >= forUser) {
            System.out.println("User rolls the dises...");
            cubUser1(randomForCub);
            cubUser2(randomForCub2);
            System.out.println("you're scope " + sumaInCub + " - abs( " + sumaInCub + " - " + forUser + " ) * 2 \nThis is: " + suma);


            System.out.println("/////////////////////////\nnow turn Boot\nBoot predicted: " + forBoot + "\nBoot rolls the dises...");
            cubBoot1(randomForBoot);
            cubBoot2(randomForBoot2);
            System.out.println("you're scope " + sumaInCubForBoot + " - abs( " + sumaInCubForBoot + " - " + forBoot + " ) * 2 \nThis is: " + sumaBoot);
            finish(suma, sumaBoot);
        } else {
            System.err.println("wrong\nTRY AGAIN");
        }
    }

    //cubUser1
    public static void cubUser1(int randomForCub) {
        switch (randomForCub) {
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

        }
    }

    //cubUser2
    public static void cubUser2(int randomForCub2) {
        switch (randomForCub2) {
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
                System.out.println("+-------+\n| #   # |\n|       |\n| #   # |\n+-------+");
                break;
            case 5:
                System.out.println("+-------+\n| #   # |\n|   #   |\n| #   # |\n+-------+");
                break;
            case 6:
                System.out.println("+-------+\n| #   # |\n| #   # |\n| #   # |\n+-------+");
                break;

        }
    }

    //cubBoot1
    public static void cubBoot1(int randomForBoot) {
        switch (randomForBoot) {
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

        }
    }

    //cubBoot2
    public static void cubBoot2(int randomForBoot2) {
        switch (randomForBoot2) {
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
                System.out.println("+-------+\n| #   # |\n|       |\n| #   # |\n+-------+");
                break;
            case 5:
                System.out.println("+-------+\n| #   # |\n|   #   |\n| #   # |\n+-------+");
                break;
            case 6:
                System.out.println("+-------+\n| #   # |\n| #   # |\n| #   # |\n+-------+");
                break;
        }
    }

    //finish
    public static void finish(int suma, int sumaBoot) {
        int sumaFinish = 0;
        if (suma > sumaBoot) {
            sumaFinish = suma - sumaBoot;
            if (sumaFinish > 0) {
                System.out.println("Winner User\nbecause his point is more so much: " + sumaFinish);
            } else if (sumaFinish < 0) {
                System.out.println("Winner Boot");
            }
        } else if (suma < sumaBoot) {
            sumaFinish = suma - sumaBoot;
            if (sumaFinish > 0) {
                System.out.println("Winner Boot\nbecause his point is more so much: " + sumaFinish);
            } else if (sumaFinish < 0) {
                System.out.println("Winner User");
            }
        } else if (suma == sumaBoot) {
            System.out.println("draw");
            System.out.println("User spoke: " + suma);
            System.out.println("Boot spoke: " + sumaBoot);
        }
    }
}
