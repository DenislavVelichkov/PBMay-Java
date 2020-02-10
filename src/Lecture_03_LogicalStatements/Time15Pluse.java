<<<<<<< HEAD:src/LogicalStatements_02/Time15Pluse.java
package LogicalStatements_02;
=======
package Lecture_03_LogicalStatements;
>>>>>>> 77d080e0b93d7123b04324c0ceb84146257b7f6b:src/Lecture_03_LogicalStatements/Time15Pluse.java

import java.util.Scanner;

public class Time15Pluse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hours = Integer.valueOf(scan.nextLine()); // diff between parseInt calls int , valueOf call Integer
        int minutes = Integer.valueOf(scan.nextLine()) + 15;

        if (minutes >= 60){
            hours++;
            minutes = minutes - 60;
            if (hours > 23){
                hours = 0;
            }
        }
        if (minutes < 10){
            System.out.println(hours + ":0" + minutes);
        }else {
            System.out.println(hours + ":" + minutes);
        }
    }
}
