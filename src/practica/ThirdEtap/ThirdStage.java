package practica.ThirdEtap;

import java.util.Random;
import java.util.Scanner;

public class ThirdStage {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        System.out.print("-----<<< Start Game >>>-----\nPredicate amount of points (2 ... 12)\nWrite here: ");
        AllCodeOnOneMethod();
    }
    //All Realization
    public static void AllCodeOnOneMethod(){
        int c = in.nextInt();
        if (c >= 2 && 12 >= c) {
            System.out.println("User rolls the dises...");
            int randomNumbers = random.nextInt(5) + 1;
            int randomNumbers1 = random.nextInt(5) + 1;
            int SumaUser = randomNumbers + randomNumbers1;
            int AllSumaUser = Math.abs(SumaUser - c) * 2;
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
            int bootRnAll = random.nextInt(11) + 1;
            int bootRn = random.nextInt(5) + 1;
            int bootRn1 = random.nextInt(5) + 1;
            int Suma = bootRn + bootRn1;
            int AllSuma = Math.abs(Suma - bootRnAll) * 2;
            System.out.println("///////////////////\nnow turn Boot\nnumber Boot: " + bootRnAll);
            switch (bootRn) {
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
            switch (bootRn1) {
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
            int ofr = 0;
            if (AllSuma > AllSumaUser) {
                ofr = AllSuma - AllSumaUser;
                System.out.println("------Current score------");
                System.out.println("| User: " + AllSumaUser);
                System.out.println("| Boot: " + AllSuma);
                System.out.println("| Boot is ahead by " + ofr + " points!");
                System.out.println("|________________________");
            } else if (AllSuma == AllSumaUser) {
                System.out.println("------Current score------");
                System.out.println("********* Draw **********");
            } else {
                ofr = AllSuma - AllSumaUser;
                System.out.println("------Current score------");
                System.out.println("| User: " + AllSumaUser);
                System.out.println("| Boot: " + AllSuma);
                System.out.println("| User is ahead by " + ofr + " points!");
                System.out.println("|________________________");
            }
            System.out.println("----<< Round 2 >>----");
            int c2 = in.nextInt();
            if (c2 >= 2 && 12 >= c2) {
                System.out.println("User rolls the dises...");
                int randomNumbers2 = random.nextInt(5) + 1;
                int randomNumbers12 = random.nextInt(5) + 1;
                int SumaUser2 = randomNumbers2 + randomNumbers12;
                int AllSumaUser2 = Math.abs(SumaUser2 - c2) * 2;
                switch (randomNumbers2) {
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
                switch (randomNumbers12) {
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
                int bootRnAll2 = random.nextInt(11) + 1;
                int bootRn2 = random.nextInt(5) + 1;
                int bootRn12 = random.nextInt(5) + 1;
                int Suma2 = bootRn2 + bootRn12;
                int allBoot = Math.abs(Suma2 - bootRnAll2) * 2;
                System.out.println("///////////////////\nnow turn Boot\nnumber Boot: " + bootRnAll2);
                switch (bootRn2) {
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
                switch (bootRn12) {
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
                int ofr2 = 0;
                if (allBoot > AllSumaUser2) {
                    ofr2 = allBoot - AllSumaUser2;
                    System.out.println("------Current score------");
                    System.out.println("| User: " + AllSumaUser2);
                    System.out.println("| Boot: " + allBoot);
                    System.out.println("| Boot is ahead by " + ofr2 + " points!");
                    System.out.println("|________________________");
                } else if (allBoot == AllSumaUser2) {
                    System.out.println("------Current score------");
                    System.out.println("********* Draw **********");
                } else {
                    ofr2 = allBoot - AllSumaUser2;
                    System.out.println("------Current score------");
                    System.out.println("| User: " + AllSumaUser2);
                    System.out.println("| Boot: " + allBoot);
                    System.out.println("| User is ahead by " + ofr2 + " points!");
                    System.out.println("|________________________");
                }
                System.out.println("----<< Round 3 >>----");
                int c3 = in.nextInt();
                if (c3 >= 2 && 12 >= c3) {
                    System.out.println("User rolls the dises...");
                    int randomNumbers3 = random.nextInt(5) + 1;
                    int randomNumbers13 = random.nextInt(5) + 1;
                    int SumaUser3 = randomNumbers3 + randomNumbers13;
                    int AllSumaUser3 = Math.abs(SumaUser3 - c3) * 2;
                    switch (randomNumbers3) {
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
                    switch (randomNumbers13) {
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
                    int bootRnAll3 = random.nextInt(11) + 1;
                    int bootRn3 = random.nextInt(5) + 1;
                    int bootRn13 = random.nextInt(5) + 1;
                    int Suma3 = bootRn3 + bootRn13;
                    int AllSuma3 = Math.abs(Suma3 - bootRnAll3) * 2;
                    System.out.println("///////////////////\nnow turn Boot\nnumber Boot: " + bootRnAll3);
                    switch (bootRn3) {
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
                    switch (bootRn13) {
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
                    int ofr3 = 0;
                    if (AllSuma3 > AllSumaUser3) {
                        ofr3 = AllSuma3 - AllSumaUser3;
                        System.out.println("------Current score------");
                        System.out.println("| User: " + AllSumaUser3);
                        System.out.println("| Boot: " + AllSuma3);
                        System.out.println("| Boot is ahead by " + ofr3 + " points!");
                        System.out.println("|________________________");
                    } else if (AllSuma3 == AllSumaUser3) {
                        System.out.println("------Current score------");
                        System.out.println("********* Draw **********");
                    } else {
                        ofr3 = AllSuma3 - AllSumaUser3;
                        System.out.println("------Current score------");
                        System.out.println("| User: " + AllSumaUser3);
                        System.out.println("| Boot: " + AllSuma3);
                        System.out.println("| User is ahead by " + ofr3 + " points!");
                        System.out.println("|________________________");
                    }


                    System.out.println("----------Finish Game-----------");
                    System.out.println("Round | User          | Boot");
                    System.out.println("-------------------------------");
                    System.out.println("      | Predicted: " + c + "         | Predicted: " + bootRnAll);
                    System.out.println(" -1-  | Dice:      " + SumaUser + "     | Dice:    : " + Suma);
                    System.out.println("      | Result:    " + AllSumaUser + "     | Result:  : " + AllSuma);
                    System.out.println("----------------------------------------------------------------");
                    System.out.println("      | Predicted: " + c2 + "     | Predicted:     " + bootRnAll2);
                    System.out.println(" -2-  | Dice:      " + SumaUser2 + "     | Predicted:     " + Suma2);
                    System.out.println("      | Result:    " + AllSumaUser2 + "     | Predicted:     " + allBoot);
                    System.out.println("-----------------------------------------------------------------");
                    System.out.println("      | Predicted: " + c3 + "      | Predicted:    " + bootRn3);
                    System.out.println(" -3-  | Dice:      " + SumaUser3 + "      | Dice:    " + Suma3);
                    System.out.println("      | Result:    " + AllSumaUser3 + "      | Result:    " + AllSuma3);

                    int shUsers = AllSumaUser + AllSumaUser2 + AllSumaUser3;
                    int sheBoot = AllSuma + allBoot + AllSuma3;
                    if (sheBoot < shUsers) {
                        System.out.println("\nUser win " + shUsers + " points!. Congratulations!");
                    } else {
                        System.out.println("\nBoot win " + sheBoot + " points!. Congratulations!");
                    }
                }
            }
        }

    }}

