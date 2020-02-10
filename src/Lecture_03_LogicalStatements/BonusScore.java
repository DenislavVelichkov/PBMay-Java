<<<<<<< HEAD:src/LogicalStatements_02/BonusScore.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/BonusScore.java

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double num = Integer.parseInt(scan.nextLine());
        double bonus = 0;

        if (num <= 100){
            bonus += 5;
        }else if (num > 1000){
            bonus = bonus + num * 0.1;
        }else {
            bonus = bonus + num * 0.2;
        }
        if (num % 2 == 0){
            bonus += 1;
        }else if (num % 10 == 5){
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + num);
    }
}
