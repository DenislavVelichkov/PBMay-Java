package LogicalStatements_02;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                int a =Integer.parseInt(scan.nextLine());
                boolean result = a % 2 == 0;

                if (result){                                  //Provekra za chetno ili nechetno
                    System.out.println("even");

                }else{
                    System.out.println("odd");
                }

            }
        }
