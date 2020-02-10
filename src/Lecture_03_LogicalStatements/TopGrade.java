<<<<<<< HEAD:src/LogicalStatements_02/TopGrade.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/TopGrade.java

import java.util.Scanner;

public class TopGrade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double grade = Double.parseDouble(scan.nextLine());

        if (grade >= 5.5) {
            System.out.println("Excellent!");
        }

    }
}
