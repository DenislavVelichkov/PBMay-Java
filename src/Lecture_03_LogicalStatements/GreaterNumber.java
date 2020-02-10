<<<<<<< HEAD:src/LogicalStatements_02/GreaterNumber.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/GreaterNumber.java

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        if (a > b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
