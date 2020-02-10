<<<<<<< HEAD:src/LogicalStatements_02/EvenOrOdd.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/EvenOrOdd.java

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
